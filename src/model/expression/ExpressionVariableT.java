package model.expression;


import model.EvaluatorPackage;
import model.RGBColor;

public class ExpressionVariableT implements Expression{


    @Override
    public RGBColor evaluate(EvaluatorPackage pack) {
        return new RGBColor(pack.getTime());
    }

}
