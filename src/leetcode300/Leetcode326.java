package leetcode300;

public class Leetcode326 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.isPowerOfThree(1));
	}

}

//class Solution {
//    public boolean isPowerOfThree(int n) {
//    	if(n==0)	return false;
//    	return n==1?true:n%3!=0?false:isPowerOfThree(n/3);
//    }
//}


//class Solution {
//    public boolean isPowerOfThree(int n) {
//    	if(n==0)	return false;
//    	while(n!=1) {
//    		if(n%3!=0)	return false;
//    		n/=3;
//    	}
//    	return true;
//    }
//}