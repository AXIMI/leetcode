package leetcode100;

import java.util.*;

public class Leetcode167 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] numbers= {2,7,11,15};
		int[] res=s.twoSum(numbers, 9);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

}

/*
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int[] res=new int[2];
    	if(numbers==null||numbers.length<2)	return res;

    	Map<Integer,Integer> map=new HashMap<>();
    	int p=0,len=numbers.length;
    	while(p<len) {
    		if(map.containsKey(target-numbers[p])) {
    			res[0]=map.get(target-numbers[p]);
    			res[1]=p;
    			return res;
    		}
    		map.put(numbers[p], p);
    		p++;
    	}
    	return res;
    }
}
*/
/*
class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int[] res=new int[2];
    	if(numbers==null||numbers.length<2) return res;
    	
    	int p1=0,p2=numbers.length-1;
    	int tmp=numbers[p1]+numbers[p2];
    	while(p1<=p2) {
    		if(tmp==target) {
    			res[0]=numbers[p1];
    			res[1]=numbers[p2];
    			return res;
    		}else if(tmp<target) {
    			p1++;
    		}
    		else {
    			p2--;
    		}
    		tmp=numbers[p1]+numbers[p2];
    	}
    	return res;
    }
}

*/


    	
    	
    	
    	

