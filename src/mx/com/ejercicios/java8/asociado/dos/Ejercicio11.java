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
 * En esta clase se tiene que hacer uso de una instancia de la clase
 * y con ella crear un objeto que permite acceder a la variable de instancia 
 * 
 * La variable de instancia ya tiene el tipo de dato int y por lo tanto ya no
 * necesita declararse en el ciclo for 
 */
public class Ejercicio11 {
    int i=0;
    
    public static void main(String[] args) {
        //linea 1
        Ejercicio11 t = new Ejercicio11();
          
        for (t.i = 0; t.i < 10; t.i++) {
            System.out.println("Hello World");
        }
    }
}
