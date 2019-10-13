package leetcode200;

public class Leetcode283 {

	public static void main(String[] args) {
		Solution s =new Solution();
		int[] nums = {0,0,2};
		s.moveZeroes(nums);
		for(int num : nums)
			System.out.println(num);
	}

}

//class Solution {
//    public void moveZeroes(int[] nums) {
//    	int[] res=new int[nums.length];
//    	
//    	int i=0;
//    	for(int num: nums)
//    		if(num!=0)
//    			res[i++]=num;
//    	i=0;
//    	for(int num: res)
//    		nums[i++]=num;
//    }
//}