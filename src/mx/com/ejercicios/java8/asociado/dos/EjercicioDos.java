/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.dos;

/**
 *
 * @author consultor006
 * 
 * Sin el uso del break, se ejecuta todo el códigio después
 * de la evaluacion en el swtich 
 */
public class EjercicioDos {
    public static void main(String[] args) {
        switch(2){
            case 1: System.out.println("1");
            case 2: System.out.println("2");
            case 3: System.out.println("3");
            case 4: System.out.println("4");
            default:System.out.println("Ninguna de las anteriores");
            
        }
    }
}
