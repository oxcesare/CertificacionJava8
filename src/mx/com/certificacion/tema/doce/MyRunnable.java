/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.doce;

/**
 *
 * @author consultor006
 */
public class MyRunnable implements Runnable {

    public static void main(String[] args) {
        new Thread(new MyRunnable()).start();
        System.out.println("**************************");
        MyRunnable my = new MyRunnable();
        my.run(2);
                
    }
    public void run (){
        System.out.println("Metodo Run de Runnable");
    }
    public void run(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }
}
