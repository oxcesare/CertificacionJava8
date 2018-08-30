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
public class Ex2 {

    public static void main(String[] args) {
        int b [] = {1,2,3,4};
        System.out.println(""+b[0]);
        
        int c [] = new int [10];
        
        //Objetos no mutables
        String d = "Java 6"; 
        System.out.println(""+d.concat("SE"));
        
        //Objetos no mutables
        String x = "Java 7";
        x.concat("SE");//Este es un nuevo objeto, por lo tanto en el siguiente system, no se imprime el valor.
        System.out.println(""+x);
        
        //Objetos mutables
        StringBuilder build = new StringBuilder("A");
        build.append("B");
        System.out.println(""+build);
        
        int a[][] = new int[3][];
        a[1] = new int[]{1, 2, 3};
        a[2] = new int[]{4, 5};
        System.out.print(a[1][2]);
    }
}
