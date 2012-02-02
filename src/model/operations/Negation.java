package model.operations;

import model.ParserException;

public class Negation extends ExpressionArithmetic{
	public Negation(){
		
	}
	@Override
	public double perform(double[] list) {
		if(list.length>1) throw new ParserException("Can only negate one value.");
		return -list[0];
	}


}
