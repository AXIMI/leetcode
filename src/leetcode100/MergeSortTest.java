package leetcode100;

public class MergeSortTest {

	public static void main(String[] args) {
		int[] nums= {6,5,3,1,8,7,2,4};
		mergeSort(nums,0,nums.length-1);
		for(int i=0;i<nums.length;i++)
			System.out.print(nums[i]+" ");
	}

	public static void mergeSort(int[] nums,int left,int right) {
		if(left>=right)	return;
		
		int mid=(left+right)/2;
		mergeSort(nums,left,mid);
		mergeSort(nums,mid+1,right);
		merge(nums,left,right,mid);
	}
	
	public static void merge(int[] nums,int left,int right,int mid) {
		int len=right-left+1;
		int tmp[]=new int[len];
		
		int i=left,j=mid+1,k=0;
		while(i<=mid&&j<=right)
			tmp[k++]=nums[i]<nums[j]?nums[i++]:nums[j++];
		while(i<=mid)
			tmp[k++]=nums[i++];
		while(j<=right)
			tmp[k++]=nums[j++];
		
		for(i=left,j=0;i<=right;i++,j++)
			nums[i]=tmp[j];
	}
}
