/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.general;

/**
 *
 * @author consultor006
 * 
 * En esta clase manda error porque hay que recordar que las variables
 * que son declaradas dentro de un método deben siempre inicializarse.
 * 
 * Otra regla es que las variables finales tambien deben de inicializarse para poder 
 * usarse. 
 * 
 */
public class Discounter {

    static double percent; //1 
    int offset = 10, base = 50; //2

    public static double calc(double value) {
        int coupon, offset, base;//3        
    if(percent<10){ //4         
        coupon = 15;
        offset = 20;
        base = 10;
    }
    return coupon*offset*base*value/100; //5  
}   
public static void main(String[] args) 
{        
System.out.println(calc(100));  
}
}
