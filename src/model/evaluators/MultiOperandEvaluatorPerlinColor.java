package model.evaluators;
import model.ParserException;
import model.RGBColor;
import model.util.PerlinNoise;

public class MultiOperandEvaluatorPerlinColor implements MultiOperandEvaluator{

	@Override
	public RGBColor retcolor(String command, RGBColor[] list) {
		if(list.length!=2) throw new ParserException("Can only create PerlinColor from two operands");
		return PerlinNoise.colorNoise(list[0],list[1]);
	}

}
