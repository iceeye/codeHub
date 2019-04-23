package com.codehub.java.jvm.oome;

import java.util.ArrayList;
import java.util.List;

/**
 * VM args : -XX:PermSize10m -XX:MaxPermSize10m
 *           -XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
 *           -XX:MaxMetaspaceSize=10m -Xms20m -Xmx20m
 * @author Kay
 *
 */
public class RuntimeConstantPoolOOM {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>();
        
        int i = 0;
        while(true) {
            list.add(String.valueOf(i++).intern());
            list.add(new String("str" + i++).intern());
        }
    }

}
