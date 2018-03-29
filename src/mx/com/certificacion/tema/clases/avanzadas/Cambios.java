/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 */
interface T1 {

    int VALUE = 1;

    void m1();
}

interface T2 {

    int VALUE = 2;

    void m1();
}

public class Cambios  implements  T1,T2{

    public void m1(){
        
    }

}
