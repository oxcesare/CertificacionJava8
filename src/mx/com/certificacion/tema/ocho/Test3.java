/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 */
public class Test3 {
    Given: public static void reader(String fileName1) throws Exception{     try (FileReader fr = new FileReader(fileName1);) {         int charRead = 0;         while ((charRead = fr.read()) != -1) {             System.out.println("Read char " + charRead);         }     } }  
}


//Respuesta 
Chain fr to a BufferedReader use its readLine method

Fundamento
A Reader can be chained to a BufferedReader to read Strings. BufferedReader has readLine method that returns a String.

