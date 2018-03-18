/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.uno.clasesAvanzadas;

/**
 *
 * @author consultor006
 * clases estaticas internas dentro de una clase.
 */
public class Browsers {

   static class Browser {
       public void go(){
           System.out.println("Inside Browser");                 
       }
   }       
   static class Firefox extends Browser{
       public void go(){
           System.out.println("Inside Firefox");
       }
   }       
}
