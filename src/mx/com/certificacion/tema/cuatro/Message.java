/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cuatro;

/**
 *
 * @author consultor006
 * 
 * No se puede hacer una instancia de una clase abstracta
 */

public abstract class Message {
    
    public String recipient;
    public abstract void sendMessage();
    
    public static void main (String [] args){
        Message m = new TextMessage();
        m.recipient ="123456789";
        m.sendMessage();
    }    
}

class TextMessage extends Message {
    public final void sendMessage(){
        System.out.println("Text message" + recipient);
    }
}
