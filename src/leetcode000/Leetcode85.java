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
        int m=matrix.length,n=matrix[0].length;
        int res=0;
    	int[][] landscape=new int[m][n];
    	int[][] portrait=new int[m][n];
    	
    	for(int i=0;i<m;i++) {
    		for(int j=0;j<n;j++) {
    			if(matrix[i][j]!=0){
    				portrait[i][j]=i>0?portrait[i-1][j]+1:1;
    				landscape[i][j]=j>0?landscape[i][j-1]+1:1;
    				if(portrait[i][j]*landscape[i][j]>res) {
    					int[] tmp=checkInside(landscape,portrait,i,j);
    					res=tmp[0]*tmp[1]>res?tmp[0]*tmp[1]:res;
    				}
    			}
    		}
    	}
    	return res;
    }
    
    public int[] checkInside(int[][] landscape,int[][] portrait, int i,int j) {
    	if(landscape[i][j]==0)	return new int[] {0,0};
    	if(landscape[i][j]==1||portrait[i][j]==1)	
    		return new int[]{landscape[i][j], portrait[i][j]};
    	int[] matrixInside=checkInside(landscape,portrait,i-1,j-1);
    	int width=Math.min(matrixInside[0]+1, landscape[i][j]);
    	int length=Math.min(matrixInside[1]+1, portrait[i][j]);
    	return new int[] {width,length};
    }
    
}