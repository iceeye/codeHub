package com.codehub.java.jvm.proxy;

import java.lang.reflect.Proxy;

public class TransactionHandlerTest {

    public static void main(String[] args) {
        AccountService as = new AccountServiceImpl();
        TransactionHandler tx = new TransactionHandler(as);

        AccountService proxyAs = (AccountService) Proxy.newProxyInstance(as.getClass().getClassLoader(),
                as.getClass().getInterfaces(), tx);
        
        proxyAs.transfer("A100", "B200", 233);
        
        proxyAs.query("A100");
    }

}
