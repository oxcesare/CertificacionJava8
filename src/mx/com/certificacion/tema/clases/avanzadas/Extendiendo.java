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

interface ExtendiendoInternaUno{
    public abstract void m1();
}

interface ExtendiendoInternaDos{
    public abstract void m2();
}

interface ExtendiendoInternaTres{
    public abstract void m3();
}

interface ExtendiendoInternaCuatro{
    public abstract void m4();
}

interface ExtendiendoInternaPrincipal extends ExtendiendoInternaUno {
    public abstract void m5();
}

public class Extendiendo implements ExtendiendoInternaPrincipal, ExtendiendoInternaTres {

    @Override
    public void m5() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void m1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void m3() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
