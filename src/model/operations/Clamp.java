package model.operations;

import model.ParserException;

public class Clamp extends ExpressionArithmetic{
    private static final double COLOR_MIN = -1;
    private static final double COLOR_MAX = 1;
	@Override
	public double perform(double[] list) {
		if(list.length!=1) throw new ParserException("clamp only acts upon one operand");
		 return Math.max(COLOR_MIN, Math.min(COLOR_MAX, list[0]));
		
	}

}