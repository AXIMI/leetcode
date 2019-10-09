package leetcode300;

public class Leetcode321 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums1= {6,0,5,6};
		int[] nums2= {6,6,9,7,0};
		int[] res=s.maxNumber(nums1, nums2, 9);
		for(int num : res) {
			System.out.print(num+" ");
		}
	}

}

//class Solution {
//    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
//    	int len1=nums1.length,len2=nums2.length;
//    	int[] res=new int[k];
//    	
//    	for(int i=0;i<=k;i++) {
//    		if(i>len1||k-i>len2)	continue;
//    		int[] tmp1=kMax(nums1,i);
//    		int[] tmp2=kMax(nums2,k-i);
//    		int[] tmp=combineTwoArrays(tmp1,tmp2);
//    		if(isBigger(tmp,res,0,0))	res=tmp;
//    	}
//    	return res;
//    }
//    
//    private int[] combineTwoArrays(int[] nums1,int[] nums2) {
//    	int len1=nums1.length,len2=nums2.length;
//    	int[] res=new int[len1+len2];
//    	
//    	int i=0,j=0,k=0;
//		while(i<len1&&j<len2)
//			res[k++]=isBigger(nums1,nums2,i,j)?nums1[i++]:nums2[j++];
//		while(i<len1)
//			res[k++]=nums1[i++];
//		while(j<len2)
//			res[k++]=nums2[j++];
//    	
//		return res;
//    }
//    
//    private int[] kMax(int[] nums,int k) {
//    	if(k==0)	return new int[0];
//    	
//    	int[] stack=new int[k];
//    	for(int i=0,p=-1,len=nums.length;i<len;i++) {
//    			while(p>=0&&len-i>=k-p&&stack[p]<nums[i])
//    				p--;
//    			if(p<k-1)
//    				stack[++p]=nums[i];
//    	}
//    	return stack;
//    }
//
//    private boolean isBigger(int[] nums1,int[] nums2,int p1,int p2) {
//    	int i=p1,j=p2,len1=nums1.length,len2=nums2.length;
//    	for(;i<len1&&j<len2;i++,j++)
//    		if(nums1[i]>nums2[j])	return true;
//    		else if(nums1[i]<nums2[j])	return false;
//    	return i<len1?true:false;
//    }
//}