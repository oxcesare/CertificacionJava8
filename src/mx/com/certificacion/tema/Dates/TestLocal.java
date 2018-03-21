/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.Dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

/**
 *
 * @author consultor006
 *
 * Clase TestLocal para crear objetos que muestren el uso de Dates y Times
 *
 */
public class TestLocal {

    /**
     *
     * @param args Método Main
     */
    public static void main(String[] args) {
        crearObjetosTime();
        objetosDuration();
        objetosPerido();
    }

    /**
     * Se crea metodo estatico para crear objetos Times al ser statico no
     * tenemos que instanciar la clase.
     */
    public static void crearObjetosTime() {

        LocalTime now = LocalTime.now();

        int hora = now.getHour();
        int minuto = now.getMinute();
        int segundo = now.getSecond();

        System.out.println("hora" + " " + hora + " " + "Minuto" + " "
                + minuto + " " + "Segundo" + " " + segundo
        );

    }

    public static void objetosDuration() {
        Duration d = Duration.ofDays(1);
        System.out.println("Duration" + " "
                + d);

        Duration c = Duration.ofHours(1);
        System.out.println("Duration" + " "
                + c);

    }

    /**
     *  Los objetos de la clase Period representan
     *  el tiempo entre dos fechas: en terminos de días,
     *  meses y años.
     * 
     *   Y - Year
     *   M - Month
     *   D - Day
     */
    public static void objetosPerido() {

        System.out.println(Period.between(
                LocalDate.of(2015, 3, 20),
                LocalDate.of(2017, 2, 27)));
    }
}
