package model.evaluators;

import model.ParserException;
import model.RGBColor;

public class MultiOperandEvaluatorRGBToYCrCb implements MultiOperandEvaluator{

	@Override
	public RGBColor retcolor(String command, RGBColor[] list) {
		if(list.length!=1) throw new ParserException("Can only convert to luminance/chrominance from 1 operand");
		RGBColor c = list[0];
		return new RGBColor(
                c.getRed() + c.getBlue() *  1.4022,
                c.getRed() + c.getGreen() * -0.3456 + c.getBlue() * -0.7145,
                c.getRed() + c.getGreen() *  1.7710);
	}

}
