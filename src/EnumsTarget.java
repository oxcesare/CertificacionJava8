/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author consultor006
 * El metodo ordinal comienza la enumeracion desde cero
 */
public class EnumsTarget {
    
    enum flavor{
        UNO, DOS, TRES
    }
    
    public static void main(String[] args) {
        flavor c = flavor.UNO;
        //c lo unico que trae es el nombre del elemento que esta dentro de la enum 
        System.out.println("c"+c);
        
        switch(c){
         //   case 0: System.out.println("Ordinal");
        }
        //System.err.println("Class"+flavor); //Objeto mal construido
        System.out.println("Método ordinal" +  " " +  flavor.UNO.getDeclaringClass());
        System.out.println("Método ordinal" +  " " +  flavor.UNO.ordinal());
        
        
    }
    
}
