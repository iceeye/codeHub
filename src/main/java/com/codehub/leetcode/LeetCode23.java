package com.codehub.leetcode;

/**
 * LeetCode.23. Merge k Sorted Lists
 * https://leetcode-cn.com/problems/merge-k-sorted-lists/comments/
 * 
 * ������С���������
 * @author Kay
 *
 */
public class LeetCode23 {
    
    public ListNode mergeKSortedLists(ListNode[] listNodes) {
        
        if(listNodes == null || listNodes.length == 0) {
            return null;
        }
        ListNode head = listNodes[0];
        
        for(int i = 1; i < listNodes.length; i++) {
            head = mergeTwoList(head, listNodes[i]);
        }
        
        return head;
    }
    
    /**
     * ���������������ϲ���һ�����������
     * @param listNode01
     * @param listNode02
     * @return
     */
    public ListNode mergeTwoList(ListNode listNode01, ListNode listNode02) {
        if(listNode01 == null) {
            return listNode02;
        }
        if(listNode02 == null) {
            return listNode01;
        }
        // ȷ���ϲ������������е�һ������ĵ�һ��Ԫ������С��
        if(listNode01.val > listNode02.val) {
            return mergeTwoList(listNode02, listNode01);
        }
        
        
        ListNode headNode = listNode01;
            
        while(listNode01.next != null) {
            if(listNode02 != null && listNode01.next.val > listNode02.val) {
                ListNode node = listNode02;
                listNode02 = listNode02.next;
                node.next = listNode01.next;
                listNode01 = listNode01.next = node;
            } else {
                listNode01 = listNode01.next;
            }
        }
        
        listNode01.next = listNode02;

        return headNode;
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
         * �ж����������Ƿ����
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
                    // ����������β������ֵ����ȣ�����true
                    if(thisNodeTmp.next == null && anotherNodeTmp.next == null) {
                        return true;
                    }
                    // �����Ȳ�һ�£�����false
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

