package model.operations;


public class Minimum extends ExpressionArithmetic{

    @Override
    public double perform(double[] list) {
        double mindoub = list[0];
        for(double d:list) if(d<mindoub) mindoub=d;
        return mindoub;
    }

}
