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
public class LeetCode19Test {
    private LeetCode19 leetCode;
    private LeetCode19.ListNode head;
    private int index;
    private LeetCode19.ListNode ans;

    public LeetCode19Test(LeetCode19.ListNode head, int index, LeetCode19.ListNode ans) {
        this.head = head;
        this.index = index;
        this.ans = ans;
    }

    @Before
    public void before() {
        leetCode = new LeetCode19();
    }

    @Parameters
    public static Collection<?> reverserArrays() {
        LeetCode19.ListNode head   = new LeetCode19.ListNode(1);
        LeetCode19.ListNode second = new LeetCode19.ListNode(2);
        LeetCode19.ListNode third  = new LeetCode19.ListNode(3);
        LeetCode19.ListNode four   = new LeetCode19.ListNode(4);
        LeetCode19.ListNode five   = new LeetCode19.ListNode(5);
        head.next       = second;
        second.next     = third;
        third.next      = four;
        four.next       = five;
        
        LeetCode19.ListNode head01   = new LeetCode19.ListNode(1);
        LeetCode19.ListNode second01 = new LeetCode19.ListNode(2);
        LeetCode19.ListNode third01  = new LeetCode19.ListNode(3);
        LeetCode19.ListNode five01   = new LeetCode19.ListNode(5);
        head01.next       = second01;
        second01.next     = third01;
        third01.next      = five01;
        
        LeetCode19.ListNode head02    = new LeetCode19.ListNode(2);
        LeetCode19.ListNode second02  = new LeetCode19.ListNode(3);
        head02.next       = second02;
        
        
        return Arrays.asList(new Object[][] { 
                { head, 2, head01 },
                { head, 4, second },
                { second, 1, head02}
                });
    }

    @Test
    public void LeetCode19() {
        assertEquals(ans, leetCode.removeNthFromEnd(head, index));
    }
}

