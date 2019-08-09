/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana6;

import java.util.concurrent.atomic.AtomicInteger;



/**
 *
 * @author cesaralducinruiz
 */
public class ExampleAtomics {
    
    public static void main(String[] args) {
        
        AtomicInteger atomic = new AtomicInteger(5);
        atomic.incrementAndGet();
        
        System.out.println("atomic"+atomic);
        
    }
    
}
