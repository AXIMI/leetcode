package leetcode200;

public class Leetcode206 {

	public static void main(String[] args) {
		Solution s=new Solution();
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		n1.next=null;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		
		ListNode head=s.reverseList(n1);
		ListNode p=head;
		while(p!=null) {
			System.out.print(p.val+"  ");
			p=p.next;
		}
	}

}

//class Solution {
//    public ListNode reverseList(ListNode head) {
//    	if(head==null||head.next==null)	return head;
//    	ListNode dummy=new ListNode(-1);
//    	dummy.next=head;
//    	ListNode p1=dummy,p2=dummy,tail=head;
//    	
//    	while(p2!=null) {
//    		p1=tail.next;
//    		p2=p1.next;
//    		tail.next=p2;
//    		p1.next=dummy.next;
//    		dummy.next=p1;
//    	}
//    	return dummy.next;
//    }
//}