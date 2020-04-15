/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cuatro;

import java.util.Random;

/**
 *
 * @author cesaralducinruiz
 */
public class Equipos {

    public static void main(String[] args) {
        System.out.println( getRandomIntegerBetweenRange(1,5));
        System.out.println( getRandomIntegerBetweenRange(1,5));
        System.out.println( getRandomIntegerBetweenRange(1,5));
        System.out.println( getRandomIntegerBetweenRange(1,5));
        System.out.println( getRandomIntegerBetweenRange(1,5));

    }

    public static double getRandomIntegerBetweenRange(double min, double max) {
         double x = (int)(Math.random()*((max-min)+1))+min;
    return x;
    }
    
    

}
