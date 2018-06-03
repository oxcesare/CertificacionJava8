/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.exception.uno;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author consultor006
 *
 * La clase Device sobreEscribe el metodo close, y este forma parte de la
 * interface AutoCloseable.
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
            d.read();
            d.writeHeader("TEST");
            d.close();
        } catch (IOException e) {
            System.out.println("Got Exception");
        }
    }

    public static void copy(String records1, String records2) {
        try (InputStream is = new FileInputStream(records1); OutputStream os = new FileOutputStream(records2);) {
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        } catch (IOException|RuntimeException e) { //LINE 100         
        }              
    } 

    

    public static void main(String[] args) {
        Device.testDevice();
    }
}
