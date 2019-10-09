package leetcode100;

public class Leetcode137 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {3,3,3,1};
		System.out.println(s.singleNumber(nums));
	}

}
/*
class Solution {
    public int singleNumber(int[] nums) {
    	int x1=0,x2=0;
    	for(int num : nums) {
    		x1=(x1^num)&~x2;
    		x2=(x2^num)&~x1;
    	}
    	return x1;
    }
}*/