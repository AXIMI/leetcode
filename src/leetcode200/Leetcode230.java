package leetcode200;

public class Leetcode230 {

	public static void main(String[] args) {
		Solution s=new Solution();
		
//		TreeNode n1=new TreeNode(5);
//		TreeNode n2=new TreeNode(3);
//		TreeNode n3=new TreeNode(6);
//		TreeNode n4=new TreeNode(2);
//		TreeNode n5=new TreeNode(4);
//		TreeNode n6=new TreeNode(1);
//		
//		n1.left=n2;n1.right=n3;
//		n2.left=n4;n2.right=n5;
//		n3.left=null;n3.right=null;
//		n4.left=n6;n4.right=null;
//		n5.left=null;n5.right=null;
//		n6.left=null;n6.right=null;
		
//		TreeNode n1=new TreeNode(3);
//		TreeNode n2=new TreeNode(1);
//		TreeNode n3=new TreeNode(4);
//		TreeNode n4=new TreeNode(2);
//		
//		n1.left=n2;n1.right=n3;
//		n2.left=null;n2.right=n4;
//		n3.left=null;n3.right=null;
//		n4.left=null;n4.right=null;
		
		TreeNode n1=new TreeNode(5);
		n1.left=null;n1.right=null;
		
		System.out.println(s.kthSmallest(n1, 1));
	}

}

//class Solution {
//    public int kthSmallest(TreeNode root, int k) {
//        TreeNode p1=root,p2=root;
//        int cnt=0;
//        while(p1!=null) {
//        	if(p1.left!=null) {
//        		p2=p1.left;
//        		while(p2.right!=null&&p2.right!=p1)
//        			p2=p2.right;
//        		if(p2.right==null) {
//        			p2.right=p1;
//        			p1=p1.left;
//        		}else {
//        			p2.right=null;
//        			cnt++;
//        			if(cnt==k)	return p1.val;
//        			p1=p1.right;
//        		}
//        				
//        	}else {
//        		cnt++;
//        		if(cnt==k)	return p1.val;
//        		p1=p1.right;
//        	}
//        }
//        return root.val;
//    }
//}