package leetcode100;

public class Leetcode148 {

	public static void main(String[] args) {
		Solution s=new Solution();
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
		
		ListNode tmp=s.sortList(n1);
		while(tmp!=null) {
			System.out.print(tmp.val+" ");
			tmp=tmp.next;
		}
	}

}
/*
class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)	return head;
        
        // divide the list into 2
        ListNode pre=null,slow=head,fast=head;
        while(fast!=null&&fast.next!=null) {
        	pre=slow;
        	slow=slow.next;
        	fast=fast.next.next;
        }
        pre.next=null;
        head=sortList(head);
        slow=sortList(slow);
        return mergeSort(head,slow);
    }
    
    public ListNode mergeSort(ListNode head1,ListNode head2) {
    	ListNode dummy=new ListNode(-1);
    	ListNode p=dummy,p1=head1,p2=head2;
    	while(p1!=null&&p2!=null) {
    		if(p1.val<p2.val) {
    			p.next=p1;
    			p1=p1.next;
    		}else {
    			p.next=p2;
    			p2=p2.next;
    		}p=p.next;
    	}
    	while(p1!=null) {
    		p.next=p1;
			p1=p1.next;
			p=p.next;
    	}
    	while(p2!=null) {
    		p.next=p2;
			p2=p2.next;
			p=p.next;
    	}
    	return dummy.next;
    }
}*/