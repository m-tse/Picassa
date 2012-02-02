package model.expression;

import java.util.HashMap;
import java.util.Map;

import model.EvaluatorPackage;
import model.Parser;
import model.ParserException;
import model.RGBColor;

public class ExpressionLet implements ExpressionAndParse{
    Expression toEvaluate;
    Map<String, Expression> expressionVariableMap;



    @Override
    public void parseAndSetOperands(Parser p) {
        String passString=p.PatternString().substring(1);
        String[] passStringSplit = passString.split(" ");
        if(passStringSplit.length!=2) throw new ParserException("Can only take a variable, and then an operand for a let statement");
        String variableName = passStringSplit[1];
        
        Expression VariableValue = p.parseExpression();
        
        toEvaluate = p.parseExpression();
        p.incrementCurrentPosition(1);
        p.skipWhiteSpace();
        
        expressionVariableMap = new HashMap<String, Expression>();
        expressionVariableMap.put(variableName, VariableValue);
    }

    @Override
    public RGBColor evaluate(EvaluatorPackage pack) {
        EvaluatorPackage copy = pack.getCopy();
        copy.addAllKeys(expressionVariableMap);
        return toEvaluate.evaluate(copy);
    }

}
