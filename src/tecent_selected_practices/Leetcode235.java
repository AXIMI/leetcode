package tecent_selected_practices;

public class Leetcode235 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution s=new Solution();
		TreeNode n0=new TreeNode(0);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n6=new TreeNode(6);
		TreeNode n7=new TreeNode(7);
		TreeNode n8=new TreeNode(8);
		TreeNode n9=new TreeNode(9);
		
		n2.left=n0;n2.right=n4;
		n3.left=null;n3.right=null;
		n4.left=n3;n4.right=n5;
		n5.left=null;n5.right=null;
		n6.left=n2;n6.right=n8;
		n7.left=null;n7.right=null;
		n8.left=n7;n8.right=n9;
		n9.left=null;n9.right=null;
		System.out.println(s.lowestCommonAncestor(n6, n6, n6).val);

	}

}

//class Solution {
//    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//        if(root==null||root==p||root==q)	return root;
//        else if(p.val<root.val&&q.val<root.val)	
//        	return lowestCommonAncestor(root.left, p, q);
//        else if(p.val>root.val&&q.val>root.val)
//         return lowestCommonAncestor(root.right, p, q);
//        
//        return root;
//    }
//}