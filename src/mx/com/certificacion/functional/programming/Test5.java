/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.functional.programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author consultor006
 */
public class Test5 {

    public static void main(String[] args) {
        List<Integer> ls = Arrays.asList(3, 4, 6, 9, 2, 5, 7);
        System.out.println(ls.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b)); //1 
        System.out.println(ls.stream().max(Integer::max).get()); //2 
        System.out.println(ls.stream().max(Integer::compare).get()); //3 
        System.out.println(ls.stream().max((a, b) -> a > b ? a : b)); //4

        System.out.println("*******************************************************************");

        List<StringBuilder> messages = Arrays.asList(new StringBuilder(), new StringBuilder());
        messages.stream().forEach(s -> s.append("helloworld"));
        messages.forEach(s -> {
            s.insert(5, ",");
            System.out.println(s);
        });

        System.out.println("*********************************************************************");

        List<Integer> str = Arrays.asList(1, 2, 3, 4);
        str.stream().filter(x -> {
            System.out.print(x + " ");
            return x > 2;
        });

        System.out.println("************************************************************************");

        BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
        List<String> names = new ArrayList<>();
        names.add("Bill");
        names.add("George");
        names.add("Obama");
        String finalvalue = names.stream().reduce("Hello : ", bo);
        System.out.println(finalvalue);
        
        //el metodo reduce en java 8 es para reducir operaciones 
        //en base a ciertos criterios.
    }
    
    public void mensaje(){
        System.out.println("Método core mensaje");
    }
}
