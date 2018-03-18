/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.interfaces.funcionales;

import java.util.function.Supplier;

/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {

        Supplier<String> i = () -> "Obtiene el elemento que se asigno a la interface";
        System.out.println(i.get());

    }

}
