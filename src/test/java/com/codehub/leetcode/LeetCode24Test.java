package com.codehub.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode24测试类
 * 测试链表为空null的情况
 * 测试链表长度为奇数的情况
 * 测试链表长度为偶数的情况
 * @author  Kay
 */
@RunWith(Parameterized.class)
public class LeetCode24Test {
    private LeetCode24 leetCode;
    private LeetCode24.ListNode listNode;
    private LeetCode24.ListNode ans;

    public LeetCode24Test(LeetCode24.ListNode listNode, LeetCode24.ListNode ans) {
        this.listNode = listNode;
        this.ans = ans;
    }

    @Before
    public void before() {
        leetCode = new LeetCode24();
    }

    @Parameters
    public static Collection<?> reverserArrays() {
        LeetCode24.ListNode head01   = new LeetCode24.ListNode(1);
        LeetCode24.ListNode second01 = new LeetCode24.ListNode(4);
        LeetCode24.ListNode third01  = new LeetCode24.ListNode(5);
        head01.next       = second01;
        second01.next     = third01;
        
        LeetCode24.ListNode ansHead01   = new LeetCode24.ListNode(4);
        LeetCode24.ListNode ansSecond01 = new LeetCode24.ListNode(1);
        LeetCode24.ListNode ansThird01  = new LeetCode24.ListNode(5);
        ansHead01.next       = ansSecond01;
        ansSecond01.next     = ansThird01;
        
        LeetCode24.ListNode head02   = new LeetCode24.ListNode(1);
        LeetCode24.ListNode second02 = new LeetCode24.ListNode(2);
        LeetCode24.ListNode third02  = new LeetCode24.ListNode(3);
        LeetCode24.ListNode fourth02  = new LeetCode24.ListNode(4);
        head02.next       = second02;
        second02.next     = third02;
        third02.next      = fourth02;

        LeetCode24.ListNode ansHead02   = new LeetCode24.ListNode(2);
        LeetCode24.ListNode ansSecond02 = new LeetCode24.ListNode(1);
        LeetCode24.ListNode ansThird02  = new LeetCode24.ListNode(4);
        LeetCode24.ListNode ansFourth02  = new LeetCode24.ListNode(3);
        ansHead02.next       = ansSecond02;
        ansSecond02.next     = ansThird02;
        ansThird02.next      = ansFourth02;
        
        
        return Arrays.asList(new Object[][] {
                { null, null},
                { head01, ansHead01 },
                { head02, ansHead02}
                });
    }

    @Test
    public void leetCode24() {
        assertEquals(ans, leetCode.swapPairs(listNode));
    }
}

