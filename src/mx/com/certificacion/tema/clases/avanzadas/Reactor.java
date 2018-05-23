/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 * 
 * Un objeto abstracto no se puede asignar a un objeto no abstracto
 * 
 * Un objeto de una interface no se puede asignar a otro objeto 
 * de otra interface. 
 */
public abstract class Reactor implements Vaporizer {

    public void boil() {
        System.out.println("Boiling...");
    }

    public static void main(String[] args) {
       // Vaporizer v = new Reactor(); //2         
        //v.vaporize(); //3         
        //sv.shutdown2(); //4    
    } 
}
