/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis.Exceptions;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author consultor006 Ejemplo de imprimir el Hilo en ejecuccion con
 * expresiones lambda y obtener el nombre antes y después de dormirlo.
 */
public class TestTwo {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println("**************************************");
        //Otra forma de crear Hilo Con la interface ExecutorService
        TestTwo t = new TestTwo();
        t.executeExecutor();
    }

    /**
     * Otra forma de ejcutar un hilo, detenerlo y arrancarlo.
     */
    public void executeExecutor() {
        
    ExecutorService executor = Executors.newSingleThreadExecutor();
        
        try {
            System.out.println("attempt to shutdown executor");
            executor.shutdown();
            executor.awaitTermination(5, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.err.println("tasks interrupted");
        } finally {
            if (!executor.isTerminated()) {
                System.err.println("cancel non-finished tasks");
            }
            executor.shutdownNow();
            System.out.println("shutdown finished");
        }

    }

}
