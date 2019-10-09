package leetcode100;

public class Leetcode154 {

	public static void main(String[] args) {
		Solution s=new Solution();
		//int[] nums= {4,4,5,6,6,6,1};
		//int[] nums= {-9,-9,-9,-8,-8,-7,-7,-7,-7,-6,-6,-6,-6,-6,-6,-6,-6,-6,-5,-5,-5,-5,-5,-4,-4,-4,-3,-3,-3,-3,-3,-3,-2,-2,-2,-2,-2,-2,-2,-2,-2,-2,-1,-1,-1,-1,-1,-1,0,0,0,1,1,2,2,2,2,2,2,2,3,3,3,3,4,4,4,4,4,5,5,5,5,5,5,5,6,6,6,7,7,7,7,7,8,9,9,9,10,10,10,10,10,10,10,-10,-9,-9,-9,-9};
		//int[] nums= {2,3,1};
		int[] nums= {1,2};
		System.out.println(s.findMin(nums));
	}

}

/*
class Solution {
    public int findMin(int[] nums) {
    	if(nums.length==2) 
    		return Math.min(nums[0], nums[1]);
    	
    	int size=0;
    	for(int j=1;j<nums.length;j++) {
    		if(nums[j]!=nums[size]&&j<nums.length)
    			nums[++size]=nums[j];
    	}
    	
    	int left=0,mid=(size+1)/2,right=size;
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
}
*/

// improved
/*
class Solution{
	public int findMin(int[] nums) {
		int mid,l=0,r=nums.length-1;
		
		while(l<r) {
			mid=(l+r)/2;
			if(nums[mid]<nums[r])
				r=mid;
			else if(nums[mid]>nums[r])
				l=mid+1;
			else
				r--;
		}
		return nums[l];
	}
}*/