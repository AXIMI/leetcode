package leetcode100;

public class Leetcode191 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.print(s.hammingWeight(11111111111111111111111111111101));
	}

}
/*
class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int cnt=0;
        while(n!=0) {
        	cnt+=n%2==1?1:0;
        	n/=2;
        }
        return cnt;
    }
}*/