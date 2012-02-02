package model.operations;


public class Average extends ExpressionArithmetic{

    @Override
    public double perform(double[] list) {
        double sum = 0;
        for(double d:list) sum+=d;
        sum= sum/(double) list.length;
        return sum;
    }

}
