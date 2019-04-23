package com.codehub.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode.19. Remove Nth Node From End of List
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * @author Kay
 *
 */
public class LeetCode19 {
    
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<ListNode>();
        
        ListNode nodeTmp = head;
        while(nodeTmp != null) {
            list.add(nodeTmp);
            nodeTmp = nodeTmp.next;
        }
        
        int size = list.size();
        
        // ֻ��һ���ڵ�����
        if(size == 1) {
            return null;
        }
        
        if(n == 1) {// ɾ��β�ڵ�
            list.get(size - 2).next = null;
        } else if(n == size) {// ɾ��ͷ�ڵ�
            head = head.next;
        } else {// ɾ���м�ڵ�
            list.get(size - n - 1).next = list.get(size - n + 1);
        }
        
        
        
        return head;
    }
    
    /**
     * ˫ָ�뷨
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd02(ListNode head, int n) {
        ListNode preHead = new ListNode(0);
        preHead.next = head;
        ListNode l1 = preHead;
        ListNode l2 = preHead;
        while(n > 0){
            l1 = l1.next;
            n--;
        }
        while(l1.next != null){
            l1 = l1.next;
            l2 = l2.next;
        }
        //l2����һ�������ǵ�����n��
        l2.next = l2.next.next;
        return preHead.next;
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

