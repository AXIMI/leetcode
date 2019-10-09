package leetcode200;
import java.util.*;
public class Leetcode257 {

	public static void main(String[] args) {
		Solution s=new Solution();
//		TreeNode n1=new TreeNode(3);
//		TreeNode n2=new TreeNode(5);
//		TreeNode n3=new TreeNode(1);
//		TreeNode n4=new TreeNode(6);
//		TreeNode n5=new TreeNode(2);
//		TreeNode n6=new TreeNode(0);
//		TreeNode n7=new TreeNode(8);
//		TreeNode n8=new TreeNode(7);
//		TreeNode n9=new TreeNode(4);
//		
//		n1.left=n2;n1.right=null;
//		n2.left=n4;n2.right=n5;
//		n3.left=n6;n3.right=n7;
//		n4.left=null;n4.right=null;
//		n5.left=n8;n5.right=n9;
//		n6.left=null;n6.right=null;
//		n7.left=null;n7.right=null;
//		n8.left=null;n8.right=null;
//		n9.left=null;n9.right=null;
		
		TreeNode n1=new TreeNode(1);
		TreeNode n2=new TreeNode(2);
		TreeNode n3=new TreeNode(3);
		TreeNode n4=new TreeNode(5);
		
		n1.left=n2;n1.right=n3;
		n2.left=null;n2.right=n4;
		n3.left=null;n3.right=null;
		n4.left=null;n4.right=null;
		
		List<String> res=s.binaryTreePaths(n1);
		for(String path : res)
			System.out.println(path);
	}

}

//class Solution {
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> res=new ArrayList<>();
//     	if(root==null)	return res;
//     	if(root.left==null&&root.right==null) {
//     		res.add(Integer.toString(root.val));
//     		return res;
//     	}
//        
//        StringBuilder curPath=new StringBuilder();
//        curPath.append(Integer.toString(root.val));
//        if(root.left!=null) 
//        	addPath(root.left,curPath,res);
//        if(root.right!=null)
//        	addPath(root.right,curPath,res);
//     	
//        return res;
//    }	
//    
//    public void addPath(TreeNode root,StringBuilder path,List<String> res) {
//    	int len=path.length();
//    	path.append("->");
//    	path.append(Integer.toString(root.val));
//
//    	if(root.left==null&&root.right==null) {
//    		res.add(path.toString());
//    	}else {
//    		if(root.left!=null)
//    			addPath(root.left,path,res);
//    		if(root.right!=null)
//    			addPath(root.right,path,res);
//    	}
//    	path.delete(len, path.length());
//    }
//}