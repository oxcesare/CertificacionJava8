/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.tema.clases.avanzadas;

/**
 *
 * @author consultor006
 * 
 * Todos los atributos que esten en una clase,
 * son participativos de el metodo hashCode.
 */
public class IntPair {

    private int a;
    private int b;

    public void setA(int i) {
        this.a = i;
    }

    public int getA() {
        return this.a;
    }

    public void setB(int i) {
        this.b = i;
    }

    public int getB(int b) {
        return b;
    }

    public boolean equals(Object obj) {
        return (obj instanceof IntPair && this.a == ((IntPair) obj).a && this.b == ((IntPair) obj).b);
    }
    
    public int hashCode(){
        return a-b;
    }
}
