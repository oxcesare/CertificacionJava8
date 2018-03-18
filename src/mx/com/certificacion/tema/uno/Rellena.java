/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.uno;

/**
 *
 * @author consultor006
 */
public class Rellena {
    public static void main(String[] args) {
        int x=7;
        
        String nombre="CESARIN";
        
        System.out.println("Antes del relleno"+nombre.length());
        for(int i=0; i<x;i++){
             nombre +=" ";   
        }               
        System.out.println("Después del relleno"+nombre.length());   
        System.out.println("***********************************");   
        System.out.println(nombre+"OtraCadena");
    }
}
