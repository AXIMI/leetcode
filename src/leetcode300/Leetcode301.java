package leetcode300;
import java.util.*;
public class Leetcode301 {

	public static void main(String[] args) {
		Solution s=new Solution();
		String str=")(f";
		List<String> res=s.removeInvalidParentheses(str);
		for(String r : res) {
			System.out.println(r);
		}
	}

}

//class Solution {
//    public List<String> removeInvalidParentheses(String s) {
//    	List<String> res=new ArrayList<>();
//    	if(s==null)	return res;
//    	else if(s.length()==0) {
//    		res.add("");
//    		return res;
//    	}
//    	StringBuilder base=new StringBuilder();
//    	
//    	for(int i=0;i<s.length();i++) {
//    		helper(base,0,s,res,i);
//    		if(res.size()>0)	break;
//    	}
//    	if(res.size()==0)
//    		res.add("");
//    	
//    	Set<String> set=new HashSet<>();
//    	for(int i=0;i<res.size();i++) {
//    		set.add(res.get(i));
//    	}
//    	
//    	return new ArrayList<>(set);
//    }
//    
//    private void helper(StringBuilder base,int balance,String s,List<String> res,int cnt) {
//    	if(s.equals("")) {
//    		if(balance==0)
//    			res.add(base.toString());
//    	}else if(s.charAt(0)=='(') {
//    		// add left bracket
//    		base.append('(');
//    		helper(base,++balance,s.substring(1),res,cnt);
//    		base.delete(base.length()-1, base.length());
//    		
//    		// not add left bracket
//    		if(cnt==0)	return;
//    		helper(base,--balance,s.substring(1),res,cnt-1);
//    	}else if(s.charAt(0)==')') {
//    		// add right bracket
//    		balance--;
//    		if(balance>=0) {
//    		base.append(')');
//    		helper(base,balance,s.substring(1),res,cnt);
//    		base.delete(base.length()-1, base.length());
//    		}
//    		// not add right bracket
//    		if(cnt==0)	return;
//    		helper(base,++balance,s.substring(1),res,cnt-1);
//    	}else {
//    		// character
//    		base.append(s.charAt(0));
//    		helper(base,balance,s.substring(1),res,cnt);
//    		base.delete(base.length()-1, base.length());
//    		
//    	}
//    }
//}