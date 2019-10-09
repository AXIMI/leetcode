package leetcode200;

public class Leetcode278 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		System.out.println(s.firstBadVersion(4));
	}

}

//class Solution{
//    public int firstBadVersion(int n) {
//    	int p1=1, p2=n;
//    	while(p1<p2) {
//    		int mid=p1/2+p2/2;
//    		if(p1==p2)	return p1;
//
//    		if(!isBadVersion(mid))	p1=mid+1;
//    		else p2=mid;
//    	}
//    	return p1;
//    }
//    
//    public boolean isBadVersion(int n) {
//    	if(n>=2)	return true;
//    	return false;
//    }
//}