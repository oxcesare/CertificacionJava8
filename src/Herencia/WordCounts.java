/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 */
public class WordCounts {

    public static void main(String[] args) throws Exception {

        String fileName = "/Users/cesaralducinruiz/NetBeansProjects/CertificacionJava8/src/Herencia/allswell.txt";

        try {
            String contenido = readFile(fileName);
            int veces = wordCount(contenido , "b");
            System.out.println("La letra"+"b "+"se repite:" + " " + veces);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        /*
        String userDirectory = new File("").getAbsolutePath();
        System.out.println(userDirectory);
         */
    }

    public static String readFile(String filename) {
        // Read the file contents and return a String
        String data = "";

        try (Stream<String> stream = Files.lines(Paths.get(filename))) {

            data = stream.collect(Collectors.joining("\n"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;

    }

    public static int wordCount(String contents, String word) {

        int n = 0;
        for (int i = 0; i < contents.length(); i++) {
            char c = contents.charAt(i);
            String f = String.valueOf(c);
            if (f.equals(word)) {
                n++;
            }
        }

        return n;
    }

}
