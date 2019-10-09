package leetcode100;

public class Leetcode153 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {1};
		System.out.println(s.findMin(nums));
	}

}

/*
class Solution {
    public int findMin(int[] nums) {
    	if(nums.length==2) 
    		return Math.min(nums[0], nums[1]);
    	
        int left=0,mid=nums.length/2,right=nums.length-1;
        int min=nums[0];
        
        while(left<right) {
        	if(nums[left]<nums[mid]) {
        		// the left part is sequential
        		min=Math.min(nums[left],min);
        		left=mid;
        	}else {
        		// the right part is sequential
        		min=Math.min(nums[mid+1],min);
        		right=mid;
        	}
        	mid=(left+right)/2;
        }
        return min;
    }
}*/