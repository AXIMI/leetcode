package leetcode000;
import java.util.*;
public class Leetcode95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Solution s=new Solution();
//		System.out.println(s.generateTrees(1));
	}

}

//class Solution {
//    public List<TreeNode> generateTrees(int n) {
//    	return genTrees(1, n);
//    }
//    
//    public List<TreeNode> genTrees(int start, int end){
//    	List<TreeNode> list=new ArrayList<TreeNode>();
//    	
//    	if(start>end) {
//    		list.add(null);
//    	}
//    	
//    	for(int i=start;i<=end;i++) {
//    		List<TreeNode>	leftTrees = genTrees(start, i-1);
//    		List<TreeNode>	rightTrees = genTrees(i+1, end);
//    		
//    		for(TreeNode leftRoot: leftTrees) {
//    			for(TreeNode rightRoot: rightTrees) {
//    				TreeNode root= new TreeNode(i);
//    				root.left=leftRoot;
//    				root.right=rightRoot;
//    				list.add(root);
//    			}
//    		}
//    	}
//    	return list;
//    }
//}
