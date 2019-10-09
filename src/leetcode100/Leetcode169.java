package leetcode100;

import java.util.HashMap;
import java.util.Map;

public class Leetcode169 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {2,2,1,1,1,2,2};
		System.out.println(s.majorityElement(nums));
	}

}

//class Solution {
//    public int majorityElement(int[] nums) {
//    	int len=nums.length;
//    	Map<Integer,Integer> map=new HashMap<>();
//        for(Integer num :nums) {
//        	if(map.containsKey(num)) {
//        		map.put(num,map.get(num)+1);
//        	}else {
//        		map.put(num,1);
//        	}
//        	if(map.get(num)>len/2)	return num;
//        }
//        return nums[0];
//    }
//}
