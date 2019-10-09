package leetcode300;

public class Leetcode306 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.isAdditiveNumber("111"));
	}

}


//class Solution {
//    public boolean isAdditiveNumber(String num) {
//    	if(num==null||num.length()<3)	return false;
//    	if(num.equals("000"))	return true;
//    	int len=num.length();
//		for(int p1=1;p1<=len/2+1;p1++) {
//			for(int p2=p1+1;p2<=len/2+2;p2++) {
//				if(p2==num.length())	return false;
//				int num1=getNum(num.substring(0,p1));
//				int num2=getNum(num.substring(p1, p2));
//				if((num.charAt(0)=='0'&&num1!=0)||(num.charAt(p1)=='0'&&num2!=0))
//					continue;
//				int range=Math.max(p1, p2-p1);
//				if(helper(num1,num2,range,num.substring(p2)))	return true;
//			}
//		}
//    	return false;
//    }
//    
//    private boolean helper(int num1,int num2,int range,String s) {
//    	if(s.equals(""))	return true;
//    	else if(s.charAt(0)=='0'||s.length()<range)	return false;
//    	
//    	int num3=getNum(s.substring(0,range));
//    	if(num1+num2==num3)
//    		if(helper(num2,num3,range,s.substring(range)))	return true;
//    	if(range+1<=s.length()) {
//    	num3=getNum(s.substring(0,range+1));
//    	if(num1+num2==num3)
//    		if(helper(num2,num3,range+1,s.substring(range+1)))	return true;
//    	}
//    	return false;
//    }
//    
//    
//    private int getNum(String s) {
//    	int res=0;
//    	for(int i=0;i<s.length();i++) {
//    		res*=10;
//    		res+=s.charAt(i)-'0';
//    	}
//    	return res;
//    }
//    
//}
