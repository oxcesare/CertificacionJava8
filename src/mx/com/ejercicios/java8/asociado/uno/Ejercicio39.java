/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.uno;

/**
 *
 * @author consultor006
 * 
 * En esta clase la modificacion del StringBuilder es sobre el mismo objeto,
 * por lo tanto se modifica el valor que regresa.
 */
public class Ejercicio39 {
    public static void main(String[] args) {
        Ejercicio39 q = new Ejercicio39();
        StringBuilder sb = new StringBuilder("This");
        q.changeThis(sb);
        System.out.println(sb);                 
    }
   
    /**
     * 
     * @param str 
     * 
     * Se esta regreando el mismo objeto 
     */
    public void changeThis(StringBuilder str){
        System.out.println(str+" ");
        str.delete(0, 4);
        str.append("That");
        
    }
}
