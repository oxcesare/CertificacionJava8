/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 * 
 * En esta clase se hace uso de exception, cuando el metodo run
 * es invocado y lanza una exception al estar invocando una instancia
 * de la clase ExceptionR y no tener mensaje entonces solo se ejecuta el bloque finally
 * y el mensaje catch de la invocacion propia del método run(). 
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