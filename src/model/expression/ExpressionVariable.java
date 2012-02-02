package model.expression;

import java.util.Map;

import model.EvaluatorPackage;
import model.ParserException;
import model.RGBColor;

public class ExpressionVariable implements Expression{
    String variableName;
    public ExpressionVariable(String varname){
        variableName=varname;
        
    }








    @Override
    public RGBColor evaluate(EvaluatorPackage pack) {
        Map<String, Expression> VarExpMap = pack.getMap();
        for(String s:VarExpMap.keySet()) if(variableName.equals(s)) return VarExpMap.get(s).evaluate(pack);
        throw new ParserException("Unrecognized variablename "+ variableName);
    }

}
