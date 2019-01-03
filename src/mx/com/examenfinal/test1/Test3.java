/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test1;

/**
 *
 * @author cesaralducinruiz
 */
public class Test3 {

    public static void main(String[] args) {

    }

    /**
     *
     * @param value
     * @return
     *
     * Este metodo manda error debido a que la variable es de tipo primitivo int
     * y por lo tanto no invoca a ningun metodo de Object
     */
    public String convert(int value) {
        //return value.toString();
        return "";
    }

    /**
     * 
     * @param value
     * @param x
     * @return 
     * 
     * Integer y Boolean son objetos y por lo tanto pueden invocar
     * metodos de la clase Object 
     */
    public String convert(Integer value, Boolean x) {
        x.toString();
        return value.toString();

    }

}
