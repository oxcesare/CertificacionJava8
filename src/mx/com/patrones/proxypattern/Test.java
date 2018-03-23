/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patrones.proxypattern;

import java.lang.reflect.Proxy;

/**
 *
 * @author consultor006
 * 
 * Clase principal para hacer el test correspondiente al patron Proxy Pattern
 * 
 */
public class Test {
    public static void main(String[] args) {
        Service service = new ServiceToBeMonitored();
        PerformanceMonitor handler = new PerformanceMonitor(service);
        Service proxy = (Service) Proxy.newProxyInstance(
        service.getClass().getClassLoader(), new Class[]{ Service.class }, handler);        
    }
}
