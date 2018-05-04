/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.dos;

/**
 *
 * @author consultor006
 * 
 * Every non-static inner class object has a reference to its outer class object which 
 * can be accessed by doing OuterClass.
 * this. So the expression B.this.c will refer to B's c, whose value is 'a'. Inside a non-static inner class, 'InnerClass.this' is equivalent to 'this'. so 'C.this.c' refers to C's c which is 'c'. 
 * The expression super.c will access the variable from A, the superclass of C whose value is 'd'.
 */
public class Nesting {

    public static void main(String args[]) {
        B.C obj = new B().new C();
    }
}

class AA {

    char c;

    AA(char c) {
        this.c = c;
    }
}

class B extends AA {

    char c = 'a';

    B() {
        super('b');
    }

    class C extends AA {

        char c = 'c';

        C() {
            super('d');
            System.out.println(B.this.c);
            System.out.println(C.this.c);
            System.out.println(super.c);
        }
    }
}
