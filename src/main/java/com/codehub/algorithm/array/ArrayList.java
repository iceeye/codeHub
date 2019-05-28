package com.codehub.algorithm.array;


import com.codehub.algorithm.Iterator;
import com.codehub.algorithm.List;

/**
 * 自己写的一个ArrayList类
 * @author Kay
 *
 */
public class ArrayList implements List {
	/**
	 * ArrayList存储的数据量
	 */
	private int size = 0;
	/**
	 * ArrayList默认初始化大小
	 */
	private int defaultCapacity = 1<<4;
	/**
	 * ArrayList默认的递增扩容因子
	 */
	private float factor = 0.5F;
	
	private Object[] elementData;
	
	public void add(Object o){
		resize();
		elementData[size] = o;
		size++;
	}
	public void add(int index, Object o){
	    if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
	    
		do {
		    resize();
		} while(index >= elementData.length);
		
		System.arraycopy(elementData, index, elementData, index + 1, size - index);
		elementData[index] = o;
		size++;
	}
	
	public Object get(int index){
	    if(index < 0 || index > size) {
	        throw new IndexOutOfBoundsException();
	    }
		return elementData[index];
	}
	
	public Object remove(int index){
	    if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
	    
	    Object removeObj = elementData[index];
	    
	    int numMoved = size - index - 1;
	    if(numMoved > 0) {
	        System.arraycopy(elementData, index + 1, elementData, index, numMoved);
	    }
	    elementData[--size] = null;

		return removeObj;
	}
	
	public int size(){
		return size;
	}
	
	public Iterator iterator(){
		return new Iterator() {
		    int position = -1;
            @Override
            public boolean hasNext() {
                return ++position < size;
            }

            @Override
            public Object next() {
                return elementData[position];
            }
		    
		};
	}
	
	private void resize() {
	    if(elementData == null) {
	        elementData = new Object[defaultCapacity];
	    }
	    if(elementData.length == size) {
	        Object[] elementTmp = new Object[(int)(1 + factor)*elementData.length];
	        System.arraycopy(elementData, 0, elementTmp, 0, elementData.length);
	        elementData = elementTmp;
	    }
	}
	
}
