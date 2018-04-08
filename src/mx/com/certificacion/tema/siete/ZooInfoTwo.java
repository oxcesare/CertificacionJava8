/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete;

import java.util.concurrent.*;

/**
 *
 * @author consultor006
 *
 * Esta clase muestra otra forma de crear un hilo utilizando la interface
 * Single-Thread Executor.
 */
public class ZooInfoTwo {
    
    public static void main(String[] args) {
        Executor service = null;
        
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(() -> System.out.println("Printing zoo Inventory"));
            service.execute(() ->  {for (int i = 0; i < 3; i++) 
                System.out.println("Printing record:" + i);}
            );            
            service.execute(() -> System.out.println("Printing zoo inventory"));
            System.out.println("end");
            
        } finally {
            if(service !=null){
                //service.shutdown();
            }
                
        }
    }
    
    public void metodosExecutorService(){
        Executor service = null;
        
        
    }
}
