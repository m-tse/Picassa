package model.evaluators;

import model.ParserException;
import model.RGBColor;

public class MultiOperandEvaluatorColor implements MultiOperandEvaluator{
	MultiOperandEvaluatorColor(){
		
	}
	@Override
	public RGBColor retcolor(String command, RGBColor[] list) {
		if(list.length!=3) throw new ParserException("Can only take three color values, R G and B.");
		return new RGBColor(list[0].getRed(),list[1].getRed(),list[2].getRed());
	}


}
