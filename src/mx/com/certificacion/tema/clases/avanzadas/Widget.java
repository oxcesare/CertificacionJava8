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
public abstract class Widget {

    String data = "data";

    public void doWidgetStuff() {
    }
    
    abstract void c();
}

class GoodWidget extends Widget {

    String data = "big data";

    public void doWidgetStuff() {
        System.out.println(data);
    }

    @Override
    void c() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
