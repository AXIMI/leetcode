package tecent_selected_practices;

public class Leetcode169 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		int[] nums= {2,2,1,1,1,2,2};
		System.out.println(s.majorityElement(nums));
	}

}

//class Solution {
//    public int majorityElement(int[] nums) {
//        int candidate=nums[0], votes=1;
//        for(int i=1,len=nums.length;i<len;i++) {
//        	if(nums[i]==candidate)	votes++;
//        	else if(votes==0)	candidate=nums[i];
//        	else	votes--;
//        }
//        
//        return candidate;
//    }
//}