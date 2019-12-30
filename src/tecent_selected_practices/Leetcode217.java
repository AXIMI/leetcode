package tecent_selected_practices;

import java.util.Arrays;

public class Leetcode217 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] nums= {1,2,3,1};
		System.out.println(s.containsDuplicate(nums));
	}

}

//class Solution {
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for(int i=1;i<nums.length;i++)
//        	if(nums[i]==nums[i-1])	return false;
//        return true;
//    }
//}