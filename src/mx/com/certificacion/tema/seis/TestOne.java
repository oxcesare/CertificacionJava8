/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis;

/**
 *
 * @author consultor006 Ejemplo de como se puede inicializar una tarea en
 * creando un objeto runnable y pasandolo como parametro al Thread.
 *
 */
public class TestOne {

    public static void main(String[] args) {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };

        task.run();

        Thread thread = new Thread(task);
        thread.start();

        System.out.println("Done!");

    }
}
