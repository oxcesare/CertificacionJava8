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
interface House {

    public default String getAddress() {
        return "101 Main Str";
    }
}

interface Office {

    public default String getAddress() {
        return "101 Smart Str";
    }
}

class HomeOffice implements House, Office {

    public String getAddress() {
        return "R No 1, Home";
    }
}

public class Uno {
    public static void main(String[] args) {
        House h = new HomeOffice();
        System.out.println("h"+h.getAddress());
    }
}
