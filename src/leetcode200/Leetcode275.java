package leetcode200;

public class Leetcode275 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] citations = {15,16};
		System.out.println(s.hIndex(citations));
	}
	
	
}

//class Solution {
//    public int hIndex(int[] citations) {
//    	for(int i=0, len=citations.length;i<len;i++)
//    		if(citations[i]>=(len-i))
//    			return len-i;
//    	return 0;
//    }
//}
