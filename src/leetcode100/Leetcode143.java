package leetcode100;

public class Leetcode143 {

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
		s.reorderList(n1);
	}

}
/*
class Solution {
    public void reorderList(ListNode head) {
    	if(head.next==null||head.next.next==null)	return;
    	
    	int len=1;
    	ListNode p1=head,p2=head;
    	while(p2.next!=null) {
    		p2=p2.next;
    		len++;
    	}
    	ListNode tmp=head.next;
    	p1.next=p2;
    	p2.next=tmp;
    	len-=2;
    	while(len>0) {
    		p1=p2.next;
    		p2=p1;
    		for(int i=1;i<len;i++)
    			p2=p2.next;
    		tmp=p1.next;
    		p1.next=p2;
    		p2.next=tmp;
    		len-=2;
    	}
    p2.next=null;
    }
}*/


/*
class Solution{
public void reorderList(ListNode head) {
    if(head==null||head.next==null) return;
    
    //Find the middle of the list
    ListNode p1=head;
    ListNode p2=head;
    while(p2.next!=null&&p2.next.next!=null){ 
        p1=p1.next;
        p2=p2.next.next;
    }
    
    //Reverse the half after middle  1->2->3->4->5->6 to 1->2->3->6->5->4
    ListNode preMiddle=p1;
    ListNode preCurrent=p1.next;
    while(preCurrent.next!=null){
        ListNode current=preCurrent.next;
        preCurrent.next=current.next;
        current.next=preMiddle.next;
        preMiddle.next=current;
    }
    
    //Start reorder one by one  1->2->3->6->5->4 to 1->6->2->5->3->4
    p1=head;
    p2=preMiddle.next;
    while(p1!=preMiddle){
        preMiddle.next=p2.next;
        p2.next=p1.next;
        p1.next=p2;
        p1=p2.next;
        p2=preMiddle.next;
    }
}
}
*/



/*
class Solution {
    public void reorderList(ListNode head) {
    	if(head==null||head.next==null||head.next.next==null)	return;
    	
    	// 1 2 3 4 5 6 ===> 1 2 3 6 5 4
    	ListNode p1=head,p2=head,p3,pMid;
    	while(p2.next!=null&&p2.next.next!=null) {
    		p1=p1.next;
    		p2=p2.next.next;
    	}
    	
    	p2=p1.next;pMid=p1;
    	while(p2.next!=null) {
    		p3=p2.next;
    		p2.next=p3.next;
    		p3.next=p1.next;
    		p1.next=p3;
    	}
    	
    	// 1 2 3 6 5 4 ==> 1 6 2 5 3 4
    	p1=head;p2=pMid.next;
    	while(p1!=pMid) {
    		pMid.next=p2.next;
    		p2.next=p1.next;
    		p1.next=p2;
    		p1=p2.next;
    		p2=pMid.next;
    	}
    }
}

*/