package leetcode300;

public class Leetcode313 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] primes= {3,5,7,11,19,23,29,41,43,47};
		System.out.println(s.nthSuperUglyNumber(15, primes));
	}

}
//
//class Solution {
//    public int nthSuperUglyNumber(int n, int[] primes) {
//    	if(n==1)	return 1;
//    	int c,min,p=1,len=primes.length;
//        int[] candidates=new int[n];
//        mergeSort(primes,0,len-1);
//        min=primes[0];
//        
//        candidates[0]=1;
//        candidates[1]=min;
//        
//        for(int i=2;i<n;i++) {
//        	c=candidates[i-1]*min;
//        	for(int j=i-2;j>=0;j--) {
//        		if(candidates[j]*min<=candidates[i-1]&&candidates[j+1]*min>candidates[i-1]) {
//        			c=candidates[j+1]*min;
//        			break;
//        		}
//        	}
//        	candidates[i]=p<len?(c<primes[p]?c:primes[p++]):c;
//        }
//        return candidates[n-1];
//    }
//    
//    private void mergeSort(int[] nums,int l,int r) {
//    	if(l==r)	return;
//    	int mid=(l+r)/2;
//    	mergeSort(nums,l,mid);
//    	mergeSort(nums,mid+1,r);
//    	merge(nums,l,mid,r);
//    }
//    
//    private void merge(int[] nums,int l,int mid,int r) {
//    	int len=r-l+1;
//    	int[] tmp=new int[len];
//    	int i=l,j=mid+1,k=0;
//    	
//    	while(i<=mid&&j<=r)
//    		tmp[k++]=nums[i]<nums[j]?nums[i++]:nums[j++];
//    	while(i<=mid)
//    		tmp[k++]=nums[i++];
//    	while(j<=r)
//    		tmp[k++]=nums[j++];
//    	for(k=0;k<len;k++)
//    		nums[l++]=tmp[k];
//    }
//}