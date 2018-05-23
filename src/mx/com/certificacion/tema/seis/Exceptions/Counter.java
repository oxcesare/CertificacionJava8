/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis.Exceptions;

/**
 *
 * @author consultor006
 * Una clase abstracta no se puede instanciar.
 */
public class Counter {

    public int startHere = 1;
    public int endHere = 100;

    public static void main(String[] args) {
        new Counter().go();
    }

    void go() {
       
        //Runnable a = new Runnable(); //Runnable no se puede instanciar                
        //Thread t = new Thread(a);
        //t.start();
    }
}
