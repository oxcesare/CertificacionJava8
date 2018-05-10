/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete.Concurrency;

/**
 *
 * @author consultor006 
 * 
 * La maquina virtual  de Java ejecuta un hilo y de ahi los que uno mismo vaya creando
 * 
 * En esta clase el hilo intenta accesar a la variable X y el método
 * System.out.println tambien intenta hacerlo, por lo que no es posible
 * determinar el resultado.
 * 
 */
public class TestClassTwo implements Runnable {

    volatile int x;

    public void run() {
        x = 5;
    }
    public static void main(String[] args) {
        TestClassTwo tc = new TestClassTwo();
        tc.x = 10;
        new Thread(tc).start(); // 1       
        System.out.println(tc.x);   
    }  

}
