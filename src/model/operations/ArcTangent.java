package model.operations;

import model.ParserException;

public class ArcTangent extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
		if(list.length!=1) throw new ParserException("Can only find the arctangent of 1 operand");
		return Math.atan(list[0]);
	}

}
