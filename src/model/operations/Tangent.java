package model.operations;

import model.ParserException;

public class Tangent extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
		if(list.length!=1) throw new ParserException("Can only find the tangent of 1 oeprand.");
		return Math.tan(list[0]);
	}

}
