package model.operations;

import model.ParserException;

public class Cosine extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
		if(list.length!=1) throw new ParserException("Can only find the cosine of 1 operand");
		return Math.cos(list[0]);
	}

}
