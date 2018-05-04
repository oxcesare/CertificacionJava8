/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.threads;

/**
 *
 * @author consultor006
 */


public class Test extends Thread {

    private static int threadcounter = 0;

    public void run() {
        threadcounter++;
        System.out.println(threadcounter);
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 10; i++) {
            synchronized (Test.class) {
                new Test().start();
            }
        }
    }
}
