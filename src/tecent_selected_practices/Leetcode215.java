package tecent_selected_practices;
import java.util.*;
public class Leetcode215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] nums= {3,2,1,5,6,4};
		System.out.println(s.findKthLargest(nums, 2));
	}

}

//class Solution {
//    public int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        return nums[nums.length-k];
//        
//        
////        int len=nums.length, p=len-1, matchK=1;
////        for(p=len-1;p>=0;p--) {
////        	while(p>=1&&nums[p-1]==nums[p])
////        		p--;
////        	if(matchK==k)	return nums[p];
////        		matchK++;
////        }
////        return nums[p];
//    }
//}