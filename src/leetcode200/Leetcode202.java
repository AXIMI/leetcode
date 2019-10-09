package leetcode200;
import java.util.*;
public class Leetcode202 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.isHappy(20));
	}

}


//class Solution {
//    public boolean isHappy(int n) {
//    	if(n<0)	return false;
//    	if(n==1)	return true;
//    	
//    	int slow=n;
//    	int fast=stepForward(n);
//    	
//    	while(slow!=1&&fast!=1) {
//    		slow=stepForward(slow);
//    		fast=stepForward(stepForward(fast));
//    		if(slow==fast)	return false;
//    	}
//    	return true;
//    }
//    
//    public int stepForward(int n) {
//    	int num=0;
//    	while(n>0) {
//    		num+=(n%10)*(n%10);
//    		n/=10;
//    	}
//    	return num;
//    }
//}

//class Solution {
//    public boolean isHappy(int n) {
//    	Map<Integer,Boolean> map=new HashMap<>();
//    	map.put(n,true);
//    	
//    	int res=0;
//    	while(n!=0) {
//    		res+=(int)Math.pow((n%10),2);
//    		n/=10;
//    	}
//    	if(res==1)	return true;
//    	return check(map,res);
//    }
//    
//    
//    public boolean check(Map<Integer,Boolean> map,int n) {
//    	if(map.containsKey(n))	return false;
//    	map.put(n,true);
//    	
//    	int res=0;
//    	while(n!=0) {
//    		res+=(int)Math.pow((n%10),2);
//    		n/=10;
//    	}
//    	if(res==1)	return true;
//    	return check(map,res);
//    }
//}
