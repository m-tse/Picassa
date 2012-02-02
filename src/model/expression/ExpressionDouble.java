package model.expression;

import model.EvaluatorPackage;
import model.Parser;
import model.RGBColor;

public class ExpressionDouble implements ExpressionAndParse {
	private double myValue;




    @Override
    public void parseAndSetOperands(Parser p) {
        myValue = Double.parseDouble(p.PatternString());
    }


    @Override
    public RGBColor evaluate(EvaluatorPackage a) {
        return new RGBColor(myValue);
    }

}
