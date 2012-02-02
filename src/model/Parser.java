package model;

import model.expression.*;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {
    private int myCurrentPosition;
    private String myInput;
    private Pattern myPattern;
    private Map<Pattern, ExpressionAndParse> myMap;

    /**
     * Converts given string into expression tree.
     * 
     * @param input
     *            expression given in the language to be parsed
     * @return expression tree representing the given formula
     */
    public Expression makeExpression(String input) {


        myInput = input;
        myCurrentPosition = 0;
        Expression result = parseExpression();
        skipWhiteSpace();
        if (notAtEndOfString()) {
            throw new ParserException(
                    "Unexpected characters at end of the string: "
                            + myInput.substring(myCurrentPosition),
                    ParserException.Type.EXTRA_CHARACTERS);
        }
        return result;
    }

    public Expression parseExpression() {
        skipWhiteSpace();
        CreateParseMap mapcreator = new CreateParseMap();
        myMap = mapcreator.ParseMap();
        for (java.util.Map.Entry<Pattern, ExpressionAndParse> entry : myMap.entrySet()) {
            if (isThisPattern(entry.getKey())) {
                myPattern = entry.getKey();
                ExpressionAndParse e = entry.getValue();
                e.parseAndSetOperands(this);
                return e;
            }
        }
        int leftvalue = myCurrentPosition;
        while(notAtEndOfString()&&myInput.charAt(myCurrentPosition)!=')'&&myInput.charAt(myCurrentPosition)!=' '){
            myCurrentPosition++;
        }
        String unrecognizedString = myInput.substring(leftvalue, myCurrentPosition);
        return new ExpressionVariable(unrecognizedString);
    }

    public boolean isThisPattern(Pattern regex) {
        Matcher matcher = regex.matcher(myInput.substring(myCurrentPosition));
        return matcher.lookingAt();
    }

    public String PatternString() {
        Matcher doubleMatcher = myPattern.matcher(myInput);
        doubleMatcher.find(myCurrentPosition);
        String numberMatch = myInput.substring(doubleMatcher.start(),
                doubleMatcher.end());
        myCurrentPosition = doubleMatcher.end();
        return numberMatch;
    }


    public void skipWhiteSpace() {
        while (notAtEndOfString() && Character.isWhitespace(currentCharacter())) {
            myCurrentPosition++;
        }
    }

    public char currentCharacter() {
        return myInput.charAt(myCurrentPosition);
    }

    public boolean notAtEndOfString() {
        return myCurrentPosition < myInput.length();
    }
    public int getCurrentPosition(){
        return myCurrentPosition;
    }
    public void incrementCurrentPosition(int n){
        myCurrentPosition+=n;
    }
}
