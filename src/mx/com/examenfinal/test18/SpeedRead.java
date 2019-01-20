/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test18;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author cesaralducinruiz
 */
public class SpeedRead {

    public void jenniferReads(Path p) throws IOException {
        Files.lines(p);
    }

    public void jonReads(Path p) throws IOException {
        Files.readAllLines(p);
    }

    public static void main(String[] pages) throws IOException {
        Path p = Paths.get("/bookshelf/mobydick.txt");
        final SpeedRead r = new SpeedRead();
        r.jenniferReads(p);
        r.jonReads(p);
    }
}
