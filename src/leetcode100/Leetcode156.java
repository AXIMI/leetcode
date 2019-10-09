package leetcode100;
import java.util.*;
public class Leetcode156 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	
}

class ListNode {
    int val;
    ListNode next;
	ListNode(int x){val=x;};
}

class MinStack {
    Stack<Integer> stack=new Stack<>();
    int min=Integer.MAX_VALUE;
	
    /** initialize your data structure here. */
    public MinStack() {
    }
    
    public void push(int x) {
    	if(x<min)	min=x;
    	stack.push(x);
    }
    
    public void pop() {
        if(min==stack.pop())	min=stack.pop();
    }
    
    public int top() {
        
    }
    
    public int getMin() {
        
    }
}