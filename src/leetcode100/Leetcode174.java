package leetcode100;

public class Leetcode174 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[][] dungeon= {
				{-2,-1,4,5}
		};
		System.out.print(s.calculateMinimumHP(dungeon));
	}
}
/*
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
    	if(dungeon==null||dungeon.length==0)	return 0;
    	
    	int m=dungeon.length;
    	int n=dungeon[0].length;
    	
    	dungeon[m-1][n-1]=Math.max(1,1-dungeon[m-1][n-1]);
    	for(int i=n-1;i>0;i--)
    		dungeon[m-1][i-1]=Math.max(1,dungeon[m-1][i]-dungeon[m-1][i-1]);
    	
    	for(int i=m-2;i>=0;i--) {
    		dungeon[i][n-1]=Math.max(1,dungeon[i+1][n-1]-dungeon[i][n-1]);
    		for(int j=n-2;j>=0;j--) {
    			dungeon[i][j]=Math.min(dungeon[i][j+1], dungeon[i+1][j])-dungeon[i][j];
    			dungeon[i][j]=Math.max(1,dungeon[i][j]);
    		}
    	}
    	return Math.max(dungeon[0][0], 1);
    }
}*/