package leetcode200;

public class Leetcode258 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.addDigits(9876));
	}

}

//class Solution {
//    public int addDigits(int num) {
//        if(num/10==0)	return num;
//        int res=0,tmp=num;
//        while(tmp>0) {
//        	res+=tmp%10;
//        	tmp/=10;
//        }
//        return addDigits(res);
//    }
//}