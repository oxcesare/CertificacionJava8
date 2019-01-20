/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test18;

import static java.nio.file.StandardCopyOption.*;
import static java.nio.file.Files.*; //Importación estatica
import java.io.*;
import java.nio.file.*;

/**
 *
 * @author cesaralducinruiz
 * 
 * Esta clase tiene un error en la llamada al metodo newBufferedReader
 * 
 * debido a que no se encuentra dentro de la clase File.
 */

public class CopyOfACopy {

    public static void main(String[] args) throws IOException {
        final Path s = new File("apples.zip").toPath();
        final Path t = FileSystems.getDefault().getPath("oranges.zip");
        copy(s, t, REPLACE_EXISTING); // q1 
        //copy(Files.newBufferedReader(t),t,ATOMIC_MOVE); // q2
    }
}
