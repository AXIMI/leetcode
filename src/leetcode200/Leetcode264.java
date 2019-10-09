package leetcode200;
import java.util.*;
public class Leetcode264 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.nthUglyNumber(1352));
	}

}

//class Solution {
//    public int nthUglyNumber(int n) {
//    	if(n<=6)	return n;
//    	List<Integer> uglys=new ArrayList<>();
//    	uglys.add(1);uglys.add(2);uglys.add(3);
//    	uglys.add(4);uglys.add(5);uglys.add(6);
//    	
//    	int num=8;
//    	for(int i=7;i<n;) {
//    		num++;
//    		if(((num%2==0)&&uglys.contains(num/2))||
//    		   ((num%3==0)&&uglys.contains(num/3))||
//    		   ((num%5==0)&&uglys.contains(num/5))) {
//    			uglys.add(num);
//    			i++;
//    		}
//    	}
//    	return num;
//    }
//    
//}