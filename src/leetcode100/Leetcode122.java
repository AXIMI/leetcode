package leetcode100;

public class Leetcode122 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] prices= {5,4,3,2,1};
		System.out.println(s.maxProfit(prices));
	}

}

//class Solution {
//    public int maxProfit(int[] prices) {
//        if(prices==null||prices.length<2)	return 0;
//        
//        int res=0,buy=prices[0],len=prices.length;
//        for(int i=1;i<len;i++) {
//        	if(prices[i]<prices[i-1])
//        		buy=prices[i];
//        	else {
//        		while(i<len&&prices[i]>prices[i-1])	i++;
//        		if(prices[i-1]>buy)	res+=prices[i-1]-buy;
//        		if(i!=len)	buy=prices[i];
//        	}
//        }
//        return res;
//    }
//}