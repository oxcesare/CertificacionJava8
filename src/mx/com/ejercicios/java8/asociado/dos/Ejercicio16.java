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
 * Esta clase compila con error ya que el método charAt 
 * regresa un char y no se puede concatenar con el 
 * metodo concat de String.
 */
public class Ejercicio16 {
    public static void main(String[] args) {
        Ejercicio16 q = new Ejercicio16();
        String s = "hello wordl";
        System.out.println(s.equals("hello wordl"));
      //  System.out.println(s.concat(s.charAt(0)));
    }
}
