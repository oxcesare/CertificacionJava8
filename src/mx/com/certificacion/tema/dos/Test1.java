/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.dos;

import java.io.IOException;

/**
 *
 * @author consultor006
 *
 * Ejemplo para uso de interfaces
 *
 */
interface I1 {

    void m1() throws java.io.IOException;
}

interface I2 {

    void m1() throws java.sql.SQLException;
}

public class Test1 implements I1,I2{

    @Override
    public void m1() throws Throwable {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
