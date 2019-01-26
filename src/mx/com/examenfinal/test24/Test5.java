/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test24;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase el codigo presentar un error al que querer
 * invocar el metodo forEach para un stream.
 * 
 * Primero recordar que forEach es una operacion terminal.
 * 
 * y la sintaxis correcta para invocar esa operacion terminal es la siguiente:
 * 
 * System.out::println
 * 
 */
public class Test5 {

    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Archie");
        list.add("X-Men");
        
        /**Forma correcta  **/
        list.stream().forEach(System.out::println);
        
         /**Forma incorrecta  **/
        //list.stream().forEach(System.out.println); 
    }
}
