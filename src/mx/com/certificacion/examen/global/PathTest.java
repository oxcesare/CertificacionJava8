/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.DoubleStream;

/**
 *
 * @author consultor006
 */
public class PathTest {

    static Path p1 = Paths.get("c:\\main\\project\\Starter.java");

    public static String getRoot() {
        
        /**
         * Metodo que obtiene el elemento padre 
         */
        String root = p1.getRoot().toString();
        return root;
    }

    public static void main(String[] args) {
        System.out.println(getRoot());

        System.out.println("************************************");
        DoubleStream is = DoubleStream.of(5, 7, 3); //1 
        double sum = is.filter(i -> i % 2 != 0).sum(); //2 
        System.out.println(sum); //3        
    }
}
