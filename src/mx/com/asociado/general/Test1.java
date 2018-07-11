/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.asociado.general;

/**
 *
 * @author consultor006
 */
public class Test1 {

    public Test1(Test1 test) {

    }

    int k = 5;
    String sb = "";

    public boolean checkIt(int k) {
        return k-- > 0 ? true : false;
    }

    public void m() {
        String String = "string isa string";
        System.out.println(String.substring(3, 6));
        int expr1 = 3 + 5 * 9 - 7;
        System.out.println(expr1);
        int expr2 = 3 + (5 * 9) - 7;
        System.out.println(expr2);
        int expr3 = 3 + 5 * (9 - 7);
        System.out.println(expr3);
        int expr4 = (3 + 5) * 9 - 7;
        System.out.println(expr4);
    }

    public static void main(String[] args) {
        Test1 test1 = null;
        Test1 test = new Test1(test1);
        test.m();

    }
}
