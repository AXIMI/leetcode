package leetcode200;
import java.util.*;
public class Leetcode216 {

	public static void main(String[] args) {
		Solution s=new Solution();
		List<List<Integer>> res=s.combinationSum3(3, 7);
		for(List<Integer> list: res) {
			for(int num: list)
				System.out.print(num+"  ");
			System.out.println();
		}
	}

}

//class Solution {
//    public List<List<Integer>> combinationSum3(int k, int n) {
//    	return helper(k,n,1);
//    }
//    
//    public List<List<Integer>> helper(int k, int n,int baseNum) {
//    	List<List<Integer>> res=new ArrayList<List<Integer>>();
//        if(k>n||n<=0)	return res;	
//        
//        if(k==1) {
//        	if(n>9||n<baseNum)	return res;
//        	List<Integer> list=new ArrayList<Integer>();
//        	list.add(n);
//        	res.add(list);
//        	return res;
//        }
//        
//        for(int i=baseNum;i<=Math.min(n, 9);i++) {
//        	List<List<Integer>> lists=helper(k-1,n-i,i+1);
//        	if(lists.size()==0)	continue;
//        	
//        	for(List<Integer> list : lists) {
//        		list.add(i);
//        		res.add(list);
//        	}
//        }
//        return res;
//    }
//}
