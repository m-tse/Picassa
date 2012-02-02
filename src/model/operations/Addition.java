package model.operations;
import model.ParserException;

public class Addition extends ExpressionArithmetic{

	@Override
	public double perform(double[] list) {
//		if(list.length>2) throw new ParserException("Can only add two values.");
	    if(list.length<=1) throw new ParserException("Must add at least two values");
		double answer = list[0];
		for(int i = 1;i<list.length;i++){
			answer+=list[i];
		}
		return answer;
	}


}
