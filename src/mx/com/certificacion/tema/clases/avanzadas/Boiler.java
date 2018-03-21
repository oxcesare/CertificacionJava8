/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 */
public interface Boiler {

    public void boil();
    public void shutdown2();

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
