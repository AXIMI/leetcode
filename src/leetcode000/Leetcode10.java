package leetcode000;

public class Leetcode10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution {
    public boolean isMatch(String s, String p) {
    	if(s==null||p==null)	return false;
    	int n=s.length(),m=p.length();
    	Boolean[][] dp=new Boolean[m+1][n+1];
    	
    	dp[0][0] =true;
    	for(int i=1;i<=n;i++)
    		dp[0][i]=false;
    	for(int j=1;j<=m;j++) {
    		if(j%2!=0) 	dp[j][0]=((p.charAt(j)=='*')&&dp[j-2][0]);
    		else	dp[j][0]=false;
    	}
    	
    	for(int i=1;i<=m;i++) {
    		for(int j=1;j<=n;j++) {
    			if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.')
    				dp[i][j]=dp[i-1][j-1];
    			else if(p.charAt(j)=='*') {
    				if(p.charAt(j-1)!=s.charAt(i)&&p.charAt(j-1)!='.')
    					dp[i][j]=dp[i][j-2];
    				else {
    					dp[i][j]=dp
    				}
    			}
    		}
    	}
    	
    	
    }
}