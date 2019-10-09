package leetcode100;
import java.util.*;
public class Leetcode133 {		 
	public static void main(String[] args) {
		Solution s=new Solution();
		UndirectedGraphNode n1=new UndirectedGraphNode(1);
		UndirectedGraphNode n2=new UndirectedGraphNode(2);
		UndirectedGraphNode n3=new UndirectedGraphNode(3);
		UndirectedGraphNode n4=new UndirectedGraphNode(4);
		UndirectedGraphNode n5=new UndirectedGraphNode(5);
		List<UndirectedGraphNode> l1=new ArrayList<UndirectedGraphNode>();
		List<UndirectedGraphNode> l2=new ArrayList<UndirectedGraphNode>();
		List<UndirectedGraphNode> l3=new ArrayList<UndirectedGraphNode>();
		List<UndirectedGraphNode> l4=new ArrayList<UndirectedGraphNode>();
		List<UndirectedGraphNode> l5=new ArrayList<UndirectedGraphNode>();
		n1.neighbors=l1;
		n2.neighbors=l2;
		n3.neighbors=l3;
		n4.neighbors=l4;
		n5.neighbors=l5;
		l1.add(n2);l1.add(n3);
		l2.add(n1);l2.add(n2);l2.add(n4);
		l3.add(n1);l3.add(n4);
		l4.add(n2);l4.add(n3);l4.add(n5);
		l5.add(n4);
		s.cloneGraph(n1);
	}
}
/*
class Solution {
	Map<Integer,UndirectedGraphNode>map=new HashMap<>();
	
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
    	if(node==null)	return null;
    	if(map.containsKey(node.label))
    		return map.get(node.label);
    	
    	UndirectedGraphNode newNode=new UndirectedGraphNode(node.label);
    	map.put(node.label, newNode);
    	for(UndirectedGraphNode nd : node.neighbors) {
    		newNode.neighbors.add(cloneGraph(nd));
    	}
    	
    	return newNode;
    }
}*/