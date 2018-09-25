/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global.tres;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author consultor006
 * 
 * Cuando se obtiene el mismo Path, y se quiere resolver con el método Path
 * de NIO este devuelve la ruta completa del segudno path. 
 * 
 * Es decir el path con el que se quiere resolver. 
 */
public class Resuelve {

    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\temp\\test.txt");
        Path p2 = Paths.get("c:\\temp\\report.pdf");
        System.out.println(p1.resolve(p2));
    }

}
