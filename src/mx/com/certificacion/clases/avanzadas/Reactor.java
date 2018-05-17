/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.clases.avanzadas;

/**
 *
 * @author consultor006
 * 
 * Si extiendes de una interface y esta no sobreescribe 
 * un metodo de la interface padre
 * entonces no puedes acceder a ella.
 */
interface Boiler {

    public void boil();

    public static void shutdown() {
        System.out.println("shutting down");
    }
}

interface Vaporizer extends Boiler {  //1     

    public default void vaporize() {
        boil();
        System.out.println("Vaporized!");
    }
}

public class Reactor implements Vaporizer {

    public void boil() {
        System.out.println("Boiling...");
    }

    public static void main(String[] args) {
        Vaporizer v = new Reactor(); //2        
        v.vaporize(); //3         
        //v.shutdown(); //4    
    }
}
