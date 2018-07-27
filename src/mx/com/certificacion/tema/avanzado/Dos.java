/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.avanzado;

import java.io.IOException;

/**
 *
 * @author cesaralducinruiz
 */

interface I1{
     void m1 () throws java.io.IOException;
}

interface I2{
    void m1 () throws java.sql.SQLException;
}

public class Dos implements I1,I2{
    
    public static void main(String[] args) {
        
    }

    @Override
    public void m1() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
