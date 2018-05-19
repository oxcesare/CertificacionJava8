/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 *
 * En esta clase se demuestra que se puede enviar una exception declarada en una
 * clase que extienda de una exception padre, en este caso Throwable
 *
 * La clase SubThrowable extiende de Throwable y cuando se ejecuta el
 * constructor se imprime la cadena caught
 *
 * throw new SubThrowable(); se puede lanzar en un bloque try es decir un objeto
 * del tipo de una exception personalizada.
 */
public class Tes18 {

    public static void main(String[] args) {
        int i = 5;
        while ((i += 2) < 10) {
            System.out.println(i);
        }

        if (i > 10) {
            try {
                throw new SubThrowable();
            } catch (SubThrowable e) {
                e.printStackTrace();
            }
        }
    }
}

class SubThrowable extends Throwable {

    public SubThrowable() {
        System.out.println("caught!!");
    }

}
