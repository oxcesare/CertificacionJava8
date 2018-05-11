/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.seis.Exceptions;

import java.io.Closeable;

/**
 *
 * @author consultor006
 */
public class AutoCloseableFlow {

    static class Door implements AutoCloseable {

        public void close() {
            System.out.println("D");
            throw new RuntimeException();
        }
    }

    static class Window implements Closeable {

        public void close() {
            System.out.println("W");
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        try {
            Door d = new Door();
            Window w = new Window()
            }
            {
                System.out.println("T");
            }
        } catch (Exception e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }
    }

}
