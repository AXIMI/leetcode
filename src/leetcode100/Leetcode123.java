package leetcode100;

public class Leetcode123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//class Solution {
//    public int maxProfit(int[] prices) {
//    	int buy1=Integer.MIN_VALUE,buy2=Integer.MIN_VALUE;
//    	int sell1=0,sell2=0;
//    	
//    	for(int price : prices) {
//    		sell2=Math.max(sell2, buy2+price);
//    		buy2=Math.max(buy2, -price+sell1);
//    		sell1=Math.max(sell1,buy1+price);
//    		buy1=Math.max(buy1, -price);
//    	}
//    	return sell2;
//    }
//}