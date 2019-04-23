package com.codehub.java.io.data;

import java.io.*;

public class ShoppingData {
    
    private static final String path = "D:\\myDevelop\\workspace\\Project001\\shoppingcart.data";

    public static void main(String[] args) {
        
        try(DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(path)))) {
            
            double total = 0;
            double price;
            int    units;
            String des;
            
            try {
                while(true) {
                    price = dis.readLong();
                    units = dis.readInt();
                    des   = dis.readUTF();
                    System.out.format("price: %.2f, units: %d, des: %s%n", price, units, des);
                    total += price * units;
                }
            } catch(EOFException e) {
            }
            
            System.out.format("%.2f", total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
