/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.trywithresources;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author consultor006
 * 
 * The program will not compile because the try statement is used incorrectly.
 */
public class FileCopier {

    public static void copy(String records1, String records2) {
        try (InputStream is = new FileInputStream(records1);
                OutputStream os = new FileOutputStream(records2);) {  //1             
            if (os == null) {
                //os = new FileOutputStream("c:\\default.txt");  //2    
            }          
            byte[] buffer = new byte[1024];
            int bytesRead = 0;
            while ((bytesRead = is.read(buffer)) != -1) {  //3                 
                os.write(buffer, 0, bytesRead);
                System.out.println("Read and written bytes " + bytesRead);
            }
        } catch (IOException e) { //4             e.printStackTrace();      
        }
    }

    public static void main(String[] args) {
        copy("c:\\temp\\test1.txt", "c:\\temp\\test2.txt");
    }

}
