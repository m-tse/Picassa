package model.operations;


import model.RGBColor;
import model.evaluators.MultiOperandEvaluator;

public abstract class ExpressionArithmetic implements MultiOperandEvaluator{

	public ExpressionArithmetic(){

	}
	public RGBColor retcolor(String command, RGBColor[] list){
		double retred = 0;
		double retgreen = 0;
		double retblue = 0;
		double[] redvalues = new double[list.length];
		double[] greenvalues = new double[list.length];
		double[] bluevalues = new double[list.length];
		for(int i = 0;i<list.length;i++){
			redvalues[i]=list[i].getRed();
			greenvalues[i]=list[i].getGreen();
			bluevalues[i]=list[i].getBlue();
		}
		
		retred=perform(redvalues);
		retgreen=perform(greenvalues);
		retblue=perform(bluevalues);

		
		return new RGBColor(retred, retgreen, retblue);
		
	}
	
	public abstract double perform(double[] list);
	
}
