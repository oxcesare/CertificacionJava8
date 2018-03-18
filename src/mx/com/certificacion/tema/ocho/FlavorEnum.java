/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 * 
 * El método ordinal comienza con 0, 1, 2, 3, son números positivos
 */
public class FlavorEnum {
    
    enum Flavor {
        CHOCOLATE, VAINILLA, FRESA
    }
   public static void main(String[] args) {
        System.out.println("Enum : \t" +  Flavor.FRESA.ordinal()); // Ordinal retorna el numero el cual ubique esa pocision
        
        //Se puede hacer una instancia de una ENUM        
        Flavor f = Flavor.CHOCOLATE; // se puede capturar el valor ordinal de un enum y almacenarlo en un objeto del tipo enum 
        
        switch(f){
          
        }
    }
}
