package model.operations;

import model.ParserException;

public class AbsoluteValue extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
		if(list.length!=1) throw new ParserException("Can only find the absolute value of 1 operand");
		return Math.abs(list[0]);
	}

}
