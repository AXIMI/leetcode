package leetcode200;

public class Leetcode268 {
	public static void main(String[] args) {
		int nums[] = {1,2};
		Solution s =new Solution();
		System.out.println(s.missingNumber(nums));
	}
}


//class Solution {
//    public int missingNumber(int[] nums) {
//        int len = nums.length;
//        long sum = len*(len+1) / 2;
//        
//        for(int num : nums)
//        	sum -= num;
//        
//        return (int)sum;
//    }
//}