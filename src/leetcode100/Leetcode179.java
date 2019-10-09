package leetcode100;
import java.util.*;
public class Leetcode179 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {0};
		//int[] nums= {0,0};
		//int[] nums= {50,321,9,916,62,3,61,5,928,0};
		System.out.println(s.largestNumber(nums));
	}

}

//class Solution{
//	public String largestNumber(int[] nums) {
//		List<String> list=new ArrayList<String>();
//		for(int num : nums)
//			list.add(String.valueOf(num));
//		Collections.sort(list,new Comparator<String>() {
//			@Override
//			public int compare(String s1,String s2) {
//				return Long.parseLong(s1+s2)>Long.parseLong(s2+s1)?-1:1;
//			}
//		});
//		
//		StringBuilder sbuilder=new StringBuilder();
//		for(String s :list)
//			sbuilder.append(s);
//		
//		while(sbuilder.charAt(0)=='0'&&sbuilder.length()>1)
//			sbuilder.delete(0,1);
//		
//		return sbuilder.toString();
//	}
//}

//class Solution {
//    public String largestNumber(int[] nums) {
//    	boolean flag=true;
//    	for(int num : nums) {
//    		if(num!=0) {
//    			flag=false;
//    			break;
//    		}
//    	}
//    	if(flag==true)	return "0";
//    	
//    	
//        StringBuilder res=new StringBuilder();
//        int max=Integer.MIN_VALUE;
//        for(int num :nums) {
//        	if(num>max)	max=num;
//        }
//        int cnt=0;
//        while(max!=0) {
//        	max/=10;
//        	cnt++;
//        }
//       
//        // bucket sort
//        Map<Integer,List<Integer>> map=new HashMap<>();
//        for(int i=0;i<10;i++)
//        	map.put(i,new ArrayList<Integer>());
//        
//        for(int i=0;i<cnt;i++) {
//        	int base=(int)Math.pow(10, cnt-1);
//        	for(Integer num :nums) {
//        		if(num==0) {
//        			map.get(0).add(0);
//        			continue;
//        		}
//        		int tmp=num;
//        		while(tmp/base==0)
//        			tmp=tmp*10+(tmp%10);
//        		
//        		tmp%=(int)Math.pow(10, i+1);
//        		while(tmp/10>0)
//        			tmp/=10;
//        		map.get(tmp).add(num);
//        	}
//        	int p=0;
//        	for(List<Integer> numList : map.values()) {
//        		for(int j=0;j<numList.size();j++)
//        			nums[p++]=numList.get(j);
//        		numList.clear();
//        }
//        }
//        for(int i=nums.length-1;i>=0;i--) {
//        	res.append(nums[i]);
//        }
//        
//        return res.toString();
//    }
//}
//
//
//
