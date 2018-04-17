/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.dos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author consultor006
 * 
 * En esta clase se imprime el valor 5 seguido de una excepcion
 * del tipo Uncheked, debido a que es un arreglo bidimensional 
 * de 3 posiciones con 2 posiciones por elemento interno
 * 
 * Al querer regresar esta posicion [3][1] no existe y manda la excepcion mencionada
 * 
 */
public class EjercicioCinco {
    public static void main(String[] args) {
        int [][] myInt = {{2,3,4},{4,5,6},{7,8,9}};
        
        System.out.println(myInt[1][1]);
        System.out.println(myInt[3][1]);
        
        List lista = new ArrayList();
        lista.isEmpty();
                
    }
}
