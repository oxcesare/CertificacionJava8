/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test7;

/**
 *
 * @author cesaralducinruiz
 * 
 * En esta clase esta mal declarada la variable integer ya que 
 * Integer debe ser con la "I" mayuscula.
 * 
 * Si tienes dos variables con el mismo nombre
 * 
 * En esta caso a 
 * 
 * al tratar de invocarla le hace caso a la variable que esta 
 * dentro del metodo main 
 * 
 */
public class Values {

    Integer a = Integer.valueOf("1");

    public static void main(String[] nums) {
        Integer a = Integer.valueOf("2");
        Integer b = Integer.valueOf("3");
        System.out.println(a + b);
    }
}
