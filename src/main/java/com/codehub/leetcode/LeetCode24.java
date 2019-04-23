package com.codehub.leetcode;

/**
 * LeetCode.24. Swap Nodes in Pairs
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * 可以使用递归实现
 *
 * @author Kay
 *
 */
public class LeetCode24 {
    
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode newHead = head.next;

        // 前一个完成交换的后一个结点
        ListNode frontNode = null;
        // 待交换的两个结点的第一个结点
        ListNode currNode = head;
        // 待交换的两个结点的第二个结点
        ListNode nextNode = head.next;

        while(nextNode != null) {
            // 交换结点
            if(frontNode != null) {
                frontNode.next = nextNode;
            }
            currNode.next  = nextNode.next;
            nextNode.next = currNode;

            // 移动到下两个待交换的结点
            frontNode = currNode;
            currNode  = currNode.next;
            nextNode  = currNode == null ? null : currNode.next;
        }

        return newHead;
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
        @Override
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

