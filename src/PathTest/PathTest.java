/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PathTest;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author consultor006
 * 
 * Ejemplo de la clase Paths, la cual recupera 
 * el path especifico.
 * 
 * En este ejemplo manda un error en tiempo de ejecucción.
 * 
 * Debido a que existe un mal argumento.
 * 
 */
public class PathTest {

    public static void main(String[] args) {
        Path p1 = Paths.get("c:\\code\\java\\PathTest.java");   
        System.out.println(p1.getName(3).toString());
    }   
}
