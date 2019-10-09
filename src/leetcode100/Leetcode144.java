package leetcode100;
import java.util.*;
public class Leetcode144 {

	public static void main(String[] args) {
		Solution s=new Solution();
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n6=new TreeNode(6);
		n1.left=n2;n1.right=n5;
		n2.left=n4;n2.right=n3;
		n3.left=null;n3.right=null;
		n4.left=null;n4.right=null;
		n5.left=n6;n5.right=null;
		n6.left=null;n6.right=null;
		
		System.out.println(s.preorderTraversal(n1));
		
	}

}
/*
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)	return res;
        
        TreeNode p1=root,p2;
        while(p1!=null) {
        	if(p1.left!=null) {
        		p2=p1.left;
        		while(p2.right!=null&&p2.right!=p1)
        			p2=p2.right;
        		if(p2.right==null) {
        			p2.right=p1;	
        			res.add(p1.val);
        			p1=p1.left;
        		}else {
        			p2.right=null;
        			p1=p1.right;
        		}
        	}else {
        		res.add(p1.val);
        		p1=p1.right;
        	}
        }
        return res;
    }
}*/