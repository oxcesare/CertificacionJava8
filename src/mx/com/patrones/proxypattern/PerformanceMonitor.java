/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.patrones.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author consultor006 InvocationHandler es una interface relacionada con el
 * concepto de reflection, este termino se refiere a crear objetos en tiempo de
 * ejecuccion
 *
 */
public class PerformanceMonitor implements InvocationHandler {

    private final Object proxiedInstance;

    public PerformanceMonitor(Object proxiedInstance) {
        this.proxiedInstance = proxiedInstance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long t0 = System.nanoTime();
        Object result = method.invoke(proxiedInstance, args);
        long t1 = System.nanoTime();
        long millis = TimeUnit.NANOSECONDS.toMillis(t1 - t0);
        System.out.println("Invocation of method " + method.getName() + "() took " + millis + " ms");
        return result;
    }

}
