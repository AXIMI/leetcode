package leetcode200;

public class Leetcode221 {

	public static void main(String[] args) {
		Solution s=new Solution();
		char[][] matrix= {
				{'1','0','1','0','0'},
				{'1','1','1','1','1'},
				{'1','1','1','1','1'},
				{'1','1','1','1','0'}
		};
		System.out.println(s.maximalSquare(matrix));
	}

}

//class Solution {
//    public int maximalSquare(char[][] matrix) {
//    	if(matrix==null||matrix.length==0||matrix[0].length==0)
//    		return 0;
//    	
//    	int max=0;
//        int[] preRow=new int[matrix[0].length];
//        int[] curRow=new int[matrix[0].length];
//    	for(int i=0;i<matrix.length;i++) {
//        	for(int j=0;j<matrix[0].length;j++) {
//        		if(matrix[i][j]=='0') {
//        			curRow[j]=0;
//        			continue;
//        		}
//        		
//        		if(j==0) curRow[0]=1;
//        		else
//        		curRow[j]=Math.min(Math.min(curRow[j-1],preRow[j]), preRow[j-1])+1;
//
//        		max=curRow[j]>max?curRow[j]:max;
//        	}
//        	for(int k=0;k<curRow.length;k++)
//        		preRow[k]=curRow[k];
//    	}
//    	return max*max;
//    }
//}