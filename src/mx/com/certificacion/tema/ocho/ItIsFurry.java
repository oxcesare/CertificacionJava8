    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

import java.util.ArrayList;

/**
 *
 * @author consultor006
 */
public class ItIsFurry {
    static class Chipmunk{
        
    }
    public static void main(String[] args) {
       Chipmunk c = new Chipmunk();
        ArrayList<Chipmunk> l = new ArrayList<>();
        Runnable r  = new Thread();
        if ( r instanceof Chipmunk){
            System.out.println("r es una instancia de Chipmunk");
        }else{
            System.out.println("r no es una instancia de Chipmunk");
        }       
//        if(l instanceof  Chipmunk){ // no se puede comparar un ArrayList de objetos con un objeto simple 
//            System.out.println("r es una instancia de Chipmunk");
//        }

        if( c instanceof  Chipmunk){
            System.out.println("x");
        }
    }
}
