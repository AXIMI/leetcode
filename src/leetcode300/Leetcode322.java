package leetcode300;

public class Leetcode322 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] coins= {474,83,404,3};
		System.out.println(s.coinChange(coins, 264));
	}

}

//class Solution {
//    public int coinChange(int[] coins, int amount) {
//    	if(amount==0)	return 0;
//    	for(int coin : coins)
//    		if(amount==coin)	return 1;
//    	
//    	int[] cnt=new int[amount];
//    	for(int i=0;i<amount;i++) {
//    		cnt[i]=Integer.MAX_VALUE;
//    		for(int coin:coins) {
//    			if(i+1<coin)	continue;
//    			else if(i+1==coin) {
//    				cnt[i]=1;
//    				continue;
//    			}else {
//    				if(cnt[i-coin]==Integer.MAX_VALUE)	continue;
//    				cnt[i]=Math.min(cnt[i], cnt[i-coin]+1);
//    			}
//    		}
//    	}
//    	return cnt[amount-1]==Integer.MAX_VALUE?-1:cnt[amount-1];	
//    }
//}