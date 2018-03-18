/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.interfaces.funcionales;

import java.util.Objects;
import java.util.function.Supplier;

/**
 *
 * @author consultor006
 */
public class TestOne {

    public static void main(String[] args) {
        SunPower power = new SunPower();

        SunPower p1 = produce(() -> power);
        SunPower p2 = produce(() -> power);
        
        System.out.println("Check the same object? " + Objects.equals(p1, p2));

    }

    public static SunPower produce(Supplier<SunPower> supp) {
        return supp.get();
    }
}

class SunPower {

    public SunPower() {
        System.out.println("Sun Power initialized..");
    }
}
