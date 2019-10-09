package leetcode100;

public class Leetcode172 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.trailingZeroes(30));
	}

}

//class Solution {
//    public int trailingZeroes(int n) {
//        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
//    }
//}
