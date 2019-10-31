package leetcode000;

public class Leetcode53 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {-2,1};
		System.out.println(s.maxSubArray(nums));
	}

}

class Solution {
    public int maxSubArray(int[] nums) {
    	int curSum=nums[0],res=nums[0];
    	
    	for(int i=1,len=nums.length;i<len;i++) {
    		if(curSum+nums[i]<nums[i])	curSum=nums[i];
    		else	curSum+=nums[i];
    		res=curSum>res?curSum:res;
    	}
    	return res;
    }
}