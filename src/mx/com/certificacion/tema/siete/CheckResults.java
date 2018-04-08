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
 * Clase que demuestra el uso de Future y como podemos 
 * esperar un resultado con el método get.
 * 
 * Si la clase o metodo que estamos implementando lanza 
 * algun tipo de exception entonces debemos de capturarlas
 * ya que de lo contrario mandara un error en tiempo de compilacion.
 */
public class CheckResults {
 
    private static int counter=0;
    
    public static void main(String[] args)  throws InterruptedException,ExecutionException {
       ExecutorService service =null;
        try {
            service = Executors.newSingleThreadExecutor();
            Future<?> result = service.submit(()-> {for (int i = 0; i < 3; i++)
                CheckResults.counter++; //esta en la forma de invocar varibales estaticas 
                });
            result.get(10,TimeUnit.SECONDS);
            System.out.println("Reached");
        } catch (Exception e) {
            System.out.println("not reached in time");
       }
        if(service !=null)
            service.shutdown();
    }
}
