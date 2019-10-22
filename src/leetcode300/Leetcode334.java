package leetcode300;

public class Leetcode334 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums = {1,0,10,0,0,300000};
		System.out.println(s.increasingTriplet(nums));
	}

}

class Solution {
    public boolean increasingTriplet(int[] nums) {
    	if(nums==null||nums.length<3)	return false;
    	
    	int[] subSeq = new int[3];
    	int p=0;
    	
    	subSeq[0]=nums[0];
    	for(int i=0,len=nums.length;i<len;i++) {
    		if(nums[i]>subSeq[p]) {
    			if(p==1)	return true;
    			subSeq[++p]=nums[i];
    		}else if(nums[i]<subSeq[p]){
    			if(p>0) {
    				while(p>0&&subSeq[p-1]>=nums[i])	p--;
    				subSeq[p]=nums[i];
    			}else {
    				subSeq[p]=nums[i];
    			}
    			
    		}
    		
    	}
    	
    	return false;
    }
}