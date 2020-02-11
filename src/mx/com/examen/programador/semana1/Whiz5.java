/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.programador.semana1;

import java.util.function.DoubleSupplier;

/**
 *
 * @author cesaralducinruiz
 * 
 * Clase ejemplo de DoubleSupplier 
 
 * 
 * el metodo correcto es getAsDouble() no get
 */
public class Whiz5 {
    
    
    public static void main(String[] args) {
        DoubleSupplier sups = () -> Math.random()*10;
        //System.out.println(sups.get());
    }
    
}
