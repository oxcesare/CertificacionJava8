/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test8;

import java.util.*;

/**
 *
 * @author consultor006
 * 
 * En esta clase la variable number puede ser accedida debido a que es privada
 * y esta dentro de la misma clase. 
 */
public class Secret {

    private int number = new Random().nextInt(10);

    public boolean guess(int candidate) {
        return number == candidate;
    }
}
