/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author consultor006
 */
public class Lista {
    public static void main(String[] args) {
     List list = new ArrayList();
     list.add("A");
     list.add("B");
     list.add("C");
     
     //Manda error porque la lista es de objetos,
     //Es decir acepta cualquier  tipo de dato,  y 
     //Si la queremos iterar con un String manda ese error
     //for(String s : list){                            
      //   System.out.println(""+s);
      //}
      for(Object s : list){
          System.out.println("Objetos"+s.toString());
      }     
    }
}
