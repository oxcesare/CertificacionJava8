/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 *
 * @author consultor006
 */
public class UnaryOperatorDemo {

    public static void main(String[] args) {
        
        /**
         * Invoco al metodo que recibe un UnaryOperator y una lista de Integer
         * y la recorro
         */
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        UnaryOperator<Integer> unaryOpt = i -> i * i; // regresa una sola operacion 
        unaryOperatorFun(unaryOpt, list).forEach(x -> System.out.println(x)); 
    }

    private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOpt, List<Integer> list) {
        List<Integer> uniList = new ArrayList<>();
        list.forEach(i -> uniList.add(unaryOpt.apply(i)));
        return uniList;
    }

}
