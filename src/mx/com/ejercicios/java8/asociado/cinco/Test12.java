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
 * Clase que recibe un parametro por medio de la consola
 * y ese parametro es evaluado en un case, recordar que los switch
 * pueden validar dos tipos de datos String e int 
 */
public class Test12 {
      public static void main(String[] args) {
          int i=0;
          switch(i){
              case 0: 
                  System.out.println("Case 0");
               break;
               default:
                   System.out.println("Se ejecuta si el case no tiene un break");
          }
      
          switch(args[0].charAt(0)){
              case TestConstants.option1:
                  System.out.println("Option1 Selected");
                  break;
              case TestConstants.option2:
                  System.out.println("Option2 Selected");
                  break;
              case TestConstants.option3:
                  System.out.println("Option3 Selected");
                  break;
          }
      }    
}

class TestConstants{
    public static final char option1='S';
    public static final char option2='T';
    public static final char option3='X';    
}
