package leetcode200;
import java.util.*;
public class Leetcode227 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.calculate("1*2*3*4*5*6*7*8*9*10"));
	}

}

//class Solution {
//    public int calculate(String s) {
//    	int res=0,p=0,num=0,tmp=0,flag=1;
//    	Stack<Integer> stack=new Stack<Integer>();
//    	
//    	while(p<s.length()) {
//    		if(s.charAt(p)>='0'&&s.charAt(p)<='9') {
//    			num=s.charAt(p)-'0';
//    			while(p+1<s.length()&&s.charAt(p+1)>='0'&&s.charAt(p)<='9') {
//    				num*=10;
//    				num+=s.charAt(p+1)-'0';
//    				p++;
//    			}
//    			stack.push(flag*num);
//    			flag=1;
//    		}else if(s.charAt(p)=='-') {
//    			flag=-1;
//    		}else if(s.charAt(p)=='*') {
//    			while(s.charAt(p+1)==' ') p++;
//    			tmp=s.charAt(++p)-'0';
//    			while(p+1<s.length()&&s.charAt(p+1)>='0'&&s.charAt(p+1)<='9') {
//    				tmp*=10;
//    				tmp+=s.charAt(++p)-'0';
//    			}
//    			res=stack.pop()*tmp;
//    			stack.push(res);
//    		}else if(s.charAt(p)=='/') {
//    			while(s.charAt(p+1)==' ') p++;
//    			tmp=s.charAt(++p)-'0';
//    			while(p+1<s.length()&&s.charAt(p+1)>='0'&&s.charAt(p+1)<='9') {
//    				tmp*=10;
//    				tmp+=s.charAt(++p)-'0';
//    			}
//    			res=stack.pop()/tmp;
//    			stack.push(res);
//    		}
//    		p++;
//    	}
//    	
//    	res=0;
//    	while(!stack.isEmpty())
//    		res+=stack.pop();
//    	return res;
//    }
//}
