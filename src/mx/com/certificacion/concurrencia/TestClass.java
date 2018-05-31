/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.concurrencia;

/**
 *
 * @author consultor006
 * 
 * En esta clase  se imprimen primero los valores del System.out.println
 * 
 * y después la ejecucción del hilo. 
 */
public class TestClass extends Thread {

    public void run() {
        for (;;);
    }
    public static void main(String args[]) {
        System.out.println("Starting Main");
        new TestClass().start();
        System.out.println("Main returns");
        System.out.println("Otro System");
    }
}
