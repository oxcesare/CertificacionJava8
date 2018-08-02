/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.quince;

/**
 *
 * @author consultor006
 */
class MyRunnable implements Runnable {

    MyRunnable(String name) {
        new Thread(this, name).start(); //inicializa un objeto Thread, en el constructor de la clase. 
    }

    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class TestClassThree {

    public static void main(String[] args) {
        Thread.currentThread().setName("First");
        MyRunnable mr = new MyRunnable("MyRunnable");
        mr.run();
        Thread.currentThread().setName("Second");
        mr.run();
    }

}
