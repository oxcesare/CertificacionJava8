/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.rank;

/**
 *
 * @author cesaralducinruiz
 */
public class BetSim {
    public static void main(String[] args) {
        int bit=1;
        int xboxOne=3200000;
        int dias=0;
        int ganas=100000;
        int necesitas=0;
        
        
        necesitas = xboxOne/ganas;
        System.out.println("Necesitas"+" " + necesitas);
        
        int anio = necesitas/12;
        
        System.out.println("Años"+" " + anio);
        
        
        
        
    }
   
}
