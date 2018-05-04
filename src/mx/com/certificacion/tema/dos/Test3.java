/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.dos;

/**
 *
 * @author consultor006
 * 
 *  How many Thread objects are created by the above program when it is compiled and run?
 * 
 * Se crean dos objetos: tc y el que se crea cuando se instancia a Thread. 
 */
public class Test3
        extends Thread {

    class Runner implements Runnable {

        public void run() {
            Thread[] t = new Thread[5];
            for (int i = 0; i < t.length; i++) {
                System.out.println(t[i]);
            }
        }
    }

    public static void main(String args[]) throws Exception {
        Test3 tc = new Test3();
        new Thread(tc.new Runner()).start();
    }
}
