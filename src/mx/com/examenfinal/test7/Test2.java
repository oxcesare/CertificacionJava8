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
 * En esta clase para el metodo convert recordar que solo con Objetos de una
 * clase se puede acceder a los metodos de Objet
 */
public class Test2 {

    public static String cadena;
    public static String _blue;
    //public static String 2blue; //Mala declaracion de una variable
    public static String blue$;
    public static String Blue;

    public static void main(String... args) {
        String chair = null, table = "metal";
        chair = chair + table;
        System.out.println(chair);

        System.out.println("" + cadena);

    }

    public String convert(Object value) {
        int num1 = 999;

        int num2 = 9_9_9;
        //int num3 = _9_99; //No puede iniciar con "_" bajo
        //Object se considera una Wrapper class
        
        return value.toString();
    }

}
