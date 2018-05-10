/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis.Exceptions;

/**
 *
 * @author consultor006
 */
class A extends Thread {

    static protected int i = 0;

    public void run() {
        for (; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}

public class TestClass {

    public void run() {
        for (; i < 5; i++) {
            System.out.println("World");
        }
    }

    public static void main(String args[]) {
        Thread t1 = new A();
        Thread t2 = new TestClass();
        t2.start();
        t1.start();
    }

}
