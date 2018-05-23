/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.diez;

/**
 *
 * @author consultor006
 * 
 * En esta clase s esta tratando de demostrar 
 * Que se puede enviar una excepcion del tipo de la clase, 
 * Sin embargo esto genera un error en tiempo de compilacion 
 * 
 * Ademas que un bloque catch con multiples exceptiones declaradas 
 * no se puede poner exception del tipo de la subclase.
 */

public class AhChoo {
    static class SneezeException extends Exception {}
    
    static class SniffleException extends SneezeException  {}
    
    public static void main(String[] args) throws SneezeException {
        try {
            throw new SneezeException();  // Se lanza un nuevo objeto del tipo de exception 
                                          //Personalizada SneezeException
        } catch(Exception e){
        //catch (SneezeException | SneezeException e) { //Se esta enviando la misma exception
        }
    }
}
