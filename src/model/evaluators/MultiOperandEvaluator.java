package model.evaluators;

import model.RGBColor;

public interface MultiOperandEvaluator {
	
	public abstract RGBColor retcolor(String command, RGBColor[] list);
}
