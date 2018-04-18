/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.tres;

/**
 *
 * @author consultor006
 * 
 * Uso de evaluar el contenido de un objeto.
 * 
 * un int es igual al contenido de un short siempre y cuando 
 * quepa dentro del valor de este. 
 */
public class Test7 {
    
    static int i=0;
    static short s=0;
    static byte b =0;
    static double d=0;
    static char c ='0';
    
    public static void main(String[] args) {
        System.out.println(i==s);
        System.out.println(b==d);
        System.out.println(c==i);
    }
}