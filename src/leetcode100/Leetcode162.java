package leetcode100;

public class Leetcode162 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {3,1};
		System.out.print(s.findPeakElement(nums));
	}

}
/*
class Solution {
    public int findPeakElement(int[] nums) {
    	if(nums.length<2||nums[0]>nums[1])	return 0;
    	
    	for(int i=1;i<nums.length-1;i++) {
    		if(nums[i-1]<nums[i]&&nums[i]>nums[i+1])
    			return i;
    	}
    	
    	return nums.length-1;
    }
}*/