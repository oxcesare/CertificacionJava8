/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.expresiones.lambda;

/**
 *
 * @author consultor006
 *
 * Esta clase tiene declarada una interface y la manera correcta de invocarla
 * mediante el uso de expresiones lambda
 * 
 * It must have exactly one abstract method and may have other default or static methods.
 * 
 * Una interface debe tener exactamente un metodo abstracto y puede tener otros metodos
 * default o estaticos.
 * 
 * Cuando mandas como parametro una definicion de una expresion de una interface funcional,
 * del lado de donde va la implemtacion ya seria el codigo 
 * 
 * Ejemplo
 * 
 * checkList(List list, Predicate<List> p)
 * 
 * y de lado de la implementacion poner lo siguiente:
 * 
 * checkList(new ArrayList(), al -> al.isEmpty());
 * 
 * checkList(new ArrayList(), al -> al.add("hello"));
 * 
 * Esta es la sintaxis para implementar una expresion lamdba
 * 
 * (parameter list) OR 
 * single_variable_without_type -> { regular lines of code } 
 * OR just_an_expression_without_semicolon
 *
 */
interface Runner {

    public void run();
}

public class InterfacesUso {

    public static void main(String[] args) {
        run(() -> voidMethod()); //will invoke run(Runner ) method.         
        run(() -> intMethod());//will also invoke run(Runner ) method.
    }

    public static void run(Runner x) {
        x.run();
    }

    public static void voidMethod() {
        System.out.println("voidMethod");
    }

    public static int intMethod() {
        System.out.println("intMethod");
        return 0;
    }
}