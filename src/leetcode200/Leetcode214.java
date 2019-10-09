package leetcode200;

public class Leetcode214 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.shortestPalindrome("aacecaaa"));
	}

}

//class Solution {
//    public String shortestPalindrome(String s) {
//        StringBuilder sb=new StringBuilder();
//        int i,j,len=s.length();
//        
//        sb.append('#');
//    	for(i=0;i<len;i++) {
//    		sb.append(s.charAt(i));
//    		sb.append('#');
//    	}
//    	
//    	int center,cnt=0;
//    	for(i=0;i<len;i++) {
//    		center=sb.length()/2;
//    		for(j=center+1;j<sb.length();j++) {
//    			if(sb.charAt(j)!=sb.charAt(sb.length()-j-1))
//    				break;
//    		}
//    		if(j==sb.length())	break;
//    		
//    		for(j=0;j<cnt;j++)
//    			sb.delete(0, 2);
//    		for(j=0;j<cnt+1;j++) {
//    			sb.insert(0,s.charAt(s.length()-1-cnt+j));
//    			sb.insert(0,'#');
//    		}
//    		cnt++;
//    	}
//    	
//    	StringBuilder res=new StringBuilder();
//    	for(i=0;i<sb.length()-1;i++)
//    		res.append(sb.charAt(++i));
//    	return res.toString();
//    }
//}
