package leetcode100;
import java.util.*;
public class Leetcode121 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] prices= {7,1,5,3,6,4};
		System.out.println(s.maxProfit(prices));
	}

}

//class Solution {
//    public int maxProfit(int[] prices) {
//    	if(prices==null||prices.length<2)	return 0;
//    	int res=0,min=Integer.MAX_VALUE;
//    	
//    	for(int price : prices) {
//    		if(price<min)
//    			min=price;
//    		else
//    			res=Math.max(res, price-min);
//    	}
//    	return res;
//    }
//}




//class Solution {
//    public int maxProfit(int[] prices) {
//    	int res=0;
//    	if(prices==null||prices.length<2)	return res;
//    	
//    	Stack<Integer> stack=new Stack<>();
//    	for(int price : prices) {
//    		if(stack.isEmpty()) stack.push(price);
//    		else if(stack.peek()>price) {
//    			while(!stack.isEmpty()&&stack.peek()>price)
//    				stack.pop();
//    			if(stack.isEmpty())
//    				stack.push(price);
//    		}else
//    			res=Math.max(res, price-stack.get(0));
//    	}
//    	return res;
//    }
//}