package com.codehub.java.jvm.oome;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * VM args : -Xmx20M -XX:MaxDirectMemorySize=10M
 * @author Kay
 *
 */
public class DirectMemoryOOM {
    
    private static final int _1M = 1024*1024;

    public static void main(String[] args) throws Exception {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while(true) {
            unsafe.allocateMemory(_1M);
        }
    }

}
