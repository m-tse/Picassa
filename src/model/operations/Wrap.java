package model.operations;

import model.ParserException;

public class Wrap extends ExpressionArithmetic{
    private static final double COLOR_MIN = -1;
    private static final double COLOR_MAX = 1;
	@Override
	public double perform(double[] list) {
		if(list.length!=1)throw new ParserException("Can only wrap one operand");
		return wrap(list[0]);
	}
    private double wrap (double value)
    {
        double range = COLOR_MAX - COLOR_MIN;
        value %= range;
        if (value > COLOR_MAX)      return value - range;
        else if (value < COLOR_MIN) return value + range;
        else                        return value;
    }

}
