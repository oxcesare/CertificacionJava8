/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

import java.util.Comparator;

/**
 *
 * @author consultor006
 */
interface Unica extends Varias, Otra {

}

interface Varias {

}

interface Otra {

    public abstract void unicoMetodo();
}

public class Extendiendo implements Unica, Comparable<Object>, Comparator<Object> {

    @Override
    public void unicoMetodo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param o
     * @return Comparable
     */
    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param o1
     * @param o2 Comparator
     * @return
     */
    @Override
    public int compare(Object o1, Object o2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
