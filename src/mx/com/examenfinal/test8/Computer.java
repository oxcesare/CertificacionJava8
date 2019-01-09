/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examenfinal.test8;

/**
 *
 * @author consultor006
 */
public class Computer {

    public void startup() {
        System.out.print("computer-");
    }

    public static void main(String[] args) {
        Computer computer = new Laptop(); //Objeto computer
        Laptop laptop = new Laptop(); //Accede a los metodos de la clase de la cual se creo el objeto.
        computer.startup(); //Invoca al metodo startup de Laptop
        laptop.startup();
    }
}
