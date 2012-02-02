package model.operations;

import model.ParserException;

public class Modulus extends ExpressionArithmetic{
	public Modulus(){
		
	}
	@Override
	public double perform(double[] list) {
		if(list.length>2) throw new ParserException("Can only find the modulus of two values.");
		return list[0]%list[1];
	}


}
