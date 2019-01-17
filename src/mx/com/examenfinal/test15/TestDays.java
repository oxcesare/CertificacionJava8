/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test15;

/**
 *
 * @author cesaralducinruiz
 */
public class TestDays {
    
    //Declaracion de un enum 
    public enum Days { MON,TUE,WED};
    
    public static void main(String[] args) {
        for(Days d : Days.values());
       
        Days[]d2 = Days.values(); //el metodo values de el enum es un arreglo 
        System.out.println("d2"+d2.length);
        
        System.out.println("d2"+d2[2]);
    }
    
    
}
