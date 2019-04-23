package com.codehub.leetcode;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * LeetCode860Test
 * @author Kay
 */
@RunWith(Parameterized.class)
public class LeetCode860Test {
    private LeetCode860 leetCode;
    private int[] bills;
    private boolean ans;

    public LeetCode860Test(int[] bills, boolean ans) {
        this.bills = bills;
        this.ans = ans;
    }

    @Before
    public void before() {
        leetCode = new LeetCode860();
    }

    @Parameters
    public static Collection<?> lemonadeChange() {
        List<Object[]> list = new ArrayList<Object[]>();
        
        Object[] test01 = new Object[]{new int[]{5, 5, 5, 10, 20}, true};
        list.add(test01);
        
        Object[] test02 = new Object[]{new int[]{5, 5, 10}, true};
        list.add(test02);
        
        Object[] test03 = new Object[]{new int[]{10, 10}, false};
        list.add(test03);
        
        Object[] test04 = new Object[]{new int[]{5, 5 ,10 ,10 ,20}, false};
        list.add(test04);
        
        Object[] test05 = new Object[]{new int[]{5, 5, 5, 5, 20, 20, 5, 5, 20, 5}, false};
        list.add(test05);

        return list;
    }

    @Test
    public void leetCode40() {
        assertEquals(ans, leetCode.lemonadeChange(bills));
    }
}
