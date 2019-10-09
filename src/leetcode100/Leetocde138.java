package leetcode100;
import java.util.*;
public class Leetocde138 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
class Solution {
	Map<RandomListNode,RandomListNode> map=new HashMap<>();
	
    public RandomListNode copyRandomList(RandomListNode head) {
        if(head==null)	return null;
        
        	
        RandomListNode newHead=new RandomListNode(head.label);
        map.put(head, newHead);
        if(head.random!=null) {
        	if(map.containsKey(head.random)) 
        		newHead.random=map.get(head.random);
        	else {
        		newHead.random=copyRandomList(head.random);
        	}
        }else
        	newHead.random=null;
        
        if(head.next!=null) {
        	if(map.containsKey(head.next))
        		newHead.next=map.get(head.next);
        	else
        		newHead.next=copyRandomList(head.next);
        }else
        	newHead.next=null;
        
        return newHead;
    }
}*/