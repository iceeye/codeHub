package com.codehub.java.collection.list;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDeleteTest {

    private List<Integer> list;
    Integer[] integers = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    @Before
    public void initArrayList() {
        // https://www.cnblogs.com/liushaobo/p/4423102.html
        list = new ArrayList<>(Arrays.asList(integers));
    }

    @After
    public void printArrayList() {
        System.out.printf(list.toString());
    }

    /**
     * Forѭ������ɾ��ListԪ�ز��ԣ�ѭ�����ɾ��List�е�����
     * ����ɾ����0������2������4��...
     */
    @Test
    public void listDeleteByFor() {
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                list.remove(i);
            }
        }
    }

    /**
     * Forѭ������ɾ��ListԪ�ز��ԣ�����ɾ��ListǰN��Ԫ��
     * ����ɾ����0������1������2������3��...
     */
    @Test
    public void listDeleteContinuityByFor() {
        for (int i = 0; i < list.size(); i++) {
            if (i < 6) {
                list.remove(i);
            }
        }
    }

    /**
     * Foreachѭ������ɾ��ListԪ�ز��ԣ�ѭ�����ɾ��List�е�����
     * ����ɾ����0������2������4��...
     */
    @Test
    public void listDeleteByForeach() {
        for (Integer element : list) {
            if (element % 2 == 0) {
                list.remove(element);
            }
        }
    }

    /**
     * Foreachѭ������ɾ��ListԪ�ز��ԣ�����ɾ��ListǰN��Ԫ��
     * ����ɾ����0������1������2������3��...
     */
    @Test
    public void listDeleteContinuityByForeach() {
        for (Integer element : list) {
            list.remove(element);
        }
    }

    /**
     * ForEach��������ɾ��ListԪ�ز��ԣ�ѭ�����ɾ��List�е�����
     * ����ɾ����0������2������4��...
     */
    @Test
    public void listDeleteByForEach() {
        list.forEach(v -> {
            if (v % 2 == 0) {
                list.remove(v);
            }
        });
    }

    /**
     * ForEach��������ɾ��ListԪ�ز��ԣ�����ɾ��ListǰN��Ԫ��
     * ����ɾ����0������1������2������3��...
     */
    @Test
    public void listDeleteContinuityByForEach() {
        for (Integer element : list) {
            list.remove(element);
        }
    }

    /**
     * ͨ��Iterator����������ɾ��ListԪ�ز��ԣ�ѭ�����ɾ��List�е�����
     * ����ɾ����0������2������4��...
     */
    @Test
    public void listDeleteByIterator() {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element % 2 == 0) {
                iterator.remove();
            }
        }
    }

    /**
     * ͨ��Iterator����������ɾ��ListԪ�ز��ԣ�����ɾ��ListǰN��Ԫ��
     * ����ɾ����0������1������2������3��...
     */
    @Test
    public void listDeleteContinuityByIterator() {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            if (element < 6) {
                iterator.remove();
            }
        }
    }
}