package com.codehub.java.jvm.oome;

/**
 * VM args : -Xss128kb
 * @author Kay
 *
 */
public class JavaVMStackSOF {
    
    private int stackLength = 1;
    
    private void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        
        JavaVMStackSOF sof = new JavaVMStackSOF();
        
        try {
            sof.stackLeak();
        } finally {
            System.out.println(sof.stackLength);
        }
    }

}
