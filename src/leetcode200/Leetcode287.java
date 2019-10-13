package leetcode200;
import java.util.*;
public class Leetcode287 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums = {2,2,2};
		System.out.println(s.findDuplicate(nums));
	}

}

//class Solution {
//    public int findDuplicate(int[] nums) {
//        HashSet<Integer> set=new HashSet<Integer>();
//        for(int num: nums) {
//        	if(!set.contains(num))
//        		set.add(num);
//        	else 
//        		return num; 
//        	
//        }
//        return 0;
//    }
//}