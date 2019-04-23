package com.codehub.java.jvm.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TransactionHandler implements InvocationHandler {
    
    private Object target;
    private Transaction tx = new Transaction();
    
    public TransactionHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;
        if("transfer".equals(method.getName())) {
            tx.beginTx();
            
            result = method.invoke(target, args);
            
            tx.commitTx();
        } else {
            result =  method.invoke(target, args);
        }
        return result;
    }

}
