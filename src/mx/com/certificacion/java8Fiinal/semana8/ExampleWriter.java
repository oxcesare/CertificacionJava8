/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.java8Fiinal.semana8;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;
import java.io.PrintWriter;
import java.io.Writer;

/**
 *
 * @author cesaralducinruiz
 */
public class ExampleWriter {
    
    
    public static void main(String[] args) {
        try(PrintWriter writer = new PrintWriter(System.out)){
            writer.println("HELLO");
        }
    }
}
