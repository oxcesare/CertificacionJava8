/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.dos;

/**
 *
 * @author consultor006
 */
class Mammal {
    String name="furry";
    
    String makeNoise(){
        return "generic noise";
    }
}

class zebra extends Mammal{
    String name="stripes";
    
    String makeNoise(){
        return "bray";
    }
}

