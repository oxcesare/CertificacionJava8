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
public class Test4 {
    Consider the following code:  import java.io.*; public class TestClass {         public static void main(String[] args) throws Exception {       File f = new File("x");   //1       BufferedReader bfr1 = new BufferedReader(new FileReader(f)); //2       BufferedReader bfr2 = new BufferedReader( bfr1 ); //3       PrintWriter pw = new PrintWriter(new FileReader(f)); //4    } }  Select the correct statements about the above program.
}


Respuesta
        
//2 and //3 will compile without any error.
        

        Fundamento:

A BufferedReader can wrap any Reader. Both FileReader and BufferedReader are Readers so both //2 and //3 are valid.
        

