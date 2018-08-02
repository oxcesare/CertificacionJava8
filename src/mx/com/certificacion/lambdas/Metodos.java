/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.lambdas;

/**
 *
 * @author consultor006
 * 
 * La clase Metodos contiene la aplicacion  y creacion de dos objetos 
 * Si igualamos un objeto creado con otro entonces son los mismos objetos
 * 
 * Si creamos una nueva referencia de objetos entonces son diferentes.
 * 
 * El metodo equals lo que compara es el contenido de la cadena. 
 * 
 * Si pasamos como referencia el objeto s1 al nuevo objejto S2 lo que en realidad
 * pasamos es la referencia de este y para este ejemplo su valor es "Canada".
 * 
 * Sin embargo como solo pasa su referencia decimos que son dos objetos diferentes. 
 */
public class Metodos {
    public static void main(String[] args) {
        String s1 ="Canada";
        String s2 = new String("Canada");
        if(s1==s2) System.out.println("s1==s2");
        if(s1.equals(s2)) System.out.println("s1.equals.s2");
    }   
}
