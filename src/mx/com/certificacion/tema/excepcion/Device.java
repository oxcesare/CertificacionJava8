/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.excepcion;

import java.io.IOException;

/**
 *
 * @author consultor006
 * 
 * la interface AutoCloseable implementa el método close.
 */
public class Device implements AutoCloseable {

    String header = null;

    public Device(String name) throws IOException {
        header = name;
        if ("D2".equals(name)) {
           // throw new IOException("Unknown");
        }
        System.out.println(header + " Opened");
    }

    public String read() throws IOException {
        return "";
    }

    public void close() {
        System.out.println("Closing device " + header);
        throw new RuntimeException("RTE while closing " + header);
    }

    public static void main(String[] args) throws Exception {
        try (Device d1 = new Device("D2"); Device d2 = new Device("D1")) {
            throw new Exception("test");
        }
    }
}
