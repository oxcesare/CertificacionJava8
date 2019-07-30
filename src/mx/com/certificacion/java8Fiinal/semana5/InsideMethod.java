/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana5;

/**
 *
 * 
 * la clase no marca error porque se inicializo dentro del metodo.
 * 
 * Si no la incializaramos mandaria un error.
 * 
 * @author cesaralducinruiz
 */
public class InsideMethod extends MyClass{
        
    public void insideM(){
        final int i;
        i=1;
        
        System.out.println(""+i);
    }
    
}
