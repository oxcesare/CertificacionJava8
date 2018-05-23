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
 * En esta clase se necesita hacer uso de un  casting ya que el valor de i 
 * es un Integer  y n es un valor number
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        //Linea 1 
        Number n=i;
        //Linea 2 
        System.out.println(n.intValue());
        //Linea 3
        i =(Integer)n;
        //Linea 4
        System.out.println(i.intValue());
    }
}
