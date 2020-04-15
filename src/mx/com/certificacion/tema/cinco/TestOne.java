/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cinco;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleFunction;
import java.util.function.Function;


/**
 *
 * @author cesaralducinruiz
 */
public class TestOne {

    public static void main(String[] args) {

   
        List<Double> dList = Arrays.asList(10.0, 12.0); 
        DoubleFunction df = x -> x + 10;
        
        dList.stream().forEach(d -> df.apply(d));
        dList.stream().forEach(d -> System.out.println(d));
        
        Function<String, Integer> f1 = String::length;
        
        Function<String, Integer> f2 = x -> x.length();

        System.out.println(":"+f1.apply("1234"));
        System.out.println(":"+f2.apply("1234"));
        
        Function<String, String> f3 = TOne2::m2;
        
        System.out.println(""+f3.apply("1"));
    }
}

final class TOne2 {
    public static String m2(String v) {
        return v+"2";
    }
    
  
}
