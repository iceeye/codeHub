package com.codehub.java.jvm.oome;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args : -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author Kay
 *
 */
public class HeapOOM {

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        
        while(true) {
            list.add(new OOMObject());
        }
    }

    static class OOMObject {
        
    }
}
