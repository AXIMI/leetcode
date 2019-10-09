package leetcode100;

public class Leetcode200 {

	public static void main(String[] args) {
		Solution s=new Solution();
		char[][] grid= {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
				};
		System.out.print(s.numIslands(grid));
	}
}
/*
class Solution {
    public int numIslands(char[][] grid) {
    	if(grid==null||grid.length==0)	return 0;
    	int[][] tmp=new int[grid.length][grid[0].length];
    	
    	int cnt=0;
    	for(int i=0;i<grid.length;i++) {
    		for(int j=0;j<grid[0].length;j++) {
    			if(grid[i][j]=='1')
    				cnt+=check(i,j,grid,tmp);
    		}
    	}
    	
    	return cnt;
    }
    
    public int check(int row,int col,char[][] grid,int[][] tmp) {
    	if(tmp[row][col]==1)	return 0;
    	
    	tmp[row][col]=1;
    	findRemain(row,col,grid,tmp);
    	return 1;
    }
    
    public void findRemain(int row,int col,char[][] grid,int[][] tmp) {
    	if(row!=0) {
    		if(grid[row-1][col]=='1'&&tmp[row-1][col]==0) {
    			tmp[row-1][col]=1;
    			findRemain(row-1,col,grid,tmp);
    		}
    	}
    	
    	if(col!=0) {
    		if(grid[row][col-1]=='1'&&tmp[row][col-1]==0) {
    			tmp[row][col-1]=1;
    			findRemain(row,col-1,grid,tmp);
    		}
    	}
    	
    	if(row!=grid.length-1) {
    		if(grid[row+1][col]=='1'&&tmp[row+1][col]==0) {
    			tmp[row+1][col]=1;
    			findRemain(row+1,col,grid,tmp);
    		}
    	}
    	
    	if(col!=grid[0].length-1) {
    		if(grid[row][col+1]=='1'&&tmp[row][col+1]==0) {
    			tmp[row][col+1]=1;
    			findRemain(row,col+1,grid,tmp);
    		}
    	}
    }
}
*/


/*
class Solution {
    public int numIslands(char[][] grid) {
    	if(grid==null||grid.length==0)	return 0;
    	int[][] tmp=new int[grid.length][grid[0].length];
    	
    	int cnt=0;
    	for(int i=0;i<grid.length;i++) {
    		for(int j=0;j<grid[0].length;j++) {
    			if(grid[i][j]=='1'&&tmp[i][j]!=1)
    				cnt+=findRemain(i,j,grid,tmp);
    		}
    	}
    	
    	return cnt;
    }
    
    public int findRemain(int row,int col,char[][] grid,int[][] tmp) {
    	tmp[row][col]=1;
    	if(row!=0) {
    		if(grid[row-1][col]=='1'&&tmp[row-1][col]==0) {
    			tmp[row-1][col]=1;
    			findRemain(row-1,col,grid,tmp);
    		}
    	}
    	
    	if(col!=0) {
    		if(grid[row][col-1]=='1'&&tmp[row][col-1]==0) {
    			tmp[row][col-1]=1;
    			findRemain(row,col-1,grid,tmp);
    		}
    	}
    	
    	if(row!=grid.length-1) {
    		if(grid[row+1][col]=='1'&&tmp[row+1][col]==0) {
    			tmp[row+1][col]=1;
    			findRemain(row+1,col,grid,tmp);
    		}
    	}
    	
    	if(col!=grid[0].length-1) {
    		if(grid[row][col+1]=='1'&&tmp[row][col+1]==0) {
    			tmp[row][col+1]=1;
    			findRemain(row,col+1,grid,tmp);
    		}
    	}
    	return 1;
    }
}
*/
/*
class Solution {
    public int numIslands(char[][] grid) {
    	if(grid==null||grid.length==0)	return 0;
    	int[][] tmp=new int[grid.length][grid[0].length];
    	
    	int cnt=0;
    	for(int i=0;i<grid.length;i++)
    		for(int j=0;j<grid[0].length;j++)
    			if(grid[i][j]=='1'&&tmp[i][j]!=1)
    				cnt+=DFS(i,j,grid,tmp);
    	return cnt;
    }
    
    public int DFS(int row,int col,char[][] grid,int[][] tmp) {
    	if(row<0||col<0||row==grid.length||col==grid[0].length)	return 0;
    	if(grid[row][col]=='0'||tmp[row][col]==1)	return 0;
    	tmp[row][col]=1;
    			DFS(row-1,col,grid,tmp);
    			DFS(row,col-1,grid,tmp);
    			DFS(row+1,col,grid,tmp);
    			DFS(row,col+1,grid,tmp);
    	return 1;
    }
}

*/
/*
class Solution {
    public int numIslands(char[][] grid) {
        if(grid==null||grid.length==0)	return 0;
        
        int cnt=0;
        int[][] tmp=new int[grid.length][grid[0].length];
        if(grid[0][0]=='1') {
        	tmp[0][0]=1;
        	cnt++;
        }
        for(int i=0;i<grid.length;i++) {
        	for(int j=0;j<grid[0].length;j++) {
        		if(grid[i][j]=='0')	continue;
        		if(i==0&&j==0)	continue;
        		if(i==0) {
        			if(tmp[i][j-1]==0)
        				tmp[i][j]=++cnt;
        			else
        				tmp[i][j]=tmp[i][j-1];
        		}else if(j==0) {
        			if(tmp[i-1][j]==0)
        				tmp[i][j]=++cnt;
        			else
        				tmp[i][j]=tmp[i-1][j];
        		}else {
        			if(tmp[i-1][j]==0&&tmp[i][j-1]==0)
        				tmp[i][j]=++cnt;
        			else
        				tmp[i][j]=Math.max(tmp[i-1][j], tmp[i][j-1]);
        		}
        	}
        }
        
        return cnt;
    }
}






char[][] grid= {
				{'1','1','0','0','0'},
				{'1','1','0','0','0'},
				{'0','0','1','0','0'},
				{'0','0','0','1','1'}
		};


		char[][] grid= {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'}
				};




char[][] grid= {
				{'1','1','1','1','0'},
				{'1','1','0','1','0'},
				{'1','1','0','0','0'},
				{'0','0','0','0','0'}
				};
*/