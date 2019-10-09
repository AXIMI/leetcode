package leetcode200;

public class Leetcode226 {

	public static void main(String[] args) {
		Solution s=new Solution();
		
		TreeNode n1=new TreeNode(4);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(7);
		TreeNode n4=new TreeNode(1);
		TreeNode n5=new TreeNode(3);
		TreeNode n6=new TreeNode(6);
		TreeNode n7=new TreeNode(9);
		
		n1.left=n2;n1.right=n3;
		n2.left=n4;n2.right=n5;
		n3.left=n6;n3.right=n7;
		n4.left=null;n4.right=null;
		n5.left=null;n5.right=null;
		n6.left=null;n6.right=null;
		n7.left=null;n7.right=null;
		
		TreeNode root=s.invertTree(n1);
		System.out.println();
	}

}

//class Solution {
//	public TreeNode invertTree(TreeNode root) {
//		if (root == null || (root.left == null && root.right == null))
//			return root;
//
//		TreeNode tmp = root.left;
//		root.left = root.right;
//		root.right = tmp;
//		
//		invertTree(root.left);
//		invertTree(root.right);
//		return root;
//	}
//}
