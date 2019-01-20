/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test18;

import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

/**
 *
 * @author cesaralducinruiz
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("/cesarin/data/movie.txt");
        //BasicFileAttributes b = Files.readAttributes(file, DosFileAttributes.class);
        
        System.out.println(""+file.getParent());
        
        System.out.println(""+file.getRoot());
        
        
        
       
        
        
    }
}
