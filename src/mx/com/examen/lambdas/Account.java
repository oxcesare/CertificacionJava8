/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.examen.lambdas;

/**
 *
 * @author consultor006
 * 
 * Which interface from java.util.function package should be used to refactor this code?
 * 
 * La interface funcional que se necesita es: Predicate
 * 
 * Represents a predicate (boolean-valued function) of one argument. 
 * This interface is used when you want to check for some condition
 * 
 * Si haces una instancia de una interface entonces se debe de implmentar 
 * el método que este definido en esta.
 * 
 * 
 * 
 * 
 */
interface AmountValidator {

    public boolean checkAmount(double value);
}

public class Account {

    public void updateBalance(double bal) {
        boolean isOK = new AmountValidator() {
            public boolean checkAmount(double val) {
                return val >= 0.0;
            }
        }.checkAmount(bal);                
    //other irrelevant code     
    }
}
