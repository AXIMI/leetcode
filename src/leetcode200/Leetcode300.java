package leetcode200;
import java.util.*;
public class Leetcode300 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums1= {1,6,7};
		int target1=2;
		int[] nums2= {1,3,6,8,9,13,22};
		int target2=22;
		System.out.print("原数组：");
		for(Integer num : nums1)
			System.out.print(num+"  ");
		System.out.print("   需要搜索的数字：");
		System.out.print(target1+"\n");
		
		System.out.print("是否存在目标数字：");
		System.out.print(s.binarySearch(nums1, target1));
		
		System.out.print("\n\n原数组：");
		for(Integer num : nums2)
			System.out.print(num+"  ");
		System.out.print("   需要搜索的数字：");
		System.out.print(target2+"\n");
		
		System.out.print("是否存在目标数字：");
		System.out.print(s.binarySearch(nums2, target2));
		
	}

}



//class Solution{
//	public int lengthOfLIS(int[] nums) {
//		if(nums==null||nums.length==0)	return 0;
//		int size=0,len=nums.length;
//		int[] dp=new int[len];
//		dp[0]=1;
//		for(int i=0;i<len;i++) {
//			for(int j=0;j<i;j++) {
//				if(nums[j]>=nums[i]) {
//					dp[i]=dp[i]==0?dp[j]:dp[i];
//				}
//				else if(dp[i]<dp[j]+1)
//					dp[i]=dp[j]+1;
//			}
//			size=Math.max(size, dp[i]);
//		}
//		return size;
//	}
//
//	public boolean binarySearch(int[] nums,int target) {
//		int mid,i=0,j=nums.length;
//		while(i<=j) {
//			mid=(i+j)/2;
//			if(target==nums[mid])	return true;
//			else if(target>nums[mid])	i=mid+1;
//			else j=mid-1;
//		}
//		return false;
//	}
//
//
//}


//class Solution{
//	public int lengthOfLIS(int[] nums) {
//		int[] ends=new int[nums.length];
//		
//		int i,j,mid,size=0;
//		for(Integer num : nums) {
//			i=0;j=size;
//			while(i!=j) {
//				mid=(i+j)/2;
//				if(num>ends[mid])
//					i=mid+1;
//				else
//					j=mid;
//				
//			}
//			ends[i]=num;
//			if(i==size)	size++;
//		}
//		return size;
//	}
//}
//




//class Solution{
//	public int lengthOfLIS(int[] nums) {
//		int[] ends=new int[nums.length];
//		
//		int i,j,mid,size=0;
//		for(Integer num : nums) {
//			i=0;j=size;
//			while(i<j) {
//				mid=(i+j)/2;
//				if(num>ends[mid])
//					i=mid+1;
//				else 
//					j=mid;
//			}
//			ends[i]=num;
//			if(i==size)	size++;
//		}
//		return size;
//	}
//}

