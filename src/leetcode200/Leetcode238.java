package leetcode200;

public class Leetcode238 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {1,2,7,4};
		int[] res=s.productExceptSelf(nums);
		for(Integer num : res)
			System.out.print(num+"  ");
	}

}

//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//    	int i,zeroPos=-1;
//    	int[] res=new int[nums.length];
//    	Long product=1L;
//    	
//    	for(i=0;i<nums.length;i++) {
//    		if(nums[i]==0) {
//    			if(zeroPos!=-1)
//    				return res;
//    			zeroPos=i;
//    			continue;
//    		}
//    		product*=nums[i];
//    	}
//    	
//    	if(zeroPos!=-1) {
//    		res[zeroPos]=Integer.parseInt(String.valueOf(product));
//    		return res;
//    	}
//    	for(i=0;i<nums.length;i++) 
//    		res[i]=(int)(product/nums[i]);
//    	return res;
//    }
//}

//class Solution {
//	public int[] productExceptSelf(int[] nums) {
//		int i,tmp=1,n=nums.length;
//		int[] res=new int[n];
//		
//		for(i=0;i<n;i++) {
//			res[i]=tmp;
//			tmp*=nums[i];
//		}
//		tmp=1;
//		for(i=n-1;i>=0;i--) {
//			res[i]*=tmp;
//			tmp*=nums[i];
//		}
//		
//		return res;
//	}
//}