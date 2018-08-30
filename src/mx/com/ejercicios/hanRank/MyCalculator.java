/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.hanRank;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author consultor006
 */
public class MyCalculator extends TipoException {

    public static void main(String[] args) throws TipoException {
        power(-3, -15);
    }

    /*
    * Create the method long power(int, int) here.
     */
    public static void power(int n, int p) throws TipoException {
        try {
            if (n == -1 | p == -1) {
                throw new TipoException("n and p should be non-negative");
            } else {
                System.out.println(Math.pow(n, p));
            }
        } catch (TipoException e) {
            throw new TipoException("n and p should be non-negative");
        }
    }

}

class TipoException extends Exception {

    public TipoException() {
    }

    /**
     * @param message
     */
    public TipoException(String message) {
        super(message);
    }

}
