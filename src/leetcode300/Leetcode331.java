package leetcode300;
import java.util.*;
public class Leetcode331 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.isValidSerialization("9,#,#,1"));
//		2,1,#,#,3,#,#
	}

}

//
//class Solution {
//    public boolean isValidSerialization(String preorder) {
//        if(preorder == null || preorder.length()==0)	return true;
//        ArrayList<String> numbers= getNumbers(preorder);
//        
//        if(helper(numbers))
//        	return numbers.size()==0?true:false;
//        return false;
//        
//    }
//    
//    
//    public boolean helper(ArrayList<String> numbers) {
//    	if(numbers.get(0).equals("#")) {
//    		numbers.remove(0);
//    		return true;
//    	}
//    	else {
//    		numbers.remove(0);
//    		if(numbers.size()==0)	return false;
//    		if(!helper(numbers))	return false;
//    		if(numbers.size()==0)	return false;
//    		if(!helper(numbers))	return false;
//    	}
//    	
//    	return true;
//    }
//    
//    public ArrayList<String> getNumbers(String s) {
//    	ArrayList<String> res=new ArrayList<String>();
//    	
//    	int p1=0,p2=0,len=s.length();
//    	while(p2<len) {
//    		while(p2<s.length()&&s.charAt(p2)!=',')	p2++;
//    		res.add(s.substring(p1,p2));
//    		p1=p2+1;p2=p1;
//    	}
//    	
//    	return res;
//    }
//    	
//}