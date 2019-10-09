package leetcode200;
import java.util.*;
public class Leetcode229 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {1,1,1,2,2,2,3,3};
		System.out.println(s.majorityElement(nums));
	}

}

//class Solution {
//	public List<Integer> majorityElement(int[] nums) {
//		List<Integer> res=new ArrayList<Integer>();
//		
//		int candidate1=0,candidate2=1,count1=0,count2=0;
//		for(Integer num :nums) {
//			if(num==candidate1)
//				count1++;
//			else if(num==candidate2)
//				count2++;
//			else if(count1==0) {
//				candidate1=num;
//				count1=1;
//			}else if(count2==0) {
//				candidate2=num;
//				count2=1;
//			}
//			else {
//				count1--;count2--;
//			}
//		}
//		
//		count1=0;count2=0;
//		for(Integer num:nums) {
//			if(num==candidate1)
//				count1++;
//			else if(num==candidate2)
//				count2++;
//		}
//		if(count1>nums.length/3)	res.add(candidate1);
//		if(count2>nums.length/3)	res.add(candidate2);
//		return res;
//	}
//}

//class Solution {
//    public List<Integer> majorityElement(int[] nums) {
//    	List<Integer> res=new ArrayList<Integer>();
//    	insertSort(nums);
//    	
//    	int p1=0,p2=0,range=(int)Math.ceil(nums.length/3);
//    	for(p2=0;p2<nums.length;p2++) {
//    		if(nums[p2]!=nums[p1]) {
//    			if(p2-p1>range)	res.add(nums[p1]);
//    			p1=p2;
//    		}
//    	}
//    	if(p2-p1>range)	res.add(nums[p1]);
//    	
//    	return res;
//    }
//    
//    public void insertSort(int[] nums) {
//    	int i,j,tmp;
//    	for(i=1;i<nums.length;i++) {
//    		j=i;
//    		while(j>=1&&nums[j]<nums[j-1]) {
//    			tmp=nums[j];
//    			nums[j]=nums[j-1];
//    			nums[j-1]=tmp;
//    			j--;
//    		}
//    	
//    	}
//    	
//    }
//}