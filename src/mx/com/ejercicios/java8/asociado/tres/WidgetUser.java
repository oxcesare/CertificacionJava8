/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.tres;

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
    }
}

public class WidgetUser {

    public static void main(String[] args) {
        Widget w = new GoodWidget();
        ((Widget) w).doWidgetStuff();
    }

    public int methodA(int a) {
        return a * 2;
    } //1    

    public int methodA(int a,int b) {
        return a;
    }
//2

}
