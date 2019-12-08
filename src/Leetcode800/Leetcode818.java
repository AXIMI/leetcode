package Leetcode800;

public class Leetcode818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//class Solution {
//    public int racecar(int target) {
//        int[] dp=new int[target+1];
//        
//        dp[0] = 0;
//        dp[1] = 1;
//        
//        for(int i=2;i<=target;i++) {
//        	// find m
//        	int m=2;
//        	while((Math.pow(2, m)-1)<=target)
//        		m++;
//        	if((Math.pow(2, m)-1)==target)
//        		dp[i]=m;
//        	else 
//        		dp[i]=m+dp[i-(int)Math.pow(2, m-1)]+1;
//        }
//        return dp[target];
//    }
//}