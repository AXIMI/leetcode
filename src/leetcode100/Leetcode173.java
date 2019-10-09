package leetcode100;
import java.util.*;
public class Leetcode173 {

	public static void main(String[] args) {
		TreeNode n1=new TreeNode(7);
		TreeNode n2=new TreeNode(3);
		TreeNode n3=new TreeNode(15);
		TreeNode n4=new TreeNode(9);
		TreeNode n5=new TreeNode(20);
		
		n1.left=n2;n1.right=n3;
		n2.left=null;n2.right=null;
		n3.left=n4;n3.right=n5;
		n4.left=null;n4.right=null;
		n5.left=null;n5.right=null;
		
		BSTIterator iterator=new BSTIterator(n1);
		System.out.println(iterator.next());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
		System.out.println(iterator.next());
		System.out.println(iterator.hasNext());
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
class BSTIterator {
	private List<Integer> nums=new ArrayList<Integer>();
	private int p=0;
	
    public BSTIterator(TreeNode root) {
        TreeNode cur=root,tmp=root;
        
        while(cur!=null) {
        	if(cur.left!=null) {
        		tmp=cur.left;
        		while(tmp.right!=null&&tmp.right!=cur)
        			tmp=tmp.right;
        
        			if(tmp.right==null) {
        				tmp.right=cur;
        				cur=cur.left;
        			}else {
        				nums.add(cur.val);
        				cur=cur.right;
        			}
        
        	}else {
        		nums.add(cur.val);
        		cur=cur.right;
        	}
        }
    }
    
    /** @return the next smallest number */
    public int next() {
        return nums.get(p++);
    }
    
    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        if(p<nums.size())	return true;
        return false;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */