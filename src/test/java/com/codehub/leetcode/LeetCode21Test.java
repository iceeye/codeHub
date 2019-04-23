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
public class LeetCode21Test {
    private LeetCode21 leetCode;
    private LeetCode21.ListNode head01;
    private LeetCode21.ListNode head02;
    private LeetCode21.ListNode ans;

    public LeetCode21Test(LeetCode21.ListNode head01, LeetCode21.ListNode head02, LeetCode21.ListNode ans) {
        this.head01 = head01;
        this.head02 = head02;
        this.ans = ans;
    }

    @Before
    public void before() {
        leetCode = new LeetCode21();
    }

    @Parameters
    public static Collection<?> reverserArrays() {
        LeetCode21.ListNode head01   = new LeetCode21.ListNode(1);
        LeetCode21.ListNode second01 = new LeetCode21.ListNode(2);
        LeetCode21.ListNode third01  = new LeetCode21.ListNode(4);
        head01.next       = second01;
        second01.next     = third01;
        
        LeetCode21.ListNode head02   = new LeetCode21.ListNode(1);
        LeetCode21.ListNode second02 = new LeetCode21.ListNode(3);
        LeetCode21.ListNode third02  = new LeetCode21.ListNode(4);
        head02.next       = second02;
        second02.next     = third02;
        
        LeetCode21.ListNode head    = new LeetCode21.ListNode(1);
        LeetCode21.ListNode second  = new LeetCode21.ListNode(1);
        LeetCode21.ListNode third  = new LeetCode21.ListNode(2);
        LeetCode21.ListNode fourth  = new LeetCode21.ListNode(3);
        LeetCode21.ListNode fifth  = new LeetCode21.ListNode(4);
        LeetCode21.ListNode sixth  = new LeetCode21.ListNode(4);
        head.next       = second;
        second.next     = third;
        third.next      = fourth;
        fourth.next     = fifth;
        fifth.next      = sixth;    
        
        
        return Arrays.asList(new Object[][] { 
                { head01, head02, head }
                });
    }

    @Test
    public void LeetCode21() {
        assertEquals(ans, leetCode.mergeTwoLists(head01, head02));
    }
}

