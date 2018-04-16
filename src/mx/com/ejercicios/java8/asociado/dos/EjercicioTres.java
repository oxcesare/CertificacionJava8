/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.dos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author consultor006
 * Este codigo no compila ya que al haber dos bloques try 
 * se debe de respetar la jerarquia de las exceptiones
 * siendo la mas especifica la que se tiene que ejecutar primero, 
 * es decir Exception se tendria que ejecutar despues de IOException
 * y no al reves como actualmente esta
 * 
 */

public class EjercicioTres {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            try {
                StringBuilder sb = new StringBuilder();
                String line = br.readLine();
                while (line != null) {
                    sb.append(line);
                    sb.append('\n');
                    line = br.readLine();
                }
                String everything = sb.toString();
            } catch (Exception e) {
                System.out.println("Exception caugth");
            } finally {
                br.close();
            }
        } catch (IOException e) {
            System.out.println("IOException caught");
        }
    }
}
