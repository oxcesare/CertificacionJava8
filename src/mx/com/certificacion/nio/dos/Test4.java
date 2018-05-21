/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.nio.dos;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author consultor006
 */
public class Test4 {

    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\personal\\.\\photos\\..\\readme.txt");
        Path p2 = Paths.get("c:\\personal\\index.html");
        Path p3 = p1.relativize(p2);
       System.out.println(p3);
    }

}
