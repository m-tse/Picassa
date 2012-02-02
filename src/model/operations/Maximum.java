package model.operations;

public class Maximum extends ExpressionArithmetic{

    @Override
    public double perform(double[] list) {
        double maxdoub = list[0];
        for(double d:list) if(d>maxdoub) maxdoub=d;
        return maxdoub;
    }

}
