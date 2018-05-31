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
public class Worker implements Runnable {

    Thread w;

    public void start() {
        w = new Thread(this);
    }

    public void run() {
        System.out.println(" Working...");
    }
    /* lot of code */ 
    
    public static void main(String[] args) {
        Worker  w = new Worker();
        w.start();
                
    }

}
