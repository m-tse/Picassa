package model;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Pattern;
import model.expression.*;

public class CreateParseMap {

	public Map<Pattern, ExpressionAndParse> ParseMap() {
	    Pattern DOUBLE_REGEX = Pattern.compile("(\\-?([0-9]+)?(\\.[0-9]+)?)|(\\.[0-9]+)");
	    Pattern EXPRESSION_BEGIN_REGEX = Pattern.compile("\\(([a-zA-Z\\-\\+\\*\\/\\%\\^\\!]+)");
	    Pattern LET = Pattern.compile("\\(let ([a-zA-Z]+)");  //fix this so 3rd part can start/end with parens  // 
	    Pattern IF = Pattern.compile("\\(if");
	    
		Map<Pattern, ExpressionAndParse> myMap = new LinkedHashMap<Pattern, ExpressionAndParse>();
	      myMap.put(IF, new ExpressionConditional());
	    myMap.put(LET, new ExpressionLet());  //let must go first, so it gets evaluated before Expression begin regex
		myMap.put(DOUBLE_REGEX, new ExpressionDouble());
		myMap.put(EXPRESSION_BEGIN_REGEX, new ExpressionMultiOperand());


		return myMap;

	}
}
