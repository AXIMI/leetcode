package tecent_selected_practices;
import java.util.*;
public class Leetcode236 {

	public static void main(String[] args) {
		Solution s=new Solution();
		
		TreeNode n0=new TreeNode(0);
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n6=new TreeNode(6);
		TreeNode n7=new TreeNode(7);
		TreeNode n8=new TreeNode(8);
		
		n1.left=n0;n1.right=n8;
		n2.left=n7;n2.right=n4;
		n3.left=n5;n3.right=n1;
		n4.left=null;n4.right=null;
		n5.left=n6;n5.right=n2;
		n6.left=null;n6.right=null;
		n7.left=null;n7.right=null;
		n8.left=null;n8.right=null;
		
		System.out.println(s.lowestCommonAncestor(n3, n3, n3).val);
	}

}

//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//    	if(root==null||root==p||root==q)	return root;
//    	TreeNode left = lowestCommonAncestor(root.left, p, q);
//    	TreeNode right = lowestCommonAncestor(root.right, p, q);
//    	
//    	if(left==null)	return right;
//    	else if(right==null)	return left;
//    	return root;
//    }
//}