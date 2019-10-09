package leetcode100;

public class Leetcode164 {

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] nums = {1,3,7,9,0};
		System.out.print(s.maximumGap(nums));
	}

}
/*
class Solution {
	public int maximumGap(int[] nums) {
    	if(nums.length==0||nums.length==1)
    		return 0;
    	
    	mergeSort(nums,0,nums.length-1);
    	int maxGap=0;
    	for(int i=1;i<nums.length;i++)
    		if(nums[i]-nums[i-1]>maxGap)
    			maxGap=nums[i]-nums[i-1];
    	return maxGap;
	}
	
	public void mergeSort(int[] nums,int l,int r) {
		if(l==r)	return;
		int mid=(l+r)/2;
		mergeSort(nums,l,mid);
		mergeSort(nums,mid+1,r);
		merge(nums,l,mid,r);
		
	}
	
	public void merge(int[] nums,int l,int mid,int r) {
		int len=r-l+1;
		int[] tmp=new int[len];
		int k=0,i=l,j=mid+1;
		while(i<=mid&&j<=r)
			tmp[k++]=nums[i]<nums[j]?nums[i++]:nums[j++];
		while(i<=mid)
			tmp[k++]=nums[i++];
		while(j<=r)
			tmp[k++]=nums[j++];
		for(k=0;k<len;k++)
			nums[l++]=tmp[k];
	}
}
*/