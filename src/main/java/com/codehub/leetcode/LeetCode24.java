package com.codehub.leetcode;

/**
 * LeetCode.24. Swap Nodes in Pairs
 * https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * ����ʹ�õݹ�ʵ��
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

        // ǰһ����ɽ����ĺ�һ�����
        ListNode frontNode = null;
        // ���������������ĵ�һ�����
        ListNode currNode = head;
        // ���������������ĵڶ������
        ListNode nextNode = head.next;

        while(nextNode != null) {
            // �������
            if(frontNode != null) {
                frontNode.next = nextNode;
            }
            currNode.next  = nextNode.next;
            nextNode.next = currNode;

            // �ƶ����������������Ľ��
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

