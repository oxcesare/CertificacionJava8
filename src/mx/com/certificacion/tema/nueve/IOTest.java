/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.nueve;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 *
 * @author consultor006 Regresa un error en tiempo de ejecucción La exception
 * NoSuchFileException no es una subclase de la clase Exception
 *
 */
public class IOTest {

    public static void main(String[] args) {
        try (BufferedReader bfr = new BufferedReader(new FileReader("c:\\works\\a.java"))) {
            String line = null;
            while ((line = bfr.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
