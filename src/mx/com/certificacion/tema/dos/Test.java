/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.dos;

import java.time.LocalDate;
import java.time.Period;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneOffset;
import java.time.*;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author consultor006
 */
public class Test {

    public static void main(String[] args) {
        Period p = Period.between(LocalDate.now(), LocalDate.of(2015, Month.SEPTEMBER, 1));
        System.out.println(p);
        Duration d = Duration.between(LocalDateTime.now(), LocalDateTime.of(2015, Month.SEPTEMBER, 2, 10, 10));
        System.out.println(d);
        System.out.println("*************************************************");
        determinarZonaHoraria();
        System.out.println("*************************************************");
        muestraDiferenciaHoras();
    }

    public static void determinarZonaHoraria() {
        LocalDateTime ldt = LocalDateTime.of(2017, 06, 02, 6, 0, 0);  //Jun 2nd, 6AM. 
        ZoneOffset nyOffset = ZoneOffset.ofHoursMinutes(-5, 0);
        ZoneId nyZone = ZoneId.of("America/New_York");
        OffsetDateTime nyOdt = ldt.atOffset(nyOffset);
        ZonedDateTime nyZdt = ldt.atZone(nyZone);
        Duration d = Duration.between(nyOdt, nyZdt);
        System.out.println(d);
    }

    public static void muestraDiferenciaHoras() {
        LocalDateTime ld1 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 2, 0);
        ZonedDateTime zd1 = ZonedDateTime.of(ld1, ZoneId.of("US/Eastern"));
        LocalDateTime ld2 = LocalDateTime.of(2015, Month.NOVEMBER, 1, 1, 0);
        ZonedDateTime zd2 = ZonedDateTime.of(ld2, ZoneId.of("US/Eastern"));
        long x = ChronoUnit.HOURS.between(zd1, zd2);
        System.out.println(x);
    }

    public static void muestraHorarioDeLosAngeles() {
        LocalDateTime ldt = LocalDateTime.of(2017, 12, 02, 6, 0, 0);
        ZonedDateTime nyZdt = ldt.atZone(nyZone);
        ZonedDateTime laZdt = ldt.atZone(laZone);
        Duration d = Duration.between(nyZdt, laZdt);
        System.out.println(d);

    }
}
