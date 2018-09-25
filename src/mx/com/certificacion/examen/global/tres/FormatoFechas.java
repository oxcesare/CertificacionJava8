/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.examen.global.tres;

import java.time.Duration;
import java.time.Period;

/**
 *
 * @author consultor006
 * 
 * Para Duration el formato en  el que se imprime las horas es "H"
 *
 * Para periodo el formato en el que se imprime el dia es con "D"
 */
public class FormatoFechas {

    public static void main(String[] args) {
        Duration d = Duration.ofHours(25);
        System.out.println(d);
        Period p = Period.ofDays(1);
        System.out.println(p);
    }

}
