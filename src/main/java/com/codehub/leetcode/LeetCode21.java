package com.codehub.leetcode;

/**
 * LeetCode.21. Merge Two Sorted Lists
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 * @author Kay
 *
 */
public class LeetCode21 {
    
    public ListNode mergeTwoLists(ListNode listNode01, ListNode listNode02) {
        
        if(listNode01 == null) {
            return listNode02;
        }
        if(listNode02 == null) {
            return listNode01;
        }
        
        ListNode ansHead;
        ListNode tmpNode;
        
        if(listNode01.val <= listNode02.val) {
            ansHead = new ListNode(listNode01.val);
            listNode01 = listNode01.next;
        } else {
            ansHead = new ListNode(listNode02.val);
            listNode02 = listNode02.next;
        }
        
        tmpNode = ansHead;
        
        while(listNode01 != null || listNode02 != null) {
            if(listNode01 == null) {
                tmpNode.next = listNode02;
                break;
            }
            if(listNode02 == null) {
                tmpNode.next = listNode01;
                break;
            }
            
            if(listNode01.val <= listNode02.val) {
                tmpNode.next = new ListNode(listNode01.val);
                listNode01 = listNode01.next;
            } else {
                tmpNode.next = new ListNode(listNode02.val);
                listNode02 = listNode02.next;
            }
            tmpNode = tmpNode.next;
            
        }
        
        return ansHead;
    }
    
    /**
     * Definition for singly-linked list.
     * @author Kay
     *
     */
    public static class ListNode {
        public int val;
        public ListNode next;
        
        public ListNode(int val) {
            this.val = val;
        }
 
        /**
         * 判断两个链表是否相等
         */
        public boolean equals(Object anObject) {
            if (this == anObject) {
                return true;
            }
            if(anObject == null) {
                return false;
            }
            if (anObject instanceof ListNode) {
                ListNode anotherListNode = (ListNode)anObject;
                
                ListNode thisNodeTmp = this;
                ListNode anotherNodeTmp = anotherListNode;
                while(thisNodeTmp.val == anotherNodeTmp.val) {
                    // 遍历到链表尾，所有值都相等，返回true
                    if(thisNodeTmp.next == null && anotherNodeTmp.next == null) {
                        return true;
                    }
                    // 链表长度不一致，返回false
                    if(thisNodeTmp.next == null || anotherNodeTmp.next == null) {
                        return false;
                    }
                    thisNodeTmp = thisNodeTmp.next;
                    anotherNodeTmp = anotherNodeTmp.next;
                }
            }
            return false;
        }
    }
}

