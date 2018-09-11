/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author consultor006
 */
public class Fechas {

    static int getDay(String day, String month, String year) {

        int year2 = Integer.parseInt(year);
        int month2= Integer.parseInt(month);
        int day2 = Integer.parseInt(day);
        
        Calendar calendar = new GregorianCalendar(year2, month2,day2);
        
        

        return 1;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        //System.out.println(getDay(day, month, year));
        
        Calendar cal = Calendar.getInstance();
        System.out.println(new SimpleDateFormat("DD").format(cal.getTime()));
    }

}
