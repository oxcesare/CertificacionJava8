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
class MyClass implements Runnable {

    int n = 0;

    public MyClass(int n) {
        this.n = n;
    }
    
    public static void main(String[] args) {
        new MyClass(2).run();
        new MyClass(1).run();
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }
}