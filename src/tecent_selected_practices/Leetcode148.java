package tecent_selected_practices;
import java.util.*;
public class Leetcode148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		
		ListNode n_1=new ListNode(-1);
		ListNode n5=new ListNode(5);
		ListNode n3=new ListNode(3);
		ListNode n4=new ListNode(4);
		ListNode n0=new ListNode(0);
		
		n_1.next=n5;
		n5.next=n3;
		n3.next=n4;
		n4.next=n0;
		n0.next=null;
		
		ListNode newHead = s.sortList(n_1);
		ListNode p = newHead;
		while(p!=null) {
			System.out.println(p.val);
			p=p.next;
		}
		
	}

}

//class Solution {
//    public ListNode sortList(ListNode head) {
//    	int len=0;
//        ListNode p=head;
//        while(p!=null) {
//        	len+=1;
//        	p=p.next;
//        }
//        int[] nums=new int[len];
//
//        int i=0;
//        for(p=head;p!=null;p=p.next)
//        	nums[i++]=p.val;
//        
//        Arrays.sort(nums);
//        
//        ListNode dummyHead=new ListNode(-1);
//        p=dummyHead;
//        for(i=0;i<len;i++) {
//        	ListNode newNode=new ListNode(nums[i]);
//        	p.next=newNode;
//        	p=newNode;
//        }
//        p.next=null;
//        
//        return dummyHead.next;
//    }
//}