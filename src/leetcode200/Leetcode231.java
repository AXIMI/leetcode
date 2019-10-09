package leetcode200;

public class Leetcode231 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.isPowerOfTwo(128));
	}

}

//class Solution {
//    public boolean isPowerOfTwo(int n) {
//        if(n==1||n==2)	return true;
//        if(n<=0||n%2!=0)	return false;
//        return isPowerOfTwo(n/2);
//    }
//}

//class Solution{
//	public boolean isPowerOfTwo(int n) {
//		return n>0&&(n&(n-1)==0);
//	}
//}