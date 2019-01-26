/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test24;

/**
 *
 * @author cesaralducinruiz
 */
public class Compara implements Comparable<String> {

    public int compareTo(String s1, String s2) {
        return s1.length() - s2.length();
    }

    @Override
    public int compareTo(String o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
