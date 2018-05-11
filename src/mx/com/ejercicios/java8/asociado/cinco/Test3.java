/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

import java.util.*;

/**
 *
 * @author consultor006
 * 
 * En este ejercicio hace referencia al uso del Try-Catch
 * la Exception que se esta cachando es la de ArrayIndexOutOfBoundsException
 * Cuando en realidad la que debe de cachar es la de IndexIndexOutOfBoundsException,
 * Es por ello que al no cacacharse la exception correcta se pasa al
 * segundo bloque catch e imprime Caught Exception
 */
public class Test3 {

    public static void main(String[] args) {
        try {
            ArrayList arr = new ArrayList();
            arr.add("Rugby");
            System.out.println(arr.get(1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("e"+" "+e.getMessage());
            System.out.println("Caught Exeption");        
        }
    }
}
