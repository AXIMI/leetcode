package leetcode200;

import java.util.*;

public class leetcode210 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[][] prerequisites= {
		{1,0},
		{2,0},
		{3,1},
		{4,2},
		{5,3},
		{5,4},
};
		System.out.println(s.findOrder(6, prerequisites));
	}

}

//class Solution {
//	public int[] findOrder(int numCourses, int[][] prerequisites) {
//		int[] schedule=new int[numCourses];
//		
//		// create graphnodes
//		List<GraphNode> nodes = new ArrayList<>();
//		for (int i = 0; i < numCourses; i++) {
//			GraphNode newNode = new GraphNode(i);
//			nodes.add(newNode);
//		}
//
//		// fill in the relations
//		for (int i = 0; i < prerequisites.length; i++) {
//			nodes.get(prerequisites[i][0]).pre.add(prerequisites[i][1]);
//			nodes.get(prerequisites[i][1]).after.add(prerequisites[i][0]);
//		}
//
//		int curCourses = 0;
//		boolean remain;
//		while (curCourses < numCourses) {
//			remain = false;
//			for (int i = 0; i < nodes.size(); i++) {
//				GraphNode curNode = nodes.get(i);
//				if (curNode.taken || curNode.pre.size() > 0)
//					continue;
//				curNode.taken = true;
//				remain = true;
//				schedule[curCourses++]=curNode.label;
//
//				for (int j = 0; j < curNode.after.size(); j++)
//					nodes.get(curNode.after.get(j)).pre.remove((Integer) curNode.label);
//			}
//			if (!remain)
//				return new int[numCourses];
//		}
//		return schedule;
//	}
//}
//
//class GraphNode {
//	int label;
//	boolean taken = false;
//	List<Integer> pre = new ArrayList<>();
//	List<Integer> after = new ArrayList<>();
//
//	public GraphNode(int label) {
//		this.label = label;
//	}
//}