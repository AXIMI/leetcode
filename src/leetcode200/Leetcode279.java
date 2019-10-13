package leetcode200;
import java.util.*;
public class Leetcode279 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.numSquares(4));
	}

}

//class Solution {
//	public int numSquares(int n) {
//		if(n==0)	return 0;
//		int[] dp=new int[n+1];
//		Arrays.fill(dp, Integer.MAX_VALUE);
//		dp[0]=0;dp[1]=1;
//		
//		int root=1;
//		for(int i=2;i<=n;i++)
//			for(root=1;root*root<=i;root++)
//				dp[i]=dp[i-root*root]+1<dp[i]?dp[i-root*root]+1:dp[i];
//		return dp[n];
//	}
//}

//class Solution {
//    public int numSquares(int n) {
//    	if((int)Math.sqrt(n)*(int)Math.sqrt(n)==n)	return 1;
//    	
//    	List<Integer> res=new ArrayList<Integer>();
//    	
//    	int curRoot=1, curSquares=1;
//    	while(curSquares<n) {
//    		res.add(numSquares(n-curSquares)+1);
//    		curRoot = curRoot+1;
//    		curSquares = curRoot*curRoot;
//    	}
//    	
//    	int minCnt = Integer.MAX_VALUE;
//    	for(int cnt: res)
//    		minCnt = cnt<minCnt?cnt:minCnt;
//    	return minCnt;
//    }
//}