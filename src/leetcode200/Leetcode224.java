package leetcode200;
import java.util.*;
public class Leetcode224 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.calculate("(1+(4+5+2)-3)+(6+8)"));
	}

}

//class Solution {
//    public int calculate(String s) {
//        int res=0,p=0,flag=1,num=0;
//        Stack<String> stack=new Stack<String>();
//        
//        while(p<s.length()) {
//        	if(s.charAt(p)=='(')
//        		stack.push("(");
//        	else if(s.charAt(p)=='+')
//        		flag=1;
//        	else if(s.charAt(p)=='-') {
//        		if(s.charAt(p+1)=='(')
//        			stack.push("-");
//        		else
//        			flag=-1;
//        	}
//        	else if(s.charAt(p)>='0'&&s.charAt(p)<='9') {
//        		num=s.charAt(p)-'0';
//        		while(p+1<s.length()&&s.charAt(p+1)>='0'&&s.charAt(p+1)<='9') {
//        			p++;
//        			num*=10;
//        			num+=s.charAt(p)-'0';
//        		}
//        		stack.push(flag*num+"");
//        		flag=1;
//        	}
//        	else if(s.charAt(p)==')'){
//        		res=0;
//        		while(!stack.empty()&&stack.peek()!="(")
//        			res+=Integer.parseInt(stack.pop());
//        		stack.pop();
//        		if(!stack.isEmpty()&&stack.peek()=="-") {
//        			res*=-1;
//        			stack.pop();
//        		}
//        		stack.push(res+"");
//        	}
//        	p++;
//        	}
//        res=0;
//        while(!stack.isEmpty())
//        	res+=Integer.parseInt(stack.pop());
//        return res;
//    }
//}