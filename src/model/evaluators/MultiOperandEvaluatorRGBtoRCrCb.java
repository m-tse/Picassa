package model.evaluators;

import model.ParserException;
import model.RGBColor;

public class MultiOperandEvaluatorRGBtoRCrCb implements MultiOperandEvaluator {

	@Override
	public RGBColor retcolor(String command, RGBColor[] list) {
		if (list.length != 1)
			throw new ParserException(
					"Can only convert to luminance/chrominance with 1 operand.");
		RGBColor c = list[0];
		return new RGBColor(c.getRed() * 0.2989 + c.getGreen() * 0.5866
				+ c.getBlue() * 0.1145, c.getRed() * -0.1687 + c.getGreen()
				* -0.3312 + c.getBlue() * 0.5, c.getRed() * 0.5000
				+ c.getGreen() * -0.4183 + c.getBlue() * -0.0816);
	}
}
