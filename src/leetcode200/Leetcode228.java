package leetcode200;
import java.util.*;
public class Leetcode228 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {0};
		System.out.println(s.summaryRanges(nums));
	}

}

//class Solution {
//    public List<String> summaryRanges(int[] nums) {
//    	List<String> res=new ArrayList<String>();
//    	if(nums.length==0)	return res;
//    	if(nums.length==1) {
//    		res.add(nums[0]+"");
//    		return res;
//    	}
//    	
//    	int[] range=new int[2];
//    	range[0]=nums[0];
//    	int flag=1;
//    	for(int i=1;i<nums.length;i++) {
//    		if(i==nums.length-1) {
//    			if(nums[i]-nums[i-1]==1) {
//    				range[1]=nums[i];
//    				res.add(makeString(range));
//    			}else {
//    				res.add(flag==1?range[0]+"":makeString(range));
//    				res.add(nums[i]+"");
//    			}
//    			break;
//    		}
//    		
//    		if(nums[i]-nums[i-1]==1) {
//    			range[1]=nums[i];
//    			flag=0;
//    		}else {
//    			res.add(flag==1?range[0]+"":makeString(range));
//    			range[0]=nums[i];
//    			flag=1;
//    		}
//    	}
//    	return res;
//    }
//    
//    public String makeString(int[] nums) {
//    	if(nums[0]==nums[1])	return nums[0]+"";
//    	return (nums[0]+"")+"->"+(nums[1]+"");
//    }
//}
