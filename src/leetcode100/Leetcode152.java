package leetcode100;
public class Leetcode152 {

	public static void main(String[] args) {
		Solution s=new Solution();
		//int[] nums= {1,2,-1,-2,-3,-4,-8,7};
		int[] nums= {2,3,-2,4};
		System.out.print(s.maxProduct(nums));
	}

}
/*
class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length<1)	return 0;
        
        int preMax=nums[0],curMax=nums[0];
        int preMin=nums[0],curMin=nums[0];
        int max=nums[0];
        
        for(int i=1;i<nums.length;i++) {
        	curMax=Math.max(preMax*nums[i],preMin*nums[i]);
        	curMax=Math.max(curMax, nums[i]);        	
        	curMin=Math.min(preMax*nums[i],preMin*nums[i]);
        	curMin=Math.min(curMin, nums[i]);
        	max=Math.max(max, curMax);
        	preMax=curMax;
        	preMin=curMin;
        }
        return max;
    }
}
*/