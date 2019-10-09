package leetcode200;
import java.util.*;
public class Leetcode241 {

	public static void main(String[] args) {
		Solution s=new Solution();
		
		System.out.println(s.diffWaysToCompute("2*3-4*5"));
	}

}

//class Solution {
//    public List<Integer> diffWaysToCompute(String input) {
//    	if(input==null||input.length()==0)	return new ArrayList<Integer>();
//    
//    	int num=0;
//    	List<Integer> res=new ArrayList<>();
//    	for(int i=0;i<input.length();i++) {
//    		char c=input.charAt(i);
//    		if(!Character.isDigit(c)) {
//    			num=0;
//    			String sLeft=input.substring(0,i);
//    			String sRight=input.substring(i+1,input.length());
//    			
//    			List<Integer> resLeft=diffWaysToCompute(sLeft);
//    			List<Integer> resRight=diffWaysToCompute(sRight);
//    			
//    			for(int j=0;j<resLeft.size();j++)
//    				for(int k=0;k<resRight.size();k++)
//    					res.add(calculate(resLeft.get(j),resRight.get(k),c));
//    		}else {
//    			num=num*10+c-'0';
//    		}
//    	}
//    	
//    	if(res.size()==0) {
//    		res.add(num);
//    	}
//    	return res;
//    }
//    
//    public int calculate(int num1,int num2,char op) {
//    	if(op=='+')
//			return num1+num2;
//		else if(op=='-')
//			return	num1-num2;
//		else
//			return	num1*num2;
//    }
//}