/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.uno;

/**
 *
 * @author consultor006
 */
public abstract class Reactor implements Vaporizer {

    public void boil() {
        System.out.println("Boiling...");
    }

    public static void main(String[] args) {
        Vaporizer v = new Reactor(); //2         
        v.vaporize(); //3         
        v.shutdown2(); //4    
    } 
}
