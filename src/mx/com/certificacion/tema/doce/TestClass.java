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
 * Esta clase crea dos hilos, y ambos estan intentado acceder
 * a la misma variable, por lo tanto no se puede determinar el valor
 * que va a imprimir. 
 */
public class TestClass implements Runnable {

    volatile int x;

    public void run() {
        x = 5;
    }

    public static void main(String[] args) {
        TestClass tc = new TestClass();
        tc.x = 10;
        new Thread(tc).start(); // 1       
        System.out.println(tc.x); 
    }  

} 

