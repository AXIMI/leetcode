package leetcode100;
import java.util.*;
public class Leetcode160 {

	public static void main(String[] args) {
		Solution s=new Solution();
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		ListNode n6=new ListNode(6);

		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=null;
		
		System.out.print(s.getIntersectionNode(n1, n3).val);
	}

}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

/*
class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode,Integer> map=new HashMap<>();
        
        ListNode p1=headA;
        ListNode p2=headB;
        while(p1!=null||p2!=null) {
        	if(p1!=null) {
        		if(map.containsKey(p1))	return p1;
        		map.put(p1, 1);
        		p1=p1.next;
        	}
        	if(p2!=null) {
        		if(map.containsKey(p2)) return p2;
        		map.put(p2,1);
        		p2=p2.next;
        	}
        }
        return null;
    }
}

*/

/*
class Solution{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if(headA==null||headB==null)	return null;
		ListNode p1=headA;
		ListNode p2=headB;
		
		while(p1!=p2) {
			p1=p1==null?headB:p1.next;
			p2=p2==null?headA:p2.next;
		}
		return p1;
	}
}
*/



/*
the first example

ListNode n1=new ListNode(4);
ListNode n2=new ListNode(1);
ListNode n3=new ListNode(8);
ListNode n4=new ListNode(4);
ListNode n5=new ListNode(5);
ListNode n6=new ListNode(5);
ListNode n7=new ListNode(0);
ListNode n8=new ListNode(1);

n1.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=n5;
n5.next=null;
n6.next=n7;
n7.next=n8;
n8.next=n3;
*/