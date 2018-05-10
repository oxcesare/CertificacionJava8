/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.siete.Concurrency;

import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author consultor006
 *
 * Clase que demuestra el uso de CycliBarrier la cual permite hacer esperar un
 * bloque de hilos sin hacer varias llamadas al métodojoin.
 */
public class PruebaCyclicBarrier {

    public static void main(String[] args) {
        int numeroHilos = 10;
        final CyclicBarrier barreraInicio = new CyclicBarrier(numeroHilos + 1);
        final CyclicBarrier barreraFin = new CyclicBarrier(numeroHilos + 1);

        for (int i = 0; i < numeroHilos; i++) {
            Thread hilo = new Thread() {
                public void run() {
                    try {
                        barreraInicio.await();
                        System.out.println("hilo ejecutandose");
                        barreraFin.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            hilo.start();
        }

        try {
            System.out.println("levanto barrera");
            barreraInicio.await();
            barreraFin.await();
            System.out.println("todo acabado");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
