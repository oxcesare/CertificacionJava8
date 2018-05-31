/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 * 
 * Si una clase implementa una interface debe de implementar 
 * todos sus métodos
 * 
 * Si una clase es abstracta e implementa una interface 
 * entonces no es necesario que implemente todos los metodos de la interface
 */
public class Test23 {
    
}

class Triathlon implements Race {
    String name ="triathlon";
    
    
    public double getDistance (){
        return distance;
    }
    
    public String getNew(){
        return "Hello Wordl";
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

interface Race {
    double distance =26.2;
    String name ="race";
    String getName();
    double getDistance();
}