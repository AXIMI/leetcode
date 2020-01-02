package tecent_selected_practices;

public class Leetcode206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n5=new ListNode(5);
		
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		
		ListNode newHead=s.reverseList(n1);
		while(newHead!=null) {
			System.out.println(newHead.val);
			newHead=newHead.next;
		}
			
	}

}

//class Solution {
//    public ListNode reverseList(ListNode head) {
//    	if(head==null||head.next==null)	return head;
//    	
//    	ListNode dummy=new ListNode(-1);
//    	dummy.next=head;
//    	
//    	ListNode trueTail=head,curHead=head.next, dummyNext=dummy.next;
//    	
//    	while(trueTail.next!=null) {
//    		dummyNext=dummy.next;
//    		dummy.next=curHead;
//    		trueTail.next=curHead.next;
//    		curHead.next=dummyNext;
//    		curHead=trueTail.next;
//    	}
//    	return dummy.next;
//    }
//}