package com.codehub.algorithm.linklist;


public class LRUPageFrame {
    
    private static class Node {
        
        Node prev;
        Node next;
        int pageNum;

        Node() {
        }
    }

    private int capacity;
    
    private int currentSize;
    private Node first;// ����ͷ
    private Node last;// ����β

    
    public LRUPageFrame(int capacity) {
        this.currentSize = 0;
        this.capacity = capacity;
        
    }

    /**
     * ��ȡ�����ж���
     * 
     * @param key
     * @return
     */
    public void access(int pageNum) {
        
        
    }
    
    
    public String toString(){
        StringBuilder buffer = new StringBuilder();
        Node node = first;
        while(node != null){
            buffer.append(node.pageNum);            
            
            node = node.next;
            if(node != null){
                buffer.append(",");
            }
        }
        return buffer.toString();
    }
    
    

}