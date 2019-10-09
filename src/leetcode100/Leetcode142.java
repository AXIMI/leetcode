package leetcode100;
import java.util.*;
public class Leetcode142 {

	public static void main(String[] args) {
		Solution s=new Solution();
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n2;
		if(s.detectCycle(n1)!=null)
			System.out.println(s.detectCycle(n1).val);
		else
			System.out.println(-1);
	}
}
/*
class Solution {
	public ListNode detectCycle(ListNode head) {
        if(head==null||head.next==null)	return null;
        
        Map<ListNode,Boolean> map=new HashMap<>();
        ListNode p=head;
        while(p!=null) {
        	if(map.containsKey(p))	return p;
        	map.put(p, true);
        	p=p.next;
        }
        return null;
    }
}

class Solution{
	public ListNode detectCycle(ListNode head) {
		if(head==null||head.next==null)	return null;
		
		ListNode p1=head.next,p2=head.next.next;
		while(p1!=p2) {
			p1=p1.next;
			p2=p2.next.next;
		}
		p1=head;
		while(p1!=p2) {
			p1=p1.next;
			p2=p2.next;
		}
		return p1;
	}
}*/