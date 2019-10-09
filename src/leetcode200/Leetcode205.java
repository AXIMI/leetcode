package leetcode200;
import java.util.*;
public class Leetcode205 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.isIsomorphic("add", "egg"));
	}

}
//
//class Solution {
//    public boolean isIsomorphic(String s, String t) {
//    	if(s.length()!=t.length())	return false;
//    	Map<Character,Integer> sMap=new HashMap<>(); 
//    	Map<Character,Integer> tMap=new HashMap<>(); 
//    	int[] sNums=new int[s.length()];
//    	int[] tNums=new int[t.length()];
//    	
//    	int base=0;
//    	for(int i=0;i<s.length();i++) {
//    		if(sMap.containsKey(s.charAt(i)))
//    			sNums[i]=sMap.get(s.charAt(i));
//    		else {
//    			sMap.put(s.charAt(i),base);
//    			sNums[i]=base++;
//    		}
//    	}
//    	
//    	base=0;
//    	for(int i=0;i<t.length();i++) {
//    		if(tMap.containsKey(t.charAt(i)))
//    			tNums[i]=tMap.get(t.charAt(i));
//    		else {
//    			tMap.put(t.charAt(i),base);
//    			tNums[i]=base++;
//    		}
//    	}
//    	
//    	for(int i=0;i<s.length();i++)
//    		if(sNums[i]!=tNums[i]) return false;
//    	return true;
//    }
//}