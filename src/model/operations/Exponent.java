package model.operations;

import model.ParserException;

public class Exponent extends ExpressionArithmetic{
	public Exponent(){
		
	}
	@Override
	public double perform(double[] list) {
		if(list.length>2) throw new ParserException("Can only exponentiate two values.");
		double ans = list[0];
		for(int i = 0;i<list.length;i++){
			ans=Math.pow(ans, list[i]);
		}
		return ans;
	}


}
