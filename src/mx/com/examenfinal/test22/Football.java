/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test22;

/**
 *
 * @author cesaralducinruiz
 * 
 * Esta clase regresa un error ya que se quiere pasar como parametro
 * una variable de tipo int a un metodo que recibe un Long objeto
 * en su caso tendriamos que pasarle un Long objeto para que la clase
 * no mande error y continue su flujo normal.
 * 
 */
public class Football {

    public static Long getScore(Long timeRemaining) {
        return 2 * timeRemaining; // m1
    }

    public static void main(String[] refs) {
        final Long startTime = 4L;
        System.out.print(getScore(startTime)); // m2 }
    }
}