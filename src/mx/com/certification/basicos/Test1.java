/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certification.basicos;

/**
 *
 * @author consultor006
 * 
 * Un arreglo inicializa en la posicion 0
 * 
 * El tamaño de un arreglo es de acuerdo al numero de elementos
 * que este contenga comenzando desde 1 
 */
public class Test1 {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        
        System.out.println(""+a.length);
        int i = a.length - 1;

        int x = a[0];
        System.out.println(""+x);
        System.out.println(""+i);
        while (i >= 0) {
            System.out.print(a[i]);
            i--;
        }

    }
}
