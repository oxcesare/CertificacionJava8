/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 */
public class TestClassA {

    static int someInt = 10;

    public static int changeIt(int a) {
        a = 20;

        return a;
    }

    public static void main(String[] args) {
        changeIt(someInt);
        System.out.println(someInt);
    }
}
