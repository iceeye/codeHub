package com.codehub.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LeetCode23Test {
    private LeetCode23 leetCode;
    private LeetCode23.ListNode[] listNodes;
    private LeetCode23.ListNode ans;

    public LeetCode23Test(LeetCode23.ListNode[] listNodes, LeetCode23.ListNode ans) {
        this.listNodes = listNodes;
        this.ans = ans;
    }

    @Before
    public void before() {
        leetCode = new LeetCode23();
    }

    @Parameters
    public static Collection<?> reverserArrays() {
        LeetCode23.ListNode head01   = new LeetCode23.ListNode(1);
        LeetCode23.ListNode second01 = new LeetCode23.ListNode(4);
        LeetCode23.ListNode third01  = new LeetCode23.ListNode(5);
        head01.next       = second01;
        second01.next     = third01;
        
        LeetCode23.ListNode head02   = new LeetCode23.ListNode(1);
        LeetCode23.ListNode second02 = new LeetCode23.ListNode(3);
        LeetCode23.ListNode third02  = new LeetCode23.ListNode(4);
        head02.next       = second02;
        second02.next     = third02;
        
        LeetCode23.ListNode head03   = new LeetCode23.ListNode(2);
        LeetCode23.ListNode second03 = new LeetCode23.ListNode(6);
        head03.next       = second03;
        
        LeetCode23.ListNode head    = new LeetCode23.ListNode(1);
        LeetCode23.ListNode second  = new LeetCode23.ListNode(1);
        LeetCode23.ListNode third  = new LeetCode23.ListNode(2);
        LeetCode23.ListNode fourth  = new LeetCode23.ListNode(3);
        LeetCode23.ListNode fifth  = new LeetCode23.ListNode(4);
        LeetCode23.ListNode sixth  = new LeetCode23.ListNode(4);
        LeetCode23.ListNode seventh  = new LeetCode23.ListNode(5);
        LeetCode23.ListNode eighth  = new LeetCode23.ListNode(6);
        head.next       = second;
        second.next     = third;
        third.next      = fourth;
        fourth.next     = fifth;
        fifth.next      = sixth;  
        sixth.next      = seventh;
        seventh.next    = eighth;
        
        
        return Arrays.asList(new Object[][] { 
                { new LeetCode23.ListNode[]{head01, head02, head03}, head }
                });
    }

    @Test
    public void LeetCode23() {
        assertEquals(ans, leetCode.mergeKSortedLists(listNodes));
    }
}

