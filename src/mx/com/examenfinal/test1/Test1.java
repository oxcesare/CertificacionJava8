/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test1;

/**
 *
 * @author cesaralducinruiz
 * 
 * Recordar que las variables locales se deben de inicializar
 * al momento de querer utilizarlas.
 * 
 */
public class Test1 {
    
    public static void main(String[] args) {
        //double num1,  int num2=0;
        //int num1,num2;
        int num1=0, num2=0; // solo la variable num2 esta inicialiazada
        
        System.out.println("num1"+ " " + num1);
        mensaje();
    }
    
    public static void mensaje(){
        int num1=1;
        System.out.println("num1"+ " " + num1);
        
    }
    
}
