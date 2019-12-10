package tecent_selected_practices;
import java.util.*;
public class Leetcode236 {

	public static void main(String[] args) {
		Solution s=new Solution();
		TreeNode n1=new TreeNode(3);
		TreeNode n2=new TreeNode(5);
		TreeNode n3=new TreeNode(1);
		TreeNode n4=new TreeNode(6);
		TreeNode n5=new TreeNode(2);
		TreeNode n6=new TreeNode(0);
		TreeNode n7=new TreeNode(8);
		TreeNode n8=new TreeNode(7);
		TreeNode n9=new TreeNode(4);
		
		n1.left=n2;n1.right=n3;
		n2.left=n4;n2.right=n5;
		n3.left=n6;n3.right=n7;
		n4.left=null;n4.right=null;
		n5.left=n8;n5.right=n9;
		n6.left=null;n6.right=null;
		n7.left=null;n7.right=null;
		n8.left=null;n8.right=null;
		n9.left=null;n9.right=null;
		
		s.lowestCommonAncestor(n1, n8, n9);
	}

}

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    	List<TreeNode> path1 = new ArrayList<>();
    	List<TreeNode> path2 = new ArrayList<>();
    	
    	DFSTree(root, p, path1);
    	
    	for(TreeNode node: path1)
    		System.out.println(node.val);
    	return null;
    }
    
    private Boolean DFSTree(TreeNode root, TreeNode target, List<TreeNode> totalPath){
    	if(root==null)	return false;
    	
    	List<TreeNode> curPath=new ArrayList<>();
    	
    	if(root==target) {
//    		totalPath.add(root);
    		return true;
    	}else if(DFSTree(root.left, target, curPath)) {
    		totalPath.add(root);
    		totalPath.addAll(curPath);
    		return true;
    	}else if(DFSTree(root.right, target, curPath)){
    		totalPath.add(root);
    		totalPath.addAll(curPath);
    		return true;
    	}
    	return false;
    }
}