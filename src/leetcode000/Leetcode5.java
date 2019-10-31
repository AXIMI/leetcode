package leetcode000;

public class Leetcode5 {

	public static void main(String[] args) {
		Solution s=new Solution();
		String str="a";
		System.out.println(s.longestPalindrome(str));
	}

}
//
//class Solution {
//    public String longestPalindrome(String s) {
//    	if(s==null||s.length()==0)	return s;
//    	int len = s.length();
//    	Boolean[][] dp=new Boolean[len][len];
//    	for(int i=0;i<len;i++)
//    		for(int j=0;j<len;j++)
//    			dp[i][j]=true;
//    	
//    	int res=0,p1=0,p2=0;
//    	for(int k=0;k<len;k++) {
//    		for(int i=0,j=k;i<len&&j<len;i++,j++) {
//    			if((i==0&&j==0)||(i==len-1&&j==len-1)||(i==j))	dp[i][j]=true;
//    			else if((s.charAt(i)==s.charAt(j))&&dp[i+1][j-1]) {
//    				dp[i][j]=true;
//    				if(j-i+1>res) {
//    					res=j-i+1;p1=i;p2=j;
//    				}
//    			}
//    			else
//    				dp[i][j]=false;
//    		}
//    	}
//    	
//    	return s.substring(p1,p2+1);
//    	
//    }
//}