/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PathTest;

/**
 *
 * @author consultor006
 * 
 * Pool de String lo que hace Java es que bsuca
 * si existe una referencia del objeto creado y si existe
 * nos la duelve y nos indica que el objeto ya existe.
 * 
 * String es inmutable por lo tanto ya no se puede cambiar sus valores
 * y si lo comparamos con == no manda un false
 */
public class Iguales {
    public static void main(String[] args) {
        
        Integer c = new Integer(5);
        Integer d = new Integer(5);
        
        System.out.println("Equals"+","+c.equals(d));
        System.out.println(c==d);
        
        String a = new String("a");
        String b = new String("b");
        
        System.out.println("Equals String"+","+a.equals(b));
        System.out.println(a==b);
      
        
        Persona p = new Persona("Cesarin", "Ruiz");
        Persona t =p; //new Persona("Cesarin", "Ruiz");
        
        System.out.println("Equals Persona"+","+p.equals(t));
        System.out.println(p==t);
    }
}
