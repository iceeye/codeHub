package com.codehub.java.jvm.proxy;

public interface AccountService {
    public void transfer(String fromAccount, String toAccount, int ammount);

    public void query(String accountId);
}
