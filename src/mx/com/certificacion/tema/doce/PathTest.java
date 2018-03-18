/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.doce;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author consultor006
 */
public class PathTest {

    static Path p1 = Paths.get("C:\\Simulador Java 8");

    public static String getRoot() {
        String root = p1.getRoot().toString();
        return root;
    }

    public static void main(String[] args) {
        System.out.println(getRoot());
    }
}
