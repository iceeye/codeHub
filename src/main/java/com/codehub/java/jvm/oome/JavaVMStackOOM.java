package com.codehub.java.jvm.oome;

/**
 * VM args : -Xss2m
 * @author Kay
 *
 */
public class JavaVMStackOOM {

    public static void main(String[] args) {
        
        while(true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    while(true) {
                    }
                }
            });
            thread.start();
        }
    }

}
