package com.codehub.java.jvm.oome;

import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;

public class MetaSpaceTest {

    private static final ArrayList list = new ArrayList();
    private static int size = 0;
    public static void main(String[] args) throws Exception {
        
        URL url = new URL("file:D:\\");
        while(true) {
            ClassLoader classLoade = new URLClassLoader(new URL[]{url});
            Class<?> clazz = classLoade.loadClass("Test");
            size++;
            System.out.println(size);
            //System.out.println(classLoade.toString());
            list.add(clazz);
            //Object test = clazz.newInstance();
            //Object value = clazz.getMethod("test01").invoke(test);
            //System.out.println(value);
        }

    }

}
