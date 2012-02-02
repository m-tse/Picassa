package model.expression;

import java.util.Random;

import model.EvaluatorPackage;
import model.RGBColor;

public class ExpressionRandomColor implements Expression{

	@Override
	public RGBColor evaluate(EvaluatorPackage pack) {
		Random a = new Random();
		double randRed = a.nextDouble();
		double randGreen = a.nextDouble();
		double randBlue = a.nextDouble();
		if(a.nextBoolean()) randRed*=-1;
		if(a.nextBoolean()) randGreen*=-1;
		if(a.nextBoolean()) randBlue*=-1;
		return new RGBColor(randRed, randGreen, randBlue);
	}



}
