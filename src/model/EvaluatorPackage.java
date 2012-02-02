package model;

import java.util.LinkedHashMap;
import java.util.Map;

import model.expression.Expression;

public class EvaluatorPackage {
    private double xLoc;
    private double yLoc;
    private double myTime;
    private Map<String, Expression> evalMap;
    
    public EvaluatorPackage(double xvalue, double yvalue, double time, Map<String, Expression> map){
        evalMap=map;
        xLoc = xvalue;
        yLoc = yvalue;
        myTime = time;
    }
    public double getXValue(){
        return xLoc;
    }
    public double getYValue(){
        return yLoc;
    }
    public double getTime(){
        return myTime;
    }
    public Map<String,Expression> getMap(){
        return evalMap;
    }
    public void addAllKeys(Map<String, Expression> map){
        evalMap.putAll(map);
    }
    
    public EvaluatorPackage getCopy(){
        Map<String, Expression> mapCopy = new LinkedHashMap<String, Expression>();
        mapCopy.putAll(evalMap);
        EvaluatorPackage a = new EvaluatorPackage(xLoc, yLoc, myTime, mapCopy);
        return a;
    }
}
