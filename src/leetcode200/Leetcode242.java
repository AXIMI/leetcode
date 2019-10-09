package leetcode200;
import java.util.*;
public class Leetcode242 {

	public static void main(String[] args) {
		Solution s=new Solution();
//		System.out.println(s.isAnagram("rat", "car"));
		System.out.println("rat");
	}
}

//class Solution {
//    public boolean isAnagram(String s, String t) {
//        if(s==null||t==null||s.length()!=t.length())	return false;
//        
//    	int sLen=s.length(),tLen=t.length();
//        Map<Character,Integer> sMap=new HashMap<>();
//        Map<Character,Integer> tMap=new HashMap<>();
//        
//        char sChar,tChar;
//        for(int i=0;i<sLen;i++) {
//        	sChar=s.charAt(i);
//        	if(sMap.containsKey(sChar))
//        		sMap.put(sChar, sMap.get(sChar)+1);
//        	else
//        		sMap.put(sChar, 1);
//        }
//        for(int i=0;i<tLen;i++) {
//        	tChar=t.charAt(i);
//        	if(tMap.containsKey(tChar))
//        		tMap.put(tChar, tMap.get(tChar)+1);
//        	else
//        		tMap.put(tChar, 1);
//        }
//        
//        for(Map.Entry<Character, Integer> entry : sMap.entrySet()) {
//        	if(!tMap.containsKey(entry.getKey()))	return false;
//        	else if(!tMap.get(entry.getKey()).equals(entry.getValue()))	return false;
//        }
//        
//        return true;
//    }	
//}