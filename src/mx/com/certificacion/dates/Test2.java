/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.dates;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author consultor006
 */
public class Test2 {

    public static void main(String[] args) {
        Duration d = Duration.ofMillis(1100);
        System.out.println(d);
        d = Duration.ofSeconds(61);
        System.out.println(d);

        System.out.println("****************************");

        Instant ins = Instant.parse("2015-06-25T16:43:30.00z");
        ins.plus(10, ChronoUnit.HOURS);
        System.out.println(ins);

        System.out.println("****************************");

        LocalDateTime ld = LocalDateTime.of(2015, Month.OCTOBER, 31, 10, 0);
        ZonedDateTime date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Duration.ofDays(1));
        System.out.println(date);
        date = ZonedDateTime.of(ld, ZoneId.of("US/Eastern"));
        date = date.plus(Period.ofDays(1));
        System.out.println(date);

    }
}
