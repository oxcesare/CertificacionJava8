/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.interfaces.funcionales.dos;

import java.util.function.BiFunction;

/**
 *
 * @author consultor006
 */
public class Main6 {

    public static void main(String[] args) {
        BiFunction<String, String, String> bi = (x, y) -> {
            return x + y;
        };

        System.out.println(bi.apply("java2s.com", " tutorial"));
    }
}
