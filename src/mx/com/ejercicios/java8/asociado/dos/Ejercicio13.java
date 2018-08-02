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
 * Esta clase demuestra el uso de métodos sobreescritos 
 * recordar la jerarquia de modificadores de acceso.
 * 
 * public,protected y private.
 * 
 * Esta clase imprime "Sub out".
 */
public class Ejercicio13 extends EjercicioInterno13 {
    public static void main(String[] args) {
        EjercicioInterno13 q = new Ejercicio13(); 
        q.out();
    }
    
    public void out(){
        System.out.println("Sub out");
    }    
}

class EjercicioInterno13 {
    protected void out(){
        System.out.println("Super out");
    }
}
