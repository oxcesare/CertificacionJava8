/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test18;

import java.nio.file.*;
import java.util.stream.Stream;

/**
 *
 * @author cesaralducinruiz
 *
 * Clase que muestra un ejemplo de como leer la información correspondiente a un
 * archivo y mediante la definicion de sus metodos mostrar las lineas de
 * informacion.
 */
public class TheCount {

    public static Stream<String> readLines(Path p) {
        try {
            return Files.lines(p);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    
    /**
     * 
     * @param p
     * @return
     * @throws Exception 
     * 
     * Este método toma un directorio y lee los archivos existentes
     * contabiliza las lineas y las retorna 
     * 
     * El metodo flatMap recibe el metodo readLines que se programo por el usuario  
     * para contabilizar las lineas.
     */
    public static long count(Path p) throws Exception {
        return Files.list(p)
                .filter(w -> Files.isRegularFile(w)).flatMap(s -> readLines(s)).count();
    }

    public final static void main(String[] day) throws Exception {
        System.out.print(count(Paths.get("/all-data")));
    }

}
