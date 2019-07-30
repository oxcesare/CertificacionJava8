/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana7;

import java.util.Locale;

/**
 *
 * Clase ejemplo para construir un Locale.
 * 
 * En este caso no imprime nada 
 * @author cesaralducinruiz
 */
public class Test8 {
    
    
    public static void main(String[] args) {
        Locale locale = new Locale.Builder().build();
        System.out.println("locale"+""+locale);
        
        
        Locale localeTwo = new Locale("US","en");
        System.out.println(""+localeTwo);//Imprime us_EN
        
        
        Locale localeThree = new Locale("US","en");
        
        Locale localeOther = Locale.JAPAN;
        
        System.out.println(""+localeOther);
        
        
        
    }
    
}
