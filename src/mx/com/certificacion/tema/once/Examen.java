/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.once;

/**
 *
 * @author consultor006
 * 
 * En la jerarquía de Exception al ser capturado el error
 * en el bloque try-catch este genera que se invoque la exception 
 * "The Exception was caugth here"
 */

public class Examen {
    public static void main(String[] args) {
        Examen ex = new Examen();
        ex.subMethod();
    }    
    public void subMethod(){
        try {
            subMethod2();
        } catch (Exception e) {
            System.out.println("The Exception was caugth here");
        }
    }    
    public void subMethod2(){
        throw new ArrayIndexOutOfBoundsException();
    }
}
