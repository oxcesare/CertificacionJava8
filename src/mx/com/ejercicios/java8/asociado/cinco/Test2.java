/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 * Uso del envio de parametros, a traves de la linea de comandos 
 * 
 * Este ejercicio manda un error debido  a que lo que se esta enviando 
 * a traves de los parametros lleva espacios y cuando se envian de esta manera
 * se toman como parametros independientes.
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println(args[1]);
    }
    
}
