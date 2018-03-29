/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.trywithresources;

import java.io.IOException;

/**
 *
 * @author consultor006
 */
public class Device implements AutoCloseable {

    String header = null;

    public void open() {
        header = "OPENED";
        System.out.println("Device Opened");
    }

    public String read() throws IOException {
        throw new IOException("Unknown");
    }

    public void writeHeader(String str) throws IOException {
        System.out.println("Writing : " + str);
        header = str;
    }

    public void close() {
        header = null;
        System.out.println("Device closed");
    }

    public static void testDevice() {
        try (Device d = new Device()) {
            d.open();
            d.writeHeader("TEST");
            d.close();
        } catch (IOException e) {
            System.out.println("Got Exception");
        }
    }

    public static void main(String[] args) {
        Device.testDevice();
    }
}
