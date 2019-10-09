package leetcode200;

public class Leetcode240 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[][] matrix= {
				{1,4,7,11,15},
				{2,5,8,12,19},
				{3,6,9,16,22},
				{10,13,14,17,24},
				{18,21,23,26,30}
		};
		
		System.out.println(s.searchMatrix(matrix,18));
	}

}

//class Solution {
//    public boolean searchMatrix(int[][] matrix, int target) {
//    	if(matrix==null||matrix.length==0||matrix[0].length==0)	return false;
//    	int m=matrix.length,n=matrix[0].length;
//    	if(target<matrix[0][0]||target>matrix[m-1][n-1])	return false;
//    	
//    	int p1,p2,mid;
//    	for(int i=0;i<m;i++) {
//    		if(matrix[i][0]>target)	return false;
//    		if(matrix[i][n-1]<target)	continue;
//    		
//    		p1=0;p2=n-1;
//    		while(p1<=p2) {
//    			mid=(p1+p2)/2;
//    			if(matrix[i][mid]==target)	return true;
//    			else if(target<matrix[i][mid])
//    				p2=mid-1;
//    			else
//    				p1=mid+1;
//    		}
//    	}
//    	return false;
//    	
    	
    	
//    	
//    	int row1=0,row2=m-1,col1=0,col2=n-1,rowMid=0,colMid;
//    	while(row1<row2-1) {
//    		rowMid=(row1+row2)/2;
//    		if(target==matrix[rowMid][0])	return true;
//    		else if(target<matrix[rowMid][0]) {
//    			row2=rowMid-1;
//    		}
//    		else {
//    			row1=rowMid;
//    		}
//    	}
//    	while(col1<col2) {
//    		colMid=(col1+col2)/2;
//    		if(target==matrix[row1][colMid])	return true;
//    		else if(target<matrix[row1][colMid])
//    			col2=colMid-1;
//    		else
//    			col1=colMid+1;
//    	}
//    	return false;
    }
}