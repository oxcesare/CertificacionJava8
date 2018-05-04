/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.certificacion.threads;

/**
 *
 * @author consultor006
 * 
 * Objects of this class are
 * thread safe but you cannot say anything about the objects wrapped by this class.
 */
public class DataObjectWrapper {

    private final Object obj;

    public DataObjectWrapper(Object pObj) {
        obj = pObj;
    }

    public Object getObject() {
        return obj;
    }
}
