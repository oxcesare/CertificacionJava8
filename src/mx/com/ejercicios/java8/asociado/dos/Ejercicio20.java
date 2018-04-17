/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.dos;

/**
 *
 * @author consultor006
 * 
 * En esta clase el operador de corto circuito "|" evalua
 * las dos expresiones y al ser la variable str2 vacia manda una exception 
 * nullPointException.
 * 
 * Para que evalue una de las dos condiciones se tiene que colocar el operador
 * de corto circuito doble "||".
 */
public class Ejercicio20 {
    String str1 ="Hello Wordl";
    String str2;
    public static void main(String[] args){
        
        Ejercicio20 q = new Ejercicio20();
        
        if(q.str1.equals("Hello Wordl")||q.str2.equals("")){
            System.out.println(q.str1);
        }else{
            System.out.println(q.str2.concat("Hello"));
        }        
        char c =49;
        System.out.println(c);
                
    }
}
