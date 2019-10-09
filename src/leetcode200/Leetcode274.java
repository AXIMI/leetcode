package leetcode200;

public class Leetcode274 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] citations = {1,1};
		Solution s=new Solution();
		
		System.out.println("result:"+s.hIndex(citations));
	}

}

//class Solution {
//    public int hIndex(int[] citations) {
//    	int len = citations.length;
//    	int[] countings = new int[len+1];
//    	
//    	for(int citation : citations)
//    		if(citation>=len)
//    			countings[len]++;
//    		else
//    			countings[citation]++;
//    	
//    	int total = 0;
//    	for(int i=len;i>=0;i--) {
//    		total += countings[i];
//    		if(total>=i)
//    			return i;
//    	}
//    	return 0;
//    }
//}

//class Solution {
//    public int hIndex(int[] citations) {
//    	if(citations.length==0)
//    		return 0;
//    	
//    	mergeSort(citations, 0, citations.length-1);
//    	for(int citation: citations) {
//    		System.out.println(citation);
//    	}
//    	
//    	int h = 0,len=citations.length;
//    	for(;h<len;h++) {
//    		if(citations[h]<=h)
//    			return h;
//    	}
//    	
//    	return h;
//    }
//    
//	public void mergeSort(int nums[], int left, int right) {
//		if(left == right)	return;
//		
//		int mid = (left+right)/2;
//		
//		mergeSort(nums, left, mid);
//		mergeSort(nums, mid+1, right);
//		
//		merge(nums, left, right, mid);
//	}
//	
//	public void merge(int[] nums, int left, int right, int mid) {
//		int len=right-left+1;
//		int[] tmps=new int[len];
//		int k=0,i=left,j=mid+1;
//		
//		while(i<=mid&&j<=right)
//			tmps[k++]=nums[i]>nums[j]?nums[i++]:nums[j++];
//		while(i<=mid)
//			tmps[k++]=nums[i++];
//		while(j<=right)
//			tmps[k++]=nums[j++];
//		
//		for(int tmp : tmps) {
//			nums[left++] = tmp;
//		}
//	}
//	
//}