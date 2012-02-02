package model.expression;


import model.EvaluatorPackage;
import model.Parser;
import model.RGBColor;

public class ExpressionConditional implements ExpressionAndParse

{
    private Expression ConditionalExp; 
    private Expression toEvaluateOne;
    private Expression toEvaluateTwo;
    @Override
    public RGBColor evaluate(EvaluatorPackage pack) {
        if(getAverage(ConditionalExp.evaluate(pack))>0) return toEvaluateOne.evaluate(pack);
        else return toEvaluateTwo.evaluate(pack);

    }

    public void parseAndSetOperands(Parser p) {
        String passString=p.PatternString().substring(1);//dummy just to update location
        
        
        
        p.skipWhiteSpace();
        ConditionalExp = p.parseExpression();
        p.incrementCurrentPosition(1);
        
        toEvaluateOne = p.parseExpression();
        p.incrementCurrentPosition(1);
        
        toEvaluateTwo=p.parseExpression();
        p.incrementCurrentPosition(1);
        
        
    }
    
    private double getAverage(RGBColor color){
        return (color.getRed()+color.getBlue()+color.getGreen())/(3.0);
    }



}
