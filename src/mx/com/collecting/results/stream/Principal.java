/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.collecting.results.stream;

/**
 *
 * @author cesaralducinruiz
 * 
 * Clase principal para invocar todos los ejemplos de las diferentes clases
 * correspondientes a Collecting Results.
 * 
 * 
 * 
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("Primer Ejemplo de Collecting Result");
        
        AveringDouble avg = new AveringDouble();
        avg.m();
        
        System.out.println("Segundo ejemplo de la operacion intermedia Map");
        
        ExampleOne one = new ExampleOne();
        one.a();
        
    }
}
