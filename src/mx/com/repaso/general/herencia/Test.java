/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.repaso.general.herencia;

/**
 *
 * @author consultor006
 * 
 * Esta clase tiene un bloque estatico el cual no se ejecuta primero 
 * ya que no esta una instancia de la clase Sub creada y por lo tanto imprime
 * primero el valor de la variable static de la clase Super.
 */
class Super {

    static String ID = "QBANK";
}

class Sub extends Super {

    static {
        System.out.print("In Sub");
    }
}

public class Test {

    public static void main(String[] args) {
        System.out.println(Sub.ID);
    }
}
