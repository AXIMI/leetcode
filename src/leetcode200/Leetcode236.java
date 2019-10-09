package leetcode200;
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

		System.out.print(s.lowestCommonAncestor(n1, n2, n9).val);
	}

}

//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        Stack<TreeNode> stack1=new Stack<>();
//        Stack<TreeNode> stack2=new Stack<>();
//        findPath(root,p,stack1);
//        findPath(root,q,stack2);
//        
//        while(stack1.size()>stack2.size())
//        	stack1.pop();
//        while(stack2.size()>stack1.size())
//        	stack2.pop();
//        while(stack1.peek()!=stack2.peek()) {
//        	stack1.pop();
//        	stack2.pop();
//        }
//        return stack1.peek();
//    }
//    
//    public void findPath(TreeNode root,TreeNode node,Stack<TreeNode> stack) {
//    	if(root==node) {
//    		stack.push(root);
//    		return;
//    	}
//    	if(root.left==null&&root.right==null)	return;
//
//    	stack.push(root);
//    	if(root.left!=null)
//    		findPath(root.left,node,stack);
//    	
//    	if(stack.peek()==node)	return;
//    	
//    	if(root.right!=null)
//    		findPath(root.right,node,stack);
//    	if(stack.peek()!=node)
//    		stack.pop();
//    }
//}

//public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
//	if(root==null||root==p||root==q)	return root;
//	TreeNode left=LCA(root.left,p,q);
//	TreeNode right=LCA(root.right,p,q);
//	if(left!=null&&right!=null)	return root;
//	return left!=null?left:right;
//}
