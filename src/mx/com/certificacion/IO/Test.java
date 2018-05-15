/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.IO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author consultor006
 * 
 * Para este ejemplo la primera observacion es que si utilizas en el método Main
 * IO Exception  debes de capturar una Exception IOException. 
 * 
 * La clase BufferedWriter no tiene el método writeUTF
 * 
 */
public class Test {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c:\\temp\\test.txt");
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.writeUTF("hello");  //1        
        bfw.newLine();  //2         
        bfw.write("world");  //3 
    }

}
