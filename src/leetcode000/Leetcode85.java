package leetcode000;

import java.util.*;

public class Leetcode85 {

	public static void main(String[] args) {
//		Solution s=new Solution();
		int[][] matrix= {
				{0,0,0,1,0,0,0},
				{0,0,1,1,1,0,0},
				{0,1,1,1,1,1,0}
		};
		
		List<List<String>> strs=new ArrayList<>();
		List<String> str1=new ArrayList<String>();
		List<String> str2=new ArrayList<String>();
		
		str1.add("aaa");
		str1.add("bbb");
		str2.add("ccc");
		str2.add("ddd");
		strs.add(str1);
		strs.add(str2);
		
		for(List<String> str: strs) {
			for(String s: str) {
				System.out.println(s);
			}
		}
		
//		int[][] matrix= {
//				{1,0,1,0,1},
//				{1,0,1,1,1},
//				{1,1,1,1,1},
//				{1,0,0,1,0}
//		};
//		System.out.println(s.maximalRectangle(matrix));
	}

}

//class Solution {
//    public int maximalRectangle(char[][] matrix) {
//    	if(matrix==null||matrix.length==0||matrix[0]==null||matrix[0].length==0)	return 0;
//    	int m=matrix.length;
//    	int n=matrix[0].length;
//    	
//    	int[] left=new int[n], right =new int[n], height=new int[n];
//    	Arrays.fill(right, n);
//    	int lb,rb, maxRec=0;
//    	
//    	for(int i=0;i<m;i++) {
//    		lb=0;rb=n;
//    		
//			// update height
//			for(int j=0;j<n;j++) {
//				if(matrix[i][j]!='0')	height[j]++;
//				else	height[j]=0;
//			}
//			
//			// update left
//			for(int j=0;j<n;j++) {
//				if(matrix[i][j]!='0') {
//					left[j]=Math.max(left[j], lb);
//				}else {
//					left[j]=0;
//					lb=j+1;
//				}
//			}
//			
//			// update right
//			for(int j=n-1;j>=0;j--) {
//				if(matrix[i][j]!='0') {
//					right[j]=Math.min(right[j], rb);
//				}else {
//					right[j]=n;
//					rb=j;
//				}
//			}
//			
//			// calculate max rectangle
//			int curRec=0;
//			for(int j=0;j<n;j++) {
//				curRec=(right[j]-left[j])*height[j];
//				maxRec=curRec>maxRec?curRec:maxRec;
//			}
//    	}
//    	return maxRec;
//    }
//    
// 
//    
//}