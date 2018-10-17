/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.nio.dos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 *
 * @author consultor006
 *
 * En esta clase PathTest se crea un objeto de Pahts, recordemos que Paths forma
 * parte de las nuevas características de NIO.2
 *
 * Es la nueva forma de crear objetos File.
 *
 * El metodo SubPath comienza con 0 para evaluar la raiz del directorio y en
 * consecuencia sus subdiectorios
 *
 *
 */
public class PathTest {

    static Path p1 = Paths.get("c:\\finance\\data\\reports\\daily\\pnl.txt");

    public static void main(String[] args) throws FileNotFoundException, IOException {
        System.out.println(p1.subpath(0, 4));

        BufferedReader bfr = new BufferedReader(new FileReader("c:\\finance\\data\\reports\\daily\\pnl.txt"));
        System.out.println(bfr.readLine());

        //Un Path no se puede convetir a un Stream de paths
        //Stream<String> lines = Files.list(Paths.get("test.txt"));
        //lines.forEach(x -> System.out.println(x));
        //No es la forma correcta de leer las líneas del archivo 
        //Stream<String> lines = Files.lines(Paths.get("c:\\finance\\data\\reports\\daily\\pnl.txt"));
        //lines.forEach(System.out::println);
        
        Stream<String> lines = Files.lines(Paths.get("c:\\finance\\data\\reports\\daily\\pnl.txt"), Charset.defaultCharset());
        lines.forEach(s -> System.out.println(s));

    }
}
