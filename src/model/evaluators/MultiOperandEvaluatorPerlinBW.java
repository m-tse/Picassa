package model.evaluators;
import model.ParserException;
import model.RGBColor;
import model.util.PerlinNoise;

public class MultiOperandEvaluatorPerlinBW implements MultiOperandEvaluator{

	@Override
	public RGBColor retcolor(String command, RGBColor[] list) {
		if(list.length!=2) throw new ParserException("Can only calculate Perlin Grey Scale from two operands.");
		return PerlinNoise.greyNoise(list[0], list[1]);
	}

}
