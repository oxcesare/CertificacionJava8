/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.doce;

/**
 *
 * @author consultor006
 * 
 * Implementación del método run de Runnable y propio de la clase,
 * 
 * Recordar que si el método run tiene parámetros ya no es de Runnble
 * y forzamente nos pde implementar el de runnable
 */
public class MyRunnable implements Runnable {

    public static void main(String[] args) {
        new Thread(new MyRunnable()).start(); //Se crea un objeto Thread pasandole como parámetro un Runnable
        System.out.println("**************************");
        MyRunnable my = new MyRunnable();
        my.run(2); //Se invoca al método run con parámetros                
    }    
    public void run (){
        System.out.println("Runnable");
    }    
    public void run(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hello World");
        }
    }
}
