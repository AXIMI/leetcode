package tecent_selected_practices;

public class Leetcode344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Solution s=new Solution();
//		char[] chars= {'h','e','l','l','o','p'};
		char[] chars= {'h','e'};
		
		s.reverseString(chars);
		System.out.println(chars);
	}

}

//class Solution {
//    public void reverseString(char[] s) {
//        char tmp='a';
//        for(int i=0,len=s.length;i<len/2;i++) {
//        	tmp = s[i];
//        	s[i] = s[len-i-1];
//        	s[len-i-1] = tmp;
//        }
//    }
//}