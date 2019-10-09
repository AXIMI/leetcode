package leetcode100;

public class Leetcode134 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] gas= {1};
		int[] cost= {2};
		System.out.println(s.canCompleteCircuit(gas, cost));
	}

}
/*
class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int curGas = 0,len=0;
		int start = 0, end = 0;
		while (start < gas.length) {
			if(len==gas.length)	return start;
			curGas+=gas[end]-cost[end];
			if (curGas < 0) {
				start++;end=start;
				curGas=0;len=0;
				continue;
			}
			end++;len++;
			if(end==gas.length)
				end=0;
		}
		return -1;
	}
}*/