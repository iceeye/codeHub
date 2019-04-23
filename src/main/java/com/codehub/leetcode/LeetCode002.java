package com.codehub.leetcode;

public class LeetCode002 {

	public static void main(String[] args) {
		ListNode ln1 = new ListNode(2);
        ListNode ln2 = new ListNode(4);
        ListNode ln3 = new ListNode(3);
        ln1.next = ln2;
        ln2.next = ln3;
        
        ListNode ln21 = new ListNode(5);
        ListNode ln22 = new ListNode(6);
        ListNode ln23 = new ListNode(4);
        ln21.next = ln22;
        ln22.next = ln23;
        
        ListNode ln = addTwoNumbers(ln1, ln21);
        System.out.print(ln.val);
        while(ln.next != null) {
        	System.out.print(ln.next.val);
        	ln = ln.next;
        }
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        ListNode re = new ListNode(0);//返回结果取re.next
        ListNode p = l1, q = l2, curNode = re;
        int carry = 0;//保存进位，值为0或1

        while(p != null || q != null) {
        	int x = (p == null) ? 0 : p.val;//如果没有值则用0替代
        	int y = (q == null) ? 0 : q.val;
        	int sum = x + y + carry;
        	
        	carry = sum/10;
        	curNode.next = new ListNode(sum%10);
        	curNode = curNode.next;
        	if(p != null) 
        		p = p.next;
        	if(q != null)
        		q = q.next;
        }
        if(carry != 0) {//循环结束后，如果进位为1则增加此节点
        	curNode.next = new ListNode(carry);
        }

		return re.next;//re头节点的下一个节点作为返回结果的头结点
    }
	/**
	 * 链表反转
	 * @param list
	 * @return
	 */
	private static ListNode reverseList(ListNode list) {
		ListNode reverseHeadNode = null;
		ListNode curNode = list;
		ListNode prevNode = null;
		
		while(curNode != null) {
			ListNode nextNode = curNode.next;
			curNode.next = prevNode;
			prevNode = curNode;
			if(nextNode == null) 
				reverseHeadNode = curNode;
			curNode = nextNode;
		}
		return reverseHeadNode;
	}
	
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
