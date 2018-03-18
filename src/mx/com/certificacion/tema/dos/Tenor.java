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
 * Para los metodos staticos no aplica el polimorfismo.
 */
public class Tenor extends Singer {
    
    public String sing(){
        return "fa";
    }
    
    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s = new Tenor(); // Si los metodos a invocar no son estaticos entonces si aplica el polimorfismo
        
        System.out.println(t.sing()+ " " + s.sing());
    }
}