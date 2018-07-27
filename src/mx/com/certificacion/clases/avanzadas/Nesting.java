/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.clases.avanzadas;

/**
 *
 * @author cesaralducinruiz
 * 
 * Esta clase incluye los conceptos de clases internas, 
 * llamdas al constructor de la clase padre mediante el uso de la  palabra 
 * reservada super.
 * 
 * Cuando se invoca al constructor de la clase padre le podemos pasar
 * como parametros valores para que estos se inicialicen en el constructor.
 * 
 * En este mismo código se desmuestra que una interface puede extender 
 * de multiples interfaces, esto no puede aplicar para clases. una clase solo extiende de 
 * otra clase y puede implementar multiples interfaces.
 * 
 * 
 */
public class Nesting {

    public static void main(String args[]) {
        BB.C obj = new BB().new C();
        
        
    }
}

interface Uno extends Dos,Tres {
    
}

interface Dos {
    
}

interface Tres {
    
}


class AA {

    char c;

    AA(char c) {
        this.c = c;
    }
}

class BB extends AA {

    char c = 'a';

    BB() {
        super('b');
    }

    class C extends AA {

        char c = 'c';

        C() {
            super('d');
            System.out.println(BB.this.c);
            System.out.println(C.this.c);
            System.out.println(super.c);
        }
    }
}
