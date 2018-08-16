/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.interfaces.funcionales.dos;

import java.util.function.Function;

/**
 *
 * @author consultor006
 */
public class Main5 {

    public static void main(String[] args) {
        Function<Integer, String> converter = (i) -> Integer.toString(i);
        System.out.println(converter.apply(3).length());
        System.out.println(converter.apply(30).length());
    }
}
