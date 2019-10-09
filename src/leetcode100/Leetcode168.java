package leetcode100;

public class Leetcode168 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.print(s.convertToTitle(52));
	}

}
/*
class Solution {
    public String convertToTitle(int n) {
    	return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
}
}
*/

