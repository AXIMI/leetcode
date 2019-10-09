package leetcode200;

public class Leetcode204 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.countPrimes(1));
	}

}

//class Solution {
//    public int countPrimes(int n) {
//    	int res=0;
//    	for(int i=2;i<n;i++)
//    		res+=checkPrime(i);
//    	return res;
//    }
//    
//    public int checkPrime(int num) {
//    	for(int i=2;i<=Math.sqrt(num);i++)
//    		if(num%i==0)	return 0;
//    	return 1;
//    }
//}