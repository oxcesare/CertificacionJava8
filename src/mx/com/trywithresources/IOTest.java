/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;

/**
 *
 * @author consultor006
 * 
 * Recordar que si utilizamos multiples exceptions en el catchs
 * este debe de ser desde la más generica hasta la más especifica 
 * 
 * Nota: Se coloca un catch opcional 
 */
public class IOTest {

    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader("c:\\works\\a.java"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch(Exception e ){
        
        //catch (NoSuchFileException | IOException | AccessDeniedException e) {
         //   e.printStackTrace();
        }
    }
}
