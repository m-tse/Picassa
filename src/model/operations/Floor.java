package model.operations;

import model.ParserException;

public class Floor extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
		if(list.length!=1) throw new ParserException("Can only floor one value");
		return Math.floor(list[0]);
	}
	
}
