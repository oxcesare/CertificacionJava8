/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.uno;

import java.sql.*;
import java.io.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author consultor006
 */
public class Fechas {

    public static void main(String[] args) {
        Fechas f = new Fechas();
        f.obtenerFecha();
        //System.out.println("*************************");
        //f.obtenerAnio(new Date());
       // System.out.println( f.regresaFecha("24/05/2017"));
        System.out.println("Formato Fecha Archivo Telmex"+" "+formatoFechaTelmex("2017-12-11 15:45:17.687"));
        
    }

    public void obtenerFecha() {
        Date fechaActual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("EEEEEEEEEEEE, d MMMMMMMMMMMM yyyy");
        String fecha = formato.format(fechaActual);        
        System.out.println("Metodo Obtener Fecha"+ " " + fecha);
        
        
    }
    
    public int obtenerAnio(Date date) {
        if (null == date) {
            return 0;
        } else {
            String formato = "yyyy";
            SimpleDateFormat dateFormat = new SimpleDateFormat(formato);
            System.out.println("Formato de Fecha"+""+dateFormat.format(date));
            return Integer.parseInt(dateFormat.format(date));
        }
    }
    
    public static String regresaFecha (String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha= fecha;
        Date fechaDate =null;
        String fechaFinal="";
        try {
            fechaDate = formato.parse(strFecha);
            System.out.println("Fecha"+fechaDate.toString());
            
            SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd hh:mm");
            
            fechaFinal = formato2.format(fechaDate);
            System.out.println("Fecha como se necesita con hora, minuto y segundo"+" "+ fechaFinal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fechaFinal;        
    }
    
    public static String formatoFechaTelmex (String fecha){
        String nFecha="";
        
        nFecha =  fecha.substring(0, 16).replace(":", ".");
        
        return nFecha;        
    }
}
