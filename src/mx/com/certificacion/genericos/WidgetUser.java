/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.genericos;

/**
 *
 * @author consultor006
 */
class Widget {

    String data = "data";

    public void doWidgetStuff() {
        System.out.println(data);
    }
}

class GoodWidget extends Widget {

    String data = "big data";

    public void doWidgetStuff() {
        System.out.println(data);
    }
}

public class WidgetUser {

    public static void main(String[] args) {
        Widget w = new GoodWidget(); // Este tipo de cast solo se debe de hacer cuando se utiliza la herencia. 
        //((Widget) w).doWidgetStuff(); // se esta haciendo un cast sobre la misma clase y hace que no imprima nada el codigo 
        w.doWidgetStuff();
    }
}
