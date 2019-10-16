package leetcode300;

public class Leetcode328 {

	public static void main(String[] args) {
		Solution s= new Solution();
		ListNode
	}

}

//class Solution {
//    public ListNode oddEvenList(ListNode head) {
//        ListNode trueHead = new ListNode(-1);
//        ListNode dummyHead = new ListNode(-1);
//        
//        ListNode p = head, p1=trueHead, p2=dummyHead;
//        while(p!=null) {
//        	p1.next = p;
//        	p2.next=p.next;
//        	p1=p1.next;
//        	p2=p2.next;
//        	
//        	p=p.next;
//        	if(p!=null)	p=p.next;
//        }
//        
//        if(p2!=null)	p2.next=null;
//        p1.next=dummyHead.next;
//        return trueHead.next;
//    }
//}