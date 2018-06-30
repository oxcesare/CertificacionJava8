/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.interfaces.funcionales.dos;

import java.util.function.BinaryOperator;
import java.util.Comparator;
/**
 *
 * @author consultor006
 */
public class Main8 {

    public static void main(String[] args) {
        BinaryOperator<Integer> adder = (n1, n2) -> n1 + n2;
        System.out.println(adder.apply(3, 4));
        
        System.out.println("*******************************");
        BinaryOperator<Integer> bi = BinaryOperator.minBy(Comparator.reverseOrder());
        
    }
}
