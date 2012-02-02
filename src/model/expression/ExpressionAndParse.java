package model.expression;

import model.Parser;

public interface ExpressionAndParse extends Expression{
    public abstract void parseAndSetOperands(Parser p);
}
