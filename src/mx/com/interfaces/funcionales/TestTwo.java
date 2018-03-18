/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.interfaces.funcionales;

import java.util.function.Supplier;

/**
 *
 * @author consultor006
 */
public class TestTwo {

    public static void main(String[] args) {
        System.out.println(maker(Employee::new));
    }

    private static Employee maker(Supplier<Employee> fx) {
        return fx.get();
    }

}

class Employee {

    @Override
    public String toString() {
        return "A EMPLOYEE";
    }
}
