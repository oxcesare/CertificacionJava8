/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.function.Supplier;


/**
 *
 * @author cesaralducinruiz
 */
public class UnaryOperatorDemo {
    
     public static void main(String[] args) {
       List<Integer> list = Arrays.asList(10,20,30,40,50);
       UnaryOperator<Integer> unaryOpt = i->i*i; 
       unaryOperatorFun(unaryOpt, list).forEach(x->System.out.println(x));       
    }
    private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOpt, List<Integer> list){
       List<Integer> uniList = new ArrayList<>();
       list.forEach(i->uniList.add(unaryOpt.apply(i))); 
       return uniList;
    }
    
}
