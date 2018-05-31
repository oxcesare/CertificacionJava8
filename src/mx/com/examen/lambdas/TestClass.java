/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

import java.util.function.*;

/**
 *
 * @author consultor006
 *
 * IntFunction: interface funcional que acepta un integer como parametro y
 * regresa un valor.
 *
 * las interfaces funcionales tambien se pueden mandar como parametros a ciertos
 * métodos.
 */

public class TestClass {

    public static int operate(IntUnaryOperator iuo) {
        return iuo.applyAsInt(5);
    }

    public static void main(String[] args) {
        IntFunction<IntUnaryOperator> fo = a -> b -> a - b;  //1                 
        int x = operate(fo.apply(20)); //2       
        System.out.println(x);
    }
}
