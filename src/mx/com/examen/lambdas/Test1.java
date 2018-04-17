/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.concurrent.*;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
/**
 *
 * @author consultor006
 * 
 * Recordar el uso de las interfaces funcionales Predicate que evalua
 * una expresion booleana,  y la interface consumer
 * que toma uno o dos argumentos y retorna otro.
 */
public class Test1 {

    public static void main(String[] args) {
        BiPredicate<String, Integer> bip = (s, i) -> s.length() > i;  //1 
        BiFunction<String, Integer, String> bif = (s, i) -> {  //2   
            if (bip.test(s, i)) { //3       
                return s.substring(0, i);
            } else {
                return s;
            }
        };
        String str = bif.apply("hello world", 5); //4 
        System.out.println(str);
    }
}
