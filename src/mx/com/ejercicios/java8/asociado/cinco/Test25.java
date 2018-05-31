/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 */
public class Test25 {
     public static void main(String[] args) {
        Test25 t = new Test25();
         try {
             t.run();
         } catch (Exception e) {
             System.out.println("Caught it!!");
         }
    }

   public void run()throws ExceptionR {
       try {
           throw new ExceptionR();
       } finally{
           System.out.println("Finally Block");
       }   
   }    
    
}


class ExceptionR extends Exception {
    
}