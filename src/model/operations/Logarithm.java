package model.operations;

import model.ParserException;

public class Logarithm extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
		if(list.length!=1) throw new ParserException("Can only find the logarithm of 1 operand");
		return Math.log(list[0]);
	}

}
