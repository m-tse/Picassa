package model.expression;

import model.EvaluatorPackage;
import model.RGBColor;

public class ExpressionVariableX implements Expression{


    @Override
    public RGBColor evaluate(EvaluatorPackage pack) {
        return new RGBColor(pack.getXValue());
    }


}
