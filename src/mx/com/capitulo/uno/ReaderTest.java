/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.capitulo.uno;

/**
 *
 * @author consultor006
 * 
 * Para que se imprima el valor uno  en el siguiente codigo 
 * se debe de invocar con la palabra reservada "this" a la variable
 * version que esta declarada en la interface haciendo también un 
 * cast
 * 
 * si solo se utiliza this dentro del metodo que implementa la interface
 * imprimira el valor de 2 
 */
interface Classic {

    int version = 1;

    public void read();
}

class MediaReader implements Classic {

    int version = 2;

    public void read() {
         System.out.println(((Classic)this).version);
         System.out.println(this.version);
    }
}

public class ReaderTest {

    public static void main(String[] args) {
        MediaReader mr = new MediaReader();
        mr.read();
    }
}
