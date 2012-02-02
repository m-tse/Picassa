package model.operations;

import model.ParserException;

public class Ceiling extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
		if(list.length!=1) throw new ParserException("Can only round up one value");
		return Math.ceil(list[0]);
	}

}
