package leetcode300;
import java.util.*;
public class Leetcode309 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] prices= {1,2,3,4,5,6};
		System.out.println(s.maxProfit(prices));
	}

}

//class Solution{
//public int maxProfit(int[] prices) {
//	int len=prices.length;
//	int[] buy=new int[len];
//	int[] sell=new int[len];
//	
//	buy[0]=-prices[0];buy[1]=Math.max(-prices[0], -prices[1]);
//	sell[0]=0;sell[1]=Math.max(0,buy[1]+prices[1]);
//	for(int i=2;i<prices.length;i++) {
//		buy[i]=Math.max(buy[i-1], sell[i-2]-prices[i]);
//		sell[i]=Math.max(sell[i-1], buy[i-1]+prices[i]);
//	}
//	return sell[len-1];
//	}
//}

//class Solution{
//	public int maxProfit(int[] prices) {
//		if(prices==null||prices.length<2)	return 0;
//		int s0=0,s1=0,s2=0,preS0=0,preS1=-prices[0],preS2=0;
//		for(int i=1;i<prices.length;i++) {
//			s0=Math.max(preS0, preS2);
//			s1=Math.max(preS0-prices[i],preS1);
//			s2=preS1+prices[i];
//			preS0=s0;
//			preS1=s1;
//			preS2=s2;
//		}
//		return Math.max(s0, s2);
//	}
//}



//class Solution {
//    public int maxProfit(int[] prices) {
//    	if(prices==null||prices.length<2)	return 0;
//    	if(prices.length==2) return prices[1]>prices[0]?prices[1]-prices[0]:0;
//    	
//    	LinkedList<Integer> profits=new LinkedList<>();
//    	int profit=0;
//    	for(int i=1;i<prices.length;i++) {
//    		if(prices[i]>prices[i-1])	profit+=prices[i]-prices[i-1];
//    		else{
//    			if(profit==0)	continue;
//    			profits.add(profit);
//    			profit=0;
//    			if(prices[i]>prices[i+1])	profits.add(0);
//    		}
//    	}
//    	if(profit>0)	profits.add(profit);
//    	
//    	int[] history=new int[profits.size()];
//
//    	history[0]=Math.max(0, profits.get(0));
//    	history[1]=Math.max(0, Math.max(profits.get(0), profits.get(1)));
//    	for(int i=2;i<profits.size();i++)
//    		history[i]=Math.max(history[i-1], history[i-2]+profits.get(i));
//    	return history[history.length-1];
//    }
//}