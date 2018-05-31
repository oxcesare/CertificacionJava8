/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.capitulo.uno.clasesAvanzadas;

/**
 *
 * @author consultor006
 *
 * Este ejemplo no sigue las reglas de la herencia y es por eso que marca error
 * en metodo double getLoad()
 */
public class LoadTest {

    public static void Main(String[] args) throws Exception {
        LoadTest t = new LoadTest();
        int i = t.getLoad();
        double d = t.getLoad();
        System.out.println(i + d);
    }

    public int getLoad() {
        return 1;
    }

    public double getLoad(int i) {
        return 3.0;
    }

}
