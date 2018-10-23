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
 * Ejemplo correspondiente a NIO.2
 *
 * Metodo : Paths.get()
 *
 * Para Java 8 ya se crea un objeto Paths y con el acceder a operaciones con
 * archivos que se podian hacer con IO tal como copiar, mover, etc pero están ya
 * tienen mejor rendimiento.
 *
 */
public class PathTest {

    static Path p1 = Paths.get("c:\\a\\b\\c");

    public static String getValue() {
        String x = p1.getName(1).toString();
        String y = p1.subpath(1, 2).toString();
        return x + " : " + y;
    }

    public static void main(String[] args) {
        System.out.println(getValue());
    }
}
