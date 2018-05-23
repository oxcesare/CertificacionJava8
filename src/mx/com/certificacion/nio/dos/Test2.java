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
public class Test2 {

    static Path p1 = Paths.get("c:\\finance\\data\\reports\\daily\\pnl.txt");

    public static String getRoot() {
        String root = p1.getRoot().toString();
        return root;
    }

    public static void main(String[] args) {
        System.out.println(getRoot());
    }

}
