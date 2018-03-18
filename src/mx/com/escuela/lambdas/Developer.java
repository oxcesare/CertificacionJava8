/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.escuela.lambdas;

import java.math.BigDecimal;

/**
 *
 * @author consultor006
 */
class Developer {
    
    private String cadena;
    private BigDecimal decimal;
    private int age;
    
    
    public Developer(String cadena,BigDecimal decimal,int age ){
        this.cadena=cadena;
        this.decimal=decimal;
        this.age=age;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public BigDecimal getDecimal() {
        return decimal;
    }

    public void setDecimal(BigDecimal decimal) {
        this.decimal = decimal;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
