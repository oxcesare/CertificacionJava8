/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.uno.clasesAvanzadas;

/**
 *
 * @author consultor006
 */
public class Internas {
    IceCream ice;
    
    
    public Internas(){
        
    }
    
    public void interno(){
        ice.a();
    }
    
    
    public static void main(String[] args) {
        Internas i = new Internas();
        i.interno();
    }
}
