/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

import java.io.*;
/**
 *
 * @author consultor006
 */
public class Especial {
    public static void main(String[] args) throws Exception {
        InputStream is = new BufferedInputStream(new FileInputStream("zoo.tzt"));
        InputStream wrapper = new BufferedInputStream(is);
    }
}
