package leetcode100;
import java.util.*;
public class Leetcode136 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        
        for(int i=0;i<nums.length;i++) {
        	if(map.containsKey(nums[i]))
        		map.put(nums[i],2);
        	else 
        		map.put(nums[i],1);
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        	if(entry.getValue()==1)	return entry.getKey();
        }
        return 0;
    }
}

class Solution{
	public int singleNumber(int[] nums) {
		int res=0;
		for(int i=0;i<nums.length;i++)
			res^=nums[i];
		return res;
	}
}*/