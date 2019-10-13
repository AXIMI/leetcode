package leetcode200;

public class Leetcode289 {

	public static void main(String[] args) {
		Solution s= new Solution();
		int[][] board = {
				{0,1,0},
				{0,0,1},
				{1,1,1},
				{0,0,0},
		};
		s.gameOfLife(board);
	}

}

//class Solution {
//    public void gameOfLife(int[][] board) {
//    	if(board==null|| board.length==0||board[0].length==0)	return;
//    	
//    	int m = board.length;
//    	int n = board[0].length;
//    	int[][] neighbors = new int[m][n];
//    	
//    	for(int i=0;i<m;i++) {
//    		for(int j=0;j<n;j++) {
//    			neighbors[i][j]+=((i-1)>=0)&&((j-1)>=0)?board[i-1][j-1]:0;
//    			neighbors[i][j]+=((i-1)>=0)?board[i-1][j]:0;
//    			neighbors[i][j]+=((i-1)>=0)&&((j+1)<=n-1)?board[i-1][j+1]:0;
//    			neighbors[i][j]+=(j-1)>=0?board[i][j-1]:0;
//    			neighbors[i][j]+=(j+1)<=n-1?board[i][j+1]:0;
//    			neighbors[i][j]+=((i+1)<=m-1)&&((j-1)>=0)?board[i+1][j-1]:0;
//    			neighbors[i][j]+=((i+1)<=m-1)?board[i+1][j]:0;
//    			neighbors[i][j]+=((i+1)<=m-1)&&(j+1)<=n-1?board[i+1][j+1]:0;
//    		}
//    	}
//    	
//    	for(int i=0;i<m;i++) {
//    		for(int j =0;j<n;j++) {
//    			if(neighbors[i][j]<2||neighbors[i][j]>3)
//    				board[i][j]=0;
//    			if(neighbors[i][j]==3)
//    				board[i][j]=1;
//    		}
//    	}
//    	
//    }
//}