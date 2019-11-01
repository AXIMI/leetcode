package leetcode000;

public class Leetcode85 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[][] matrix= {
				{1,0,1,0,1},
				{1,0,1,1,1},
				{1,1,1,1,1},
				{1,0,0,1,0}
		};
		System.out.println(s.maximalRectangle(matrix));
	}

}

class Solution {
    public int maximalRectangle(int[][] matrix) {
    	int m=matrix.length;
    	int n=matrix[0].length;
    	
    	int[] left=new int[n], right =new int[n], height=new int[n];
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			if(matrix[i][j]!=0) {
    				
    			}
    		}
    	}
    }
    
 
    
}