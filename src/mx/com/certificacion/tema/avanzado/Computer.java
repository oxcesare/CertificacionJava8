/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

/**
 *
 * @author consultor006
 * 
 * Dentro de una clase ademas de las clases internas tambien se pueden
 * declarar clases abstractas, interfaces y enums.
 * 
 */
public class Computer {

    abstract class Processor {
    }

    interface Pluggable {
    }

    enum PORTS {
        USB2, USB3, ESATA, HDMI
    }

    public class Interna {
        
    }
    
    public void interno (){
        System.out.println("Metodo interno de la clase Computer");
    }
    
    public static void main(String[] args) {
        Computer c = new Computer();
        c.interno();
    }
    
}
