/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author consultor006
 * 
 * Clase que demuestra el uso de la interface 
 * ExecutorService, esta nos permite crear hilos, 
 * administrarlos, calendarizarllos con una API ya establecida y
 * haciendo uso de programación funcional.
 * 
 * Se pueden tantos objetos como se necesiten de la interface Executor
 */
public class ZooInfo {
    
    public static void main(String[] args) {
        ExecutorService service = null;
        try {
            service = Executors.newSingleThreadExecutor();
            System.out.println("begin");
            service.execute(()-> System.out.println("Printing zoo inventory"));
            service.execute(()-> {for(int i=0; i<3; i++)
                    System.out.println("Printing record:"+i);
                });
            
            service.execute(()-> System.out.println("Printing zoo inventory"));
            System.out.println("end");
        } finally {
            if(service !=null)
                service.shutdown();
        }
        
        System.out.println("*************************************************");
        
        metodosService();
    }
    
    public static void metodosService(){
        System.out.println("Metodos de la interface Service");
        
        ExecutorService service =null;
        service = Executors.newSingleThreadExecutor(); //Con esto instancio el objeto que crea el hilo
        
        System.out.println("service.execute();");
        System.out.println("service.submit(Callable <t> task);");
        System.out.println("service.submit(Runnable task);");
        System.out.println("service.invokeAll(tasks);");
        System.out.println("service.invokeAny(tasks);");        
    }
}
