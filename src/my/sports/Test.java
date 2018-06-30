/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.sports;

/**
 *
 * @author consultor006
 */

 interface C {
     public void m(); //Los metodos son finales, abstractos en una interface
 }

public class Test  implements C{
 
    public void m(){
        System.out.println("Implementacion dentro de la Clase Test");
    }
    public static void main(String[] args) {
        C c = new Test(); //Con un objeto de la interface accedo al método de la clase 
        c.m();
    }
    
    
}
