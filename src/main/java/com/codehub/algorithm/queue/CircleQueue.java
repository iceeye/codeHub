package com.codehub.algorithm.queue;

/**
 * ������ʵ��ѭ������
 * @author liuxin
 *
 * @param <E>
 */
public class CircleQueue <E> {
    
    private final static int DEFAULT_SIZE = 10;
    
    //������������ѭ�����е�Ԫ��
    private Object[] elementData = new Object[DEFAULT_SIZE] ;
    
    //��ͷ
    private int front = 0;  
    //��β  
    private int rear = 0;
    
    public boolean isEmpty() {
        return false;
        
    }

    public int size() {
        return -1;
    }

    

    public void enQueue(E data) {
        
    }

    public E deQueue() {
        return null;
    }
}
