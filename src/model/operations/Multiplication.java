package model.operations;

import model.ParserException;

public class Multiplication extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
		if(list.length<2) throw new ParserException("Must multiply at leasttwo values.");
		double retans = 1;
		for(double d:list) retans*=d;
		return retans;
	}



}
