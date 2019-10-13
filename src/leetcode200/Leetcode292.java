package leetcode200;

public class Leetcode292 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.canWinNim(12));
	}

}

//class Solution {
//    public boolean canWinNim(int n) {
//    	if(n<=3)	return true;
//    	else if(n==4)	return false;
//    	
//    	if(canWinNim(n-1))	return true;
//    	else if(canWinNim(n-2))	return true;
//    	else if(canWinNim(n-3))	return true;
//    	return false;
//    }
//}

//class Solution {
//public boolean canWinNim(int n) {
//	return n%4==0?false:true;
//	}
//}