/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.interfaces.funcionales.dos;

import java.util.function.UnaryOperator;

/**
 *
 * @author consultor006
 */
public class Main7 {

    public static void main(String[] args) {
        UnaryOperator<String> i = (x) -> x.toUpperCase();

        System.out.println(i.apply("java2s.com"));
    }
}
