/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.ocho;

/**
 *
 * @author consultor006
 * Error en tiempo de compilacion debido a que el métdodo m1()
 * no esta sobreescrito correctamente, esto debido a el modificador de acceso
 * 
 * En este caso los dos unicos modificadores de acceso que se puede 
 * implementar son public y protected
 */

abstract class Saloon {

    protected int m1() {
        return 0;
    }
}

public class OverridingSaloon extends Saloon {

   public int m1() {
        return 1;
    }
}
