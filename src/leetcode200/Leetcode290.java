package leetcode200;
import java.util.*;
public class Leetcode290 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.wordPattern("abba", "dog dog dog dog"));
	}

}

//class Solution {
//    public boolean wordPattern(String pattern, String str) {
//    	char[] chars = pattern.toCharArray();
//    	String[] words = str.split(" ");
//    	if(chars.length!=words.length)	return false;
//    	int len = chars.length;
//    	
//    	Map<Character, String> mapCharWord = new HashMap<Character, String>();
//    	Map<String, Character> mapWordChar = new HashMap<String, Character>();
//    	
//    	for(int i=0;i<len;i++) {
//    		if(!mapCharWord.containsKey(chars[i])) 
//    			mapCharWord.put(chars[i], words[i]);
//    		else
//    			if(!words[i].equals(mapCharWord.get(chars[i])))
//    				return false;
//    	}
//    	
//    	for(int i=0;i<len;i++) {
//    		if(!mapWordChar.containsKey(words[i])) 
//    			mapWordChar.put(words[i], chars[i]);
//    		else
//    			if(chars[i]!=mapWordChar.get(words[i]))
//    				return false;
//    	}
//    	
//    	return true;
//    }
//}

