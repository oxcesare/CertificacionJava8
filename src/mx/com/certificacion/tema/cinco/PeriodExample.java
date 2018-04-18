/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.cinco;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author consultor006
 */
public class PeriodExample {
    
    public static void main(String[] args) {
        System.out.println("--- Examples --- ");

        Period tenDays = Period.ofDays(10); 
        System.out.println(tenDays.getDays()); //10

        
        /**
         * El metodo of de periodo crea una instancia con año, mes y dia 
         */
        Period oneYearTwoMonthsThreeDays = Period.of(1, 2, 3);
        System.out.println(oneYearTwoMonthsThreeDays.getYears());   //1
        System.out.println(oneYearTwoMonthsThreeDays.getMonths());  //2
        System.out.println(oneYearTwoMonthsThreeDays.getDays());    //3

        System.out.println("\n--- Period.between --- ");
        LocalDate oldDate = LocalDate.of(1982, Month.AUGUST, 31);
        LocalDate newDate = LocalDate.of(2016, Month.NOVEMBER, 9);

        System.out.println(oldDate);
        System.out.println(newDate);

        // check period between dates
        Period period = Period.between(oldDate, newDate);

        System.out.print(period.getYears() + " years,");
        System.out.print(period.getMonths() + " months,");
        System.out.print(period.getDays() + " days");

    }
}
