/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certification.basicos;

/**
 *
 * @author consultor006
 */
public class Test2 {
    public static void main(String[] args) {
         int a[] = { 1,2,042,4};
         int b[][] = { {1,2,4} , {2,2,1},{0,43,2}};
         System.out.print(a[3]==b[0][2] );
         System.out.print(" " + (a[2]));
         System.out.print(" " + b[2][1]);
         System.out.print(" " + (a[2]==b[2][1]));
    }    
}
