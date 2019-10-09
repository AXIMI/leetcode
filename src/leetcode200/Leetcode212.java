package leetcode200;
import java.util.*;
public class Leetcode212 {

	public static void main(String[] args) {
		Solution s=new Solution();
		char[][] board= {
				{'a','b'},
				{'a','a'}
		};
		String[] words= {"aaba"};
		System.out.println(s.findWords(board, words));
	}

}

//class Solution {
//    public List<String> findWords(char[][] board, String[] words) {
//    	List<String> res=new ArrayList<String>();
//        
//    	for(String word: words) {
//    		if(checkWord(board,word))
//    			res.add(word);
//    	}
//    	return res;
//    }
//    
//    
//    public boolean checkWord(char[][] board,String word) {
//    	if(word.equals(""))	return true;
//    	if(board.length==0)	return false;
//    	
//    	int rows=board.length,cols=board[0].length;
//    	boolean[][] flags=new boolean[rows][cols];
//    	
//    	for(int i=0;i<rows;i++) {
//    		for(int j=0;j<cols;j++) {
//    			if(board[i][j]==word.charAt(0)) {
//    				flags[i][j]=true;
//    				if(checkRemain(board,flags,word.substring(1),i-1,j)||
//    						checkRemain(board,flags,word.substring(1),i+1,j)||
//    						checkRemain(board,flags,word.substring(1),i,j-1)||
//    						checkRemain(board,flags,word.substring(1),i,j+1))
//    					return true;
//    				flags[i][j]=false;
//    			}
//    		}
//    	}
//    	return false;
//    }
//    
//    
//    public boolean checkRemain(char[][] board,boolean[][] flags,String word,int i,int j) {
//    	if(word.equals(""))	return true;
//    	if(i<0||i>=board.length||j<0||j>=board[0].length||flags[i][j])	return false;
//    	if(board[i][j]!=word.charAt(0))	return false;
//
//    	flags[i][j]=true;
//    	if(checkRemain(board,flags,word.substring(1),i-1,j)||
//    		checkRemain(board,flags,word.substring(1),i+1,j)||
//			checkRemain(board,flags,word.substring(1),i,j-1)||
//			checkRemain(board,flags,word.substring(1),i,j+1))
//				return true;
//    	flags[i][j]=false;
//    	return false;
//    	}
//    	
//}

//
//char[][] board= {
//		{'o','a','a','n'},
//		{'e','t','a','e'},
//		{'i','h','k','r'},
//		{'i','f','l','v'}
//};
//String[] words= {"oath","pea","eat","rain"};