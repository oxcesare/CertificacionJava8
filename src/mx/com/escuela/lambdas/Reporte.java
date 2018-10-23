/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.lambdas;

import java.util.Comparator;

/**
 *
 * @author consultor006
 * 
 * Recordar que Comparable implementa el metodo compareTo(T o)
 */
public class Reporte<T> implements Comparable<T>,Comparator<T> {

    @Override
    public int compareTo(T o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public int compare(T o1, T o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }       
}
