package leetcode200;

public class Leetcode203 {

	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(3);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(3);
		ListNode n5 = new ListNode(3);

		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		ListNode p=s.removeElements(n1, 2);
		while(p!=null) {
			System.out.println(p.val+"  ");
			p=p.next;
		}
	}

}

//class Solution {
//	public ListNode removeElements(ListNode head, int val) {
//		ListNode dummy = new ListNode(0);
//		dummy.next = head;
//		ListNode p1 = dummy, p2 = dummy.next;
//
//		while (p2!= null) {
//			while ( p2!= null && p2.val != val) {
//				p1.next=p2;
//				p1=p2;
//				p2=p2.next;
//			}
//			if(p2!=null&&p2.val==val) {
//				while(p2!=null&&p2.val==val)
//					p2=p2.next;
//				p1.next=p2;
//			}
//		}
//		return dummy.next;
//	}
//}
