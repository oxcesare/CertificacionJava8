/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.nio.dos;

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
 * Given that the file test.txt is accessible and contains multiple lines, which
 * of the following code fragments will correctly print all the lines from the
 * file?
 */
public class Test3 {

    public static void main(String[] args) throws IOException {
        Path p1 = Paths.get("c:\\temp\\test1.txt");

        Stream<String> lines = Files.lines(Paths.get("c:\\temp\\test1.txt"));
        lines.forEach(System.out::println);

        System.out.println("***********************************");

        Stream<String> lines2 = Files.lines(Paths.get("c:\\temp\\test1.txt"), Charset.defaultCharset());
        lines.forEach(s -> System.out.println(s));

    }

}
