/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.capitulo2.general;

/**
 *
 * @author consultor006
 * 
 * Reglas de las interfaces:
 * 
 * 1. Una interface puede extender de otra interface
 * 2. Una interface solo puede tener metodos abstractos
 * 3. Solamente cuando implementas una interface debes de implmentar sus métodos
 * 4. Si la clase es abstracta  e implementa la interface no es necesario implementar 
 * los metodos de la interface
 * 5. Para este ejercicio la clase EasternChipmunk extiende de Chipmunk 
 * la cual implementa a CanClimbTree
 * entonces al extender de una clase que implementa una interface debemos de implementar sus metodos
 * 
 * 6. Si solo tenemos una clase que extiende de otra donde no esta inmersa alguna interface
 * entonces no es necesario implementar los metodos.
 * 
 * 7. Una interface no puede extender de una clase 
 * 
 * 8. Una interface no puede declararse como Final 
 */



class A {
    public void mensaje(){
        System.out.println("Mensaje desde la clase A");
    }
}

class B  extends  A{
    
}


interface CanClimb  {
     void climb();    
}

interface CanClimbTree extends CanClimb {
    
}

abstract class Chipmunk implements CanClimbTree{
    public abstract void chew();
}


public class EasternChipmunk extends Chipmunk {

    @Override
    public void chew() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void climb() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
