/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema;

import java.util.*;

/**
 *
 * @author consultor006
 */
public class MyComparator implements Comparator<String>{

   public int compare(String a, String b){
    return b.toLowerCase().compareTo(a.toLowerCase());
   }
   
   public static void main(String[] args) {
        String [] values = {"123","456A","455sA"};
        Arrays.sort(values,new MyComparator()); //Primero aqui hay un ordenamiento de la informacion, y la
                                                //comparacion de los Objetos
        for (String s : values){
            System.out.println(""+s.toString());
        }    
        System.out.println("************************************");
        mapas();
    }
   
   public static void mapas (){
       Map<Integer, Integer> map =  new HashMap<>(10);
       for (int i =1; i<10; i++ ){
           System.out.println("i"+i);
           map.put(i, i*i);
           System.out.println("map.get()"+ " " + map.get(i));
       }
       System.out.println(map.get(4));
   }
        
    
}
