/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test16;

import java.io.*;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase se detalla un ejemplo de crear una exception
 * personalizada llamada OutOfTuneException 
 * 
 * Se invoca al constructor de la clase padre y se le manda como parametro el mensaje
 * al ser invocada.
 * 
 * Esta clase tiene un error en el catch debido a que en
 * la definicion del metodo main no se esta declaradando Exception o en su
 * caso FileNotFoundException que son exceptions que se lanzan en el metodo main.
 * 
 * Corrigiendo estos dos errores ya no debería de haber detalle.
 * 
 * Como nota adicional si tienes una subclase que extiende de runtimen
 * y la quieres colocar dentro del bloque catch 
 * entonces solo puedes poner puras subclases ya que si pones clase padre
 * como exception o runtimeException el compilador te indica un errro en tiempo
 * de compilacion 
 * 
 */
class OutOfTuneException extends Exception {

    OutOfTuneException(String message) {
        super(message);
    }
}

class Otra extends RuntimeException{
    
}

public class Piano {

    public void play() throws OutOfTuneException, FileNotFoundException {
        throw new OutOfTuneException("Sour note!");
    }

    public static void main(String... keys) throws OutOfTuneException, FileNotFoundException {
        final Piano piano = new Piano();
        try {
            piano.play();
        } catch (Otra e) {
            throw e;
        } finally {
            System.out.println("Song finished!");
        }
    }
}
