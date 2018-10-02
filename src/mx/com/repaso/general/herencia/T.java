/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.repaso.general.herencia;

/**
 *
 * @author consultor006
 */
abstract class T {

    protected int m1() {
        return 0;
    }
}

class BB extends T {

    int m1() {
        return 1;
    }
}
