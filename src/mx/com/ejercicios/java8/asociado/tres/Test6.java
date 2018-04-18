/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.tres;

/**
 *
 * @author consultor006
 */
public class Test6 {
    public static void main(String[] args) {
         int[][][] myInt = new int[1][2][3];
         int[][] yourInt = {{1,2},{3,4}};
         
         myInt[1] = yourInt[0][1]; // mala asignacion a un arreglo, no se debe especificar 
                                   //la longitud de la informacion
         
    }
}
