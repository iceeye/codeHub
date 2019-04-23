package com.codehub.java.jvm;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CafeBaby {
    
    private static final String path = "D:\\myDevelop\\workspace\\Project001\\bin\\com\\kay\\pro\\alog\\LeetCode001.class";
    
    public static void main(String[] args) {
        
        byte[] clazzByte = null;
/*        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path));
                ByteArrayOutputStream bos = new ByteArrayOutputStream();) {
            byte[] buf = new byte[100];
            int length = -1;
            while((length = bis.read(buf)) != -1) {
                bos.write(buf, 0, length);
            }
            
            clazzByte = bos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        
        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream(path))) {
            byte[] buf = new byte[4];
            bis.read(buf);
            
            clazzByte = buf;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if(clazzByte == null) {
            throw new NullPointerException();
        }
        StringBuffer sb = new StringBuffer();
        
        for(byte b : clazzByte) {
            System.out.println("byte:" + b);
            int value = b & 0xFF;
            System.out.println("int :" + value);
            String strHex = Integer.toHexString(value);
            System.out.println("hex :" + strHex);
            if(strHex.length() < 2) {
                strHex += "0";
            }
            sb.append(strHex);
        }
        
        System.out.println("str: " + sb.toString());
    }

}
