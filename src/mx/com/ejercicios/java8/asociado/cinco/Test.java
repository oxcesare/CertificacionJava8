/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.ejercicios.java8.asociado.cinco;

/**
 *
 * @author consultor006
 */
public class Test extends SuperTest {
    public static void main(String[] args) {
        System.out.println("This is all there is ");
    }

    public Test(int x) {
        super(x);
    }
}

class SuperTest {
    int x =0;
    String y ="super";
    char z ='z';
    
    static {
        System.out.println("Super print");
    }
    
    SuperTest(int x){
        this.x=x;
    }

    public SuperTest(String y) {
        this.y=y;
    }

    public SuperTest(char z) {
        this.z=z;
    }
    
    public void m(){
        int x=1;
        switch(x){
            case 1: 
                System.out.println("Algo");
            default: 
                System.out.println("Algo mas");
        }
    }
    
}
