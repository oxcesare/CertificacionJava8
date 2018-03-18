/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.nueve;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.NoSuchFileException;

/**
 *
 * @author consultor006
 * Aquí esta dando error en tiempo de ejecucción
 * NoSuchFileException no es una subclase de la clase Exception IOException
 * 
 */
public class IOTest {

    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader("c:\\works\\a.java"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException | NoSuchFileException | AccessDeniedException e) {
            e.printStackTrace();
        }
    }
}
