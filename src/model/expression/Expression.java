package model.expression;


import model.EvaluatorPackage;
import model.RGBColor;


/**
 * An Expression represents a mathematical expression as a tree.
 * 
 * In this format, the internal nodes represent mathematical 
 * functions and the leaves represent constant values.
 *
 * @author former student solution
 * @author Robert C. Duvall (added comments, some code)
 */
public interface Expression
{


    /**
     * @return string representation of expression
     */

    public abstract RGBColor evaluate(EvaluatorPackage pack);
}
