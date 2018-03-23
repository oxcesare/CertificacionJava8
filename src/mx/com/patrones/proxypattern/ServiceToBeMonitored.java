/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patrones.proxypattern;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author consultor006
 */
public class ServiceToBeMonitored implements Service {

    @Override
    public void foobar() {
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
