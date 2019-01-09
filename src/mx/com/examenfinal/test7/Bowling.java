/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test7;

/**
 *
 * @author cesaralducinruiz
 * 
 * Los bloques staticos tienen preferencia sobre
 * cualquier otro bloque que se declare 
 * 
 * El ultimo en ejecutarse es el bloque 2 que seria el constructor.
 * 
 * De ahí en orden y de acuerdo a la palabra reservada static 
 * 
 * Si nos damos cuenta solo un bloque tiene la palabra reservada.
 * 
 */
public class Bowling {

    {
        System.out.println("Bloque 3");
    }

    public Bowling() {
        System.out.println("Bloque 2");
    }

    static {
        System.out.println("Bloque 1");
    }

    {
     System.out.println("Bloque 4");
    }

    public static void main(String[] args) {
        Bowling bo = new Bowling();

    }
}
