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
public class A extends Thread {
    
    public static void main(String[] args) {
        Thread c = new A();
        c.run(); //metodo de la clase padre
        System.out.println(" " );
    }
}
