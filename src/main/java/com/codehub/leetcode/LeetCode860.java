package com.codehub.leetcode;

/**
 * LeetCode860
 * @author Kay
 */
public class LeetCode860 {
    
    public boolean lemonadeChange(int[] bills) {
        int fiveDollar   = 0;
        int tenDollar    = 0;
        
        for(int i = 0; i < bills.length; i++) {
            if(bills[i] == 10) {
                if(fiveDollar < 1) {
                    return false;
                }
                tenDollar++;
                fiveDollar--;
            } else if(bills[i] == 20) {
                if((tenDollar >=1 && fiveDollar >=1)) {
                    tenDollar--;
                    fiveDollar--;
                } else if(fiveDollar >= 3) {
                    fiveDollar -= 3;
                } else {
                    return false;
                }
            } else {
                fiveDollar++;
            }
        }
        
        return true;
    }
    
}
