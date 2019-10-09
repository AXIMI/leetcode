package leetcode100;

public class Leetcode189 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {-1,-100};
		s.rotate(nums, 2);
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+"  ");
	}

}

/*
class Solution {
	public void rotate(int[] nums, int k) {
		if(nums==null||nums.length==1) return;
		
		k%=nums.length;
		int len=nums.length;
		int[] tmp=new int[len];
		for(int i=0;i<len-k;i++)
			tmp[i+k]=nums[i];
		for(int i=len-k;i<len;i++)
			tmp[k+i-len]=nums[i];
		
		for(int i=0;i<len;i++)
			nums[i]=tmp[i];
	}
}
*/