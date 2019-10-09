package leetcode200;

import java.util.*;

public class Leetcode220 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,2,3,1};
		System.out.println(s.containsNearbyAlmostDuplicate(nums,3,0));
	}

}

//class Solution {
//	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//		for(int i=1;i<=k;i++) {
//			for(int j=0;j+i<nums.length;j++) {
//				if(Math.abs((long)nums[j]-(long)nums[j+i])<=t)	return true;
//			}
//		}
//		return false;
//    }
//}

//class Solution {
//	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
//		int[][] dp = new int[nums.length][nums.length];
//
//		for (int dis = 1; dis <= k; dis++) {
//			if (dis == 1) {
//				for (int i = 0; i < nums.length - 1; i++) {
//					if(-Math.abs((long)nums[i] - (long)nums[i + 1])<=Integer.MIN_VALUE)
//						return false;
//					dp[i][i + 1] =nums[i]-nums[i + 1];
//					if(Math.abs(dp[i][i+1])<=t)	return true;
//				}
//			}
//			else {
//				for (int i = 0; i + dis < nums.length; i++) {
//					dp[i][i + dis] = 0;
//					for (int m = i; m < i + dis; m++) {
//						if(-Math.abs((long)dp[i][i+dis]+(long)dp[m][m+1])<=Integer.MIN_VALUE)
//							return false;
//						dp[i][i + dis] += dp[m][m + 1];
//					}
//					if (Math.abs(dp[i][i + dis]) <= t)
//						return true;
//				}
//			}
//		}
//		return false;
//	}
//}