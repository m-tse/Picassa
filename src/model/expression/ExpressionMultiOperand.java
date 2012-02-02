package model.expression;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;

import model.EvaluatorPackage;
import model.Parser;
import model.ParserException;
import model.RGBColor;
import model.evaluators.MultiOperandEvaluator;
import model.evaluators.MultiOperandEvaluatorFactory;

public class ExpressionMultiOperand implements ExpressionAndParse {
	private String commandstring;
	private Expression[] operandarray;

	public void setCommand(String s){
		commandstring = s;
	}

	public RGBColor evaluate(EvaluatorPackage pack) {
		RGBColor[] list = new RGBColor[operandarray.length];
		for (int i = 0; i < operandarray.length; i++) {
			list[i] = operandarray[i].evaluate(pack);
		}
		
		MultiOperandEvaluatorFactory Mapcreator = new MultiOperandEvaluatorFactory();
		MultiOperandEvaluator eval = Mapcreator.getEvaluator(commandstring); 
		return eval.retcolor(commandstring, list);
	}



    @Override
    public void parseAndSetOperands(Parser p) {
        
        String commandName = p.PatternString().substring(1);
        ArrayList<Expression> explist = new ArrayList<Expression>();
        while (p.currentCharacter() != ')') {

            p.skipWhiteSpace();
            Expression newexp = p.parseExpression();
            explist.add(newexp);
            if(!p.notAtEndOfString()){
                throw new ParserException("Expected closing parenthesis at "+p.getCurrentPosition());
            }
        }
        p.incrementCurrentPosition(1);
        Expression[] exparray = new Expression[explist.size()];
        explist.toArray(exparray);
        operandarray = exparray;
        commandstring= commandName;
    }



}
