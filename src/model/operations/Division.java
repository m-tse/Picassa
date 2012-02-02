package model.operations;

import model.ParserException;

public class Division extends ExpressionArithmetic{
	public Division(){
		
	}
	@Override
	public double perform(double[] list) {
		if(list.length>2) throw new ParserException("Can only divide two values.");
		double dividend = list[0];
		for(int i = 1;i<list.length;i++){
			dividend=dividend/list[i];
		}
		return dividend;
	}


}
