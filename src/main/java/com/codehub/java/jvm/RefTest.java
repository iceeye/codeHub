package com.codehub.java.jvm;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class RefTest {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
       try {
        Class<?> clazz = Class.forName("com.kay.pro.jvm.Employee");

        Constructor<Employee> c = (Constructor<Employee>) clazz.getConstructor(String.class, int.class);
        
        Employee emp = c.newInstance("Kay", 23);
        System.out.println(emp.toString());
        
        Method method = clazz.getMethod("sayHello");
        method.invoke(emp, null);
        
        Method methodID = clazz.getDeclaredMethod("getID");
        methodID.setAccessible(true);
        String id = (String) methodID.invoke(emp, null);
        System.out.println(id);
        
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields) {
            int mod = field.getModifiers();
            System.out.print(Modifier.toString(mod));
            System.out.print(" " + field.getType().getName());
            System.out.println(" " + field.getName().toString());
        }
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        Method methodAdd = list.getClass().getDeclaredMethod("add", Object.class);
        methodAdd.invoke(list, "abc");
        System.out.println(list.toString());
    } catch (Exception e) {
        e.printStackTrace();
    }

    }

}
