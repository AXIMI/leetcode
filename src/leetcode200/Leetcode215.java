package leetcode200;

public class Leetcode215 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {2,1};
		System.out.println(s.findKthLargest(nums, 1));
	}

}

//class Solution {
//    public int findKthLargest(int[] nums, int k) {
//        quickSort(nums,0,nums.length-1);
//        return nums[nums.length-k];
//    }
//    
//    public void quickSort(int[] nums,int l,int r) {
//    	if(l>=r)	return;
//    	int i=l,j=r,key=nums[i];
//    	
//    	while(i<j) {
//    		while(i<j&&key<=nums[j])
//    			j--;
//    		nums[i]=nums[j];
//    		while(i<j&&key>=nums[i])
//    			i++;
//    		nums[j]=nums[i];
//    	}
//    	nums[i]=key;
//    	
//    	quickSort(nums,l,i-1);
//    	quickSort(nums,i+1,r);
//    	
//    }
//}