/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.diez;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {
        BinaryOperator<String> bo = (s1, s2) -> s1.concat(s2);
        List<String> names = new ArrayList<>();
        names.add("Bill");
        names.add("George");
        names.add("Obama");
        String finalvalue = names.stream().reduce("Hello : ", bo);
        System.out.println(finalvalue);
    }
}
