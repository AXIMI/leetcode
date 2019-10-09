package leetcode100;
import java.util.*;
public class Leetcode199 {

	public static void main(String[] args) {
		Solution s=new Solution();
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(4);
		TreeNode n5=new TreeNode(5);
		TreeNode n6=new TreeNode(6);
		
		n1.left=n2;n1.right=n4;
		n2.left=null;n2.right=n3;
		n3.left=null;n3.right=null;
		n4.left=n5;n4.right=null;
		n5.left=null;n5.right=n6;
		n6.left=null;n6.right=null;
		
		List<Integer> res=s.rightSideView(n1);
		for(int i=0;i<res.size();i++)
			System.out.print(res.get(i)+"  ");
	}

}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/*
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null)	return res;
        
        List<TreeNode> row1=new ArrayList<>();
        List<TreeNode> row2=new ArrayList<>();
        List<TreeNode> tmp=new ArrayList<>();
        
        row1.add(root);
        res.add(root.val);
        while(row1.size()>0) {
        	for(int i=0;i<row1.size();i++) {
        		if(row1.get(i).left!=null)
        			row2.add(row1.get(i).left);
        		if(row1.get(i).right!=null)
        			row2.add(row1.get(i).right);
        	}
        	if(row2.size()>0) {
        		res.add(row2.get(row2.size()-1).val);
        	}
        	tmp=row1;
        	row1=row2;
        	row2=tmp;
        	row2.clear();
        }
        return res;
    }
}
*/


/*
n1.left=n2;n1.right=n3;
n2.left=null;n2.right=n5;
n3.left=null;n3.right=n4;
n4.left=null;n4.right=null;
n5.left=null;n5.right=null;



n1.left=n2;n1.right=n4;
n2.left=null;n2.right=n3;
n3.left=null;n3.right=n4;
n4.left=n5;n4.right=null;
n5.left=null;n5.right=n6;
n6.left=null;n6.right=null;

*/