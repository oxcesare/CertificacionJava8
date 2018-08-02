/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.mes.julio;

/**
 *
 * @author cesaralducinruiz
 */
class SuperClass {

    public SuperClass() {
    }
    
    public SuperClass(int m){
        
    }
}

public class SubClass extends SuperClass {

    int i, j, k;

    public SubClass(int m, int n) {
        i = m;
        j = m;
    } //1      
    public SubClass( int m ){   
        super(m );  
     } //2 

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    
} 
