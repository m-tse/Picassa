package model.operations;

import model.ParserException;

public class Sine extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
		if(list.length!=1) throw new ParserException("Can only find the sine of 1 operand");
		return Math.sin(list[0]);
		
	}

}
