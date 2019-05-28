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
     * For循环遍历删除List元素测试，循环间隔删除List中的数据
     * 期望删除第0个，第2个，第4个...
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
     * For循环遍历删除List元素测试，连续删除List前N个元素
     * 期望删除第0个，第1个，第2个，第3个...
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
     * Foreach循环遍历删除List元素测试，循环间隔删除List中的数据
     * 期望删除第0个，第2个，第4个...
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
     * Foreach循环遍历删除List元素测试，连续删除List前N个元素
     * 期望删除第0个，第1个，第2个，第3个...
     */
    @Test
    public void listDeleteContinuityByForeach() {
        for (Integer element : list) {
            list.remove(element);
        }
    }

    /**
     * ForEach函数遍历删除List元素测试，循环间隔删除List中的数据
     * 期望删除第0个，第2个，第4个...
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
     * ForEach函数遍历删除List元素测试，连续删除List前N个元素
     * 期望删除第0个，第1个，第2个，第3个...
     */
    @Test
    public void listDeleteContinuityByForEach() {
        for (Integer element : list) {
            list.remove(element);
        }
    }

    /**
     * 通过Iterator迭代器遍历删除List元素测试，循环间隔删除List中的数据
     * 期望删除第0个，第2个，第4个...
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
     * 通过Iterator迭代器遍历删除List元素测试，连续删除List前N个元素
     * 期望删除第0个，第1个，第2个，第3个...
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