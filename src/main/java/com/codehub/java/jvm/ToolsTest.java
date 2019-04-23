package com.codehub.java.jvm;

import com.sun.tools.attach.VirtualMachine;
import com.sun.tools.attach.VirtualMachineDescriptor;

import java.util.List;

public class ToolsTest {

    public static void main(String[] args) {
        List<VirtualMachineDescriptor> vmds = VirtualMachine.list();
        for(VirtualMachineDescriptor vmd : vmds) {
            System.out.println(vmd.id() + " : " + vmd.displayName());
        }
    }

}
