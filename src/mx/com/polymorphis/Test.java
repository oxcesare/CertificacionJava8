/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.polymorphis;

/**
 *
 * @author cesaralducinruiz
 */
public class Test {

    interface HelloWorld {

        public void greet();
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.grito();

        System.out.println("Polimorfismo");
        Animal cat = new Cat();
        cat.grito();

        Test test = new Test();
        test.invocandoInterno();

    }

    public void invocandoInterno() {
        System.out.println("No interno");
        class InternoClass implements HelloWorld {

            void personalizado() {
                System.out.println("Method own of the anonym class");
            }

            @Override
            public void greet() {
                System.out.println("Method declared inside of the anonym class"); //To change body of generated methods, choose Tools | Templates.
            }
        }
        
        HelloWorld objectIntern = new InternoClass();
        objectIntern.greet();
        InternoClass c = new InternoClass();
        c.personalizado();


    }
}

class Animal {

    public void grito() {
        System.out.println("wow");

    }
}

class Cat extends Animal {

    public void grito() {
        System.out.println("miau");
    }
}
