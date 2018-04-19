/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.tres;

/**
 *
 * @author consultor006
 * 
 * Esta clase compila con error debido a que el método append y el metodo
 * reverse no pertenecen a la la clase String
 * 
 * Estos métodos mencionados son parte de StringBuilder y StringBuffer
 */
public class Test9 {
    public static void main(String[] args) {
        Test9 q = new Test9();
        String s ="hello wordl";
   
        //System.out.println(s.appemd("!!!");
        //System.out.println(s.reverse);
                
    }
}
