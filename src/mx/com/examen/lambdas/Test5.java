/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author consultor006
 *
 * Which of the following implementations correctly makes use of the Java 8
 * functional interfaces to achieve the same?
 * 
 * public void process(String name, Double value){   
 * groupedValues.computeIfAbsent(name,
 * (a)->new ArrayList<Double>()).add(value); } 
 *
 *
 */
public class Test5 {

    Map<String, List<Double>> groupedValues = new HashMap<>();

    public static void main(String[] args) {

    }

    public void process(String name, Double value) {
        List<Double> values = groupedValues.get(name);
        if (values == null) {
            values = new ArrayList<Double>();
            groupedValues.put(name, values);
        }
        values.add(value);
    }

}
