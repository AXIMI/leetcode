package leetcode100;
import java.util.*;
public class Leetcode141 {

	public static void main(String[] args) {
		Solution s=new Solution();
		ListNode n1=new ListNode(1);
		ListNode n2=new ListNode(2);
		//ListNode n3=new ListNode(3);
		//ListNode n4=new ListNode(4);
		n1.next=n2;
		n2.next=n1;
		//n3.next=n4;
		//n4.next=n2;
		System.out.println(s.hasCycle(n1));
	}

}
/*
class Solution {
    public boolean hasCycle(ListNode head) {
        if(head.next==null)	return false;
        
        Map<ListNode,Boolean> map=new HashMap<>();
        ListNode p=head;
        while(p!=null) {
        	if(map.containsKey(p))	return true;
        	map.put(p, true);
        	p=p.next;
        }
        return false;
    }
}*/