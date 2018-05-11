/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete.Concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


/**
 *
 * @author consultor006
 */
public class Test1 {
    public static void main(String[] args) {
    
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        service.scheduleWithFixedDelay(()->{
            System.out.println("Open Zoo");
            return null;
        },0,1,TimeUnit.MINUTES);
                
        
        
        
    }
    
    
    
}
