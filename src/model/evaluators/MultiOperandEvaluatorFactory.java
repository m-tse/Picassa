package model.evaluators;

import model.ParserException;
import model.operations.*;

public class MultiOperandEvaluatorFactory {
	
	
	public MultiOperandEvaluator getEvaluator(String s){
		if(s.equals("plus")||s.equals("+")) return new Addition();
		else if(s.equals("minus")||s.equals("-")) return new Subtraction();
		else if(s.equals("color")) return new MultiOperandEvaluatorColor();
		else if(s.equals("div")||s.equals("/")) return new Division();
		else if(s.equals("mod")||s.equals("%")) return new Modulus();
		else if(s.equals("multi")||s.equals("*")) return new Multiplication();
		else if(s.equals("neg")||s.equals("!")) return new Negation();
		else if(s.equals("exp")||s.equals("^")) return new Exponent();
		else if(s.equals("abs")) return new AbsoluteValue();
		else if(s.equals("ceil")) return new Ceiling();
		else if(s.equals("floor")) return new Floor();
		else if(s.equals("clamp")) return new Clamp();
		else if(s.equals("wrap")) return new Wrap();
		else if(s.equals("sin")) return new Sine();
		else if(s.equals("cos")) return new Cosine();
		else if(s.equals("tan")) return new Tangent();
		else if(s.equals("atan")) return new ArcTangent();
		else if(s.equals("log")) return new Logarithm();
		else if(s.equals("rgbToYCrCb")) return new MultiOperandEvaluatorRGBtoRCrCb();
		else if(s.equals("yCrCbtoRGB")) return new MultiOperandEvaluatorRGBToYCrCb();
		else if(s.equals("perlinColor")) return new MultiOperandEvaluatorPerlinColor();
		else if(s.equals("perlinBW")) return new MultiOperandEvaluatorPerlinBW();
		else if(s.equals("average")) return new Average();
		else if(s.equals("min")) return new Minimum();
		else if(s.equals("max")) return new Maximum();
		else throw new ParserException("Unrecognized Command "+ s);
		
	}
}
