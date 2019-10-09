package leetcode200;
import java.util.*;
public class Leetcode234 {

	public static void main(String[] args) {
		Solution s=new Solution();
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(0);
		ListNode n3=new ListNode(0);
		ListNode n4=new ListNode(1);
		ListNode n5=new ListNode(1);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=null;
		n4.next=null;
		n5.next=null;
		
		
//		ListNode head=s.reverseList(n1);
		
//		ListNode p=head;
//		while(p!=null) {
//			System.out.println(p.val+"  ");
//			p=p.next;
//		}
		
		System.out.println(s.isPalindrome(n1));
	}

}

//class Solution {
//    public boolean isPalindrome(ListNode head) {
//    	if(head==null) return true;
//    	
//    	int len=0;
//    	ListNode p1,p2,p=head;
//    	while(p!=null) {
//    		len++;
//    		p=p.next;
//    	}
//    	if(len==2)	return head.val==head.next.val;
//    	
//    	p2=head;
//    	int range=len%2==0?len/2-1:len/2;
//    	for(int i=0;i<range;i++)
//    		p2=p2.next;
//    	p2.next=reverseList(p2.next);
//    	
//    	p1=head;p2=p2.next;
//    	for(int i=0;i<len/2;i++) {
//    		if(p1.val!=p2.val)
//    			return false;
//    		p1=p1.next;
//    		p2=p2.next;
//    		
//    	}
//    	return true;
//    }
//    
//    public ListNode reverseList(ListNode head) {
//    	if(head==null) return null;
//    	
//    	// 先检查一下链表的长度，如果链表只有两个节点就直接翻转，不用借助三个指针
//    	int len=0;
//    	ListNode p=head;
//    	while(p!=null) {
//    		len++;
//    		p=p.next;
//    	}
//    	if(len==1)	return head;
//    	if(len==2) {
//    		ListNode newHead=head.next;
//    		newHead.next=head;
//    		head.next=null;
//    		return newHead; 
//    	}
//    		
//    	// 链表长度超过3个节点时，需要借助辅助头节点dummy和三个指针 
//    	ListNode dummy=new ListNode(-1);
//    	dummy.next=head;
//    	
//    	ListNode p1=head,p2=p1.next,p3=p2.next;
//    	while(p2!=null) {
//    		p2.next=dummy.next;
//    		p1.next=p3;
//    		dummy.next=p2;
//    		
//    		p2=p3;
//    		if(p2!=null) p3=p2.next;
//    	}
//    	return dummy.next;
//    }
//}