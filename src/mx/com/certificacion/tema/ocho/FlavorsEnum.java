/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 * Cuando se invoca el método ordinal 
 * este empieza desde Cero,Uno,Dos
 */
public class FlavorsEnum {
    enum Flavor{
        VANILLA, CHOCOLATE, STRAWBERRY{
           public boolean hasFine(){
            return true;
          }  
    }
        
    }    
    public static void main(String[] args) {
        System.out.println(Flavor.CHOCOLATE.ordinal());
        System.out.println(Flavor.CHOCOLATE.hasFine());
   
    }
}
