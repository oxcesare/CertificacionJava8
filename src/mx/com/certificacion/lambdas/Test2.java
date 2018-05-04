/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

import java.util.*;
import java.util.stream.Stream;
import java.util.function.*;

/**
 *
 * @author consultor006
 *
 * Ejercicios Expresiones lambda e interfaces funcionales
 */
public class Test2 {

    public static void main(String[] args) {
        List<Integer> str = Arrays.asList(1, 2, 3, 4);
        str.stream().filter(x -> {
            System.out.print(x + " ");
            return x > 2;
        });

        System.out.println("*****************************************");
    }

    public void m() {
        String val1 = "hello";
        StringBuilder val2 = new StringBuilder("world");
        UnaryOperator<String> uo1 = s1 -> s1.concat(val1); //1        
        UnaryOperator<String> uo2 = s -> s.toUpperCase(); //2         
        //System.out.println(uo1.apply(uo2.apply(val2))); //3 //Manda error porque StringBuilder no 
        //Es posible meterlo en un System.out.println ya que recibe un String.
    }

    public static void imprimeBOB() {
        String name = "bob";
        String val = null; 
        //Insert code here 
        
        Supplier<String> s = name::toUpperCase; val = s.get();
        System.out.print(val); 
        
    }
}
