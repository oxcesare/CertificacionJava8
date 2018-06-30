/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.interfaces.funcionales.dos;

import java.util.function.BiPredicate;

/**
 *
 * @author consultor006
 */
public class Main4 {

    public static void main(String[] args) {
        BiPredicate<Integer, Integer> bi = (x, y) -> x > y;
        System.out.println(bi.test(2, 3));
    }
}
