package leetcode000;

public class Leetcode10 {

	public static void main(String[] args) {
		Solution s=new Solution();
//		String str="mississippi";
//		String p="mis*is*p*.";
		String str="ab";
		String p=".*";
		
		System.out.println(s.isMatch(str, p));
		
	}

}

//class Solution {
//    public boolean isMatch(String s, String p) {
//    	if(s==null||p==null)	return false;
//    	int n=s.length(),m=p.length();
//    	Boolean[][] dp=new Boolean[m+1][n+1];
//    	
//    	for(int i=0;i<=m;i++)
//    		for(int j=0;j<=n;j++)
//    			dp[i][j]=false;
//    	
//    	dp[0][0] =true;
//    	for(int i=1;i<=m;i++) {
//    		if(i%2==0) 	dp[i][0]=((p.charAt(i-1)=='*')&&dp[i-2][0]);
//    		else	dp[i][0]=false;
//    	}
//    	for(int j=1;j<=n;j++)
//    		dp[0][j]=false;
//    	
//    	for(int i=1;i<=m;i++) {
//    		for(int j=1;j<=n;j++) {
//    			if(s.charAt(j-1)==p.charAt(i-1)||p.charAt(i-1)=='.')
//    				dp[i][j]=dp[i-1][j-1];
//    			else if(p.charAt(i-1)=='*') {
//    				if(p.charAt(i-2)!=s.charAt(j-1)&&p.charAt(i-2)!='.')
//    					dp[i][j]=dp[i-2][j];
//    				else {
//    					dp[i][j]=dp[i-1][j]||dp[i-2][j]||dp[i][j-1];
//    				}
//    			}
//    		}
//    	}
//    	return dp[m][n];
//    }
//}