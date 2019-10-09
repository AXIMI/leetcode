package leetcode100;

public class Leetcode147 {

	public static void main(String[] args) {
		ListNode n1=new ListNode(6);
		ListNode n2=new ListNode(5);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(1);
		ListNode n5=new ListNode(8);
		ListNode n6=new ListNode(7);
		ListNode n7=new ListNode(2);
		ListNode n8=new ListNode(4);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=n6;
		n6.next=n7;
		n7.next=n8;
		n8.next=null;
		Solution s=new Solution();
		s.insertionSortList(n1);
	}

}

/*
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode cur=dummy;
        while(head!=null) {
        	ListNode pn=head.next;
        	cur=dummy;
        	while(cur.next!=null&&cur.next.val<=head.val) {
        		cur=cur.next;
        	}
        	head.next=cur.next;
        	cur.next=head;
        	head=pn;
        }
    	return dummy.next;
    }
}*/