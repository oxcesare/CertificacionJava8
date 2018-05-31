/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PathTest;

/**
 *
 * @author consultor006
 */
abstract class Widget {

    String data = "data";

    public void doWidgetStuff() {
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
        Widget w = new GoodWidget();
        w.doWidgetStuff();
    }
}
