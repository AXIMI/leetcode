package tecent_selected_practices;

public class Leetcode231 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		System.out.println(s.isPowerOfTwo(218));
	}

}

//class Solution {
//    public boolean isPowerOfTwo(int n) {
//    	while(n>2) {
//    		if(n%2!=0)	return false;
//    		n=n/2;
//    	}
//    	if(n<=0)	return false;
//    	return true;
//    }
//}