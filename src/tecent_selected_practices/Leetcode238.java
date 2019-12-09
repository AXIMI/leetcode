package tecent_selected_practices;

public class Leetcode238 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] nums= {1,2};
		int[] res=s.productExceptSelf(nums);
		for(Integer num:res)
			System.out.println(num);
	}

}

//class Solution {
//    public int[] productExceptSelf(int[] nums) {
//    	if(nums.length==0)	return nums;
//    	
//        int len=nums.length;
//    	int[] left=new int[len];
//    	int[] right=new int[len];
//    	left[0]=1;right[len-1]=1;
//    	
//    	for(int i=1;i<len;i++)
//    		left[i]=left[i-1]*nums[i-1];
//    	for(int i=len-2;i>=0;i--)
//    		right[i]=right[i+1]*nums[i+1];
//    	
//    	int[] res=new int[len];
//    	for(int i=0;i<len;i++)
//    		res[i]=left[i]*right[i];
//    	return res;
//    }
//}