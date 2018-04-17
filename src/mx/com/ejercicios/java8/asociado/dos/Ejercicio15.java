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
 * Se tiene que hacer un cast de la variablr r a int para que el codigo 
 * compile sin problema.
 */
public class Ejercicio15 {
    public static void main(String[] args) {
        double r = Math.random()*10;
        //Linea 1
        Integer x = new Integer((int)r);
        System.out.println(x);
    }
    
}
