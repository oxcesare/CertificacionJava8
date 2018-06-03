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
 * Recordar que cuando trabajamos con Files debemos de lanzar una IOException
 * dentro de la definicion del método
 */

public class FileCopier {

    public static void copy(String records1, String records2) throws IOException {
        try {
            InputStream is = new FileInputStream(records1);
            OutputStream os = new FileOutputStream(records2);
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        } catch (FileNotFoundException | IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
    }
}
