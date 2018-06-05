/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas.dos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author consultor006
 * 
 
 */
public class Test1 {

    Map<String, List<Double>> groupedValues = new HashMap<>();
    
    public static void main(String[] args) {
        
    }

    public void processUno(String name, Double value) {
        List<Double> values = groupedValues.get(name);
        if (values == null) {
            values = new ArrayList<Double>();
            groupedValues.put(name, values);
        }
        values.add(value);
        
            
    }

    public void processDos(String name, Double value) {
        groupedValues.computeIfPresent(name, (a, b) -> new ArrayList<Double>()).add(value);
  
    }
    
         
}
