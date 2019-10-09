package leetcode100;
import java.util.*;
public class Leetcode150 {

	public static void main(String[] args) {
		Solution s=new Solution();
		String[] tokens= {"2","1","+","3","*"};
		//String[] tokens= {"10","6","9","3","+","-11","*","/","*",
		//		"17","+","5","+"};
		System.out.println(s.evalRPN(tokens));
	}

}
/*
class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==0)	return 0;
        
        Stack<Integer> stack=new Stack<>();
        for(String s: tokens) {
        	if(s.equals("+")) {
        		stack.push(stack.pop()+stack.pop());
        	}else if(s.equals("-")) {
        		stack.push(-1*stack.pop()+stack.pop());
        	}else if(s.equals("*")) {
        		stack.push(stack.pop()*stack.pop());
        	}else if(s.equals("/")) {
        		int num1=stack.pop();
        		int num2=stack.pop();
        		stack.push(num2/num1);
        	}
        	else stack.push(Integer.parseInt(s));
        }
        
        return stack.pop();
    }
}*/