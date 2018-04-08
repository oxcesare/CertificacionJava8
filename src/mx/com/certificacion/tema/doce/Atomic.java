/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.doce;

import java.util.concurrent.atomic.*;

/**
 *
 * @author consultor006
 */
public class Atomic {
    
    public static void main(String[] args) {
        
    }
    
    public void c (){
        AtomicInteger atomicInteger = new AtomicInteger(0);
        
        //atomicInteger.accumulateAndGet(0, accumulatorFunction);
        //atomicInteger.addAndGet(0)
        //atomicInteger.getAndAccumulate(0, accumulatorFunction)
        //atomicInteger.floatValue();
        //atomicInteger.getAndUpdate(updateFunction);
        
        
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        atomicBoolean.getAndSet(true);
        
    }
    
}
