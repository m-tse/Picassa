package model.operations;

import model.ParserException;


public class Subtraction extends ExpressionArithmetic{
	public Subtraction(){
		
	}

	@Override
	public double perform(double[] list) {
		if(list.length>2) throw new ParserException("Can only subtract two values.");
		double ans = list[0];
		for(int i = 1;i<list.length;i++){
			ans-=list[i];
		}
		return ans;
	}



}
