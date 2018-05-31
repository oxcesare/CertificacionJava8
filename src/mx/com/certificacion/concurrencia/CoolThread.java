/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.concurrencia;

/**
 *
 * @author consultor006
 */
class CoolThread extends Thread {

    String id = "";

    public CoolThread(String s) {
        this.id = s;
    }

    public void run() {
        System.out.println(id + " End");
    }

    public static void main(String args[]) {
        Thread t1 = new CoolThread("AAA");
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new CoolThread("BBB");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
