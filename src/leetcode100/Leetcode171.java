package leetcode100;

public class Leetcode171 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.titleToNumber(""));
	}

}
//
//class Solution {
//    public int titleToNumber(String s) {
//    	int res=0;
//    	int len=s.length();
//    	int base=1;
//    	for(int i=len-1;i>=0;i--) {
//    		res+=(s.charAt(i)-'A'+1)*base;
//    		base*=26;
//    	}
//    	return res;
//    }
//}
