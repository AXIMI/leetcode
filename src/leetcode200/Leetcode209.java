package leetcode200;

public class Leetcode209 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {2,3,1,2,4,3};
		System.out.println(s.minSubArrayLen(20, nums));
	}

}

//class Solution {
//	public int minSubArrayLen(int s, int[] nums) {
//		int i=0,j=0,sum=0,len=Integer.MAX_VALUE;
//
//		while(i<nums.length) {
//			sum+=nums[i++];
//			
//			while(sum>=s) {
//				len=Math.min(len, i-j);
//				sum-=nums[j++];
//			}
//		}
//		return len==Integer.MAX_VALUE?0:len;
//	}
//}



//class Solution {
//    public int minSubArrayLen(int s, int[] nums) {
//        int minLen=Integer.MAX_VALUE;
//        int len=nums.length;
//        int[] curNums=new int[len];
//        
//        for(int i=0;i<len;i++) {
//        	for(int j=i;j<len;j++) {
//        		if(j==i)	curNums[j]=nums[j];
//        		else	curNums[j]=curNums[j-1]+nums[j];
//        		if(curNums[j]>=s) {
//        			if(j-i+1<minLen)
//        				minLen=j-i+1;
//        			if(minLen==1)	return 1;
//        			break;
//        		}
//        	}
//        }
//        if(minLen==Integer.MAX_VALUE)	return 0;
//        else return minLen;
//    }
//}


//class Solution {
//    public int minSubArrayLen(int s, int[] nums) {
//    	int len=nums.length;
//    	
//    	int sum=0;
//        for(int k=0;k<len;k++) {
//        	for(int i=0;i<=k;i++)
//        		sum+=nums[i];
//        	if(sum>=s)	return k+1;
//        	
//        	for(int i=0;i+k+1<len;i++) {
//        		sum-=nums[i];
//        		sum+=nums[i+k+1];
//        		if(sum>=s)	return k+1;
//        	}
//        	sum=0;
//        }
//        return 0;
//    }
//}