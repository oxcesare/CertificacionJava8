/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.interfaces.funcionales.dos;

import java.util.function.Supplier;

/**
 *
 * @author consultor006
 */
public class Main {

    public static void main(String[] args) {
        Supplier<String> i = () -> "java2s.com";
        System.out.println(i.get());
    }
}
