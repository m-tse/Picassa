package model;

import java.util.HashMap;
import model.expression.*;
import java.util.Map;


public class CreateModelMap {  //not working yet
    public Map<String, Expression> createMap(){
        HashMap<String, Expression> myMap = new HashMap<String, Expression>();
        myMap.put("x", new ExpressionVariableX());
        myMap.put("y", new ExpressionVariableY());
        myMap.put("random", new ExpressionRandomColor());
        myMap.put("t", new ExpressionVariableT());
        
        return myMap;
    }
}
