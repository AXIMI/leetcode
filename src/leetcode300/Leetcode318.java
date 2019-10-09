package leetcode300;
import java.util.*;
public class Leetcode318 {

	public static void main(String[] args) {
		Solution s=new Solution();
		String[] words= {
				
		};
		System.out.println(s.maxProduct(words));
		int tmp1=0,tmp2=0;
		String str="abcd";
		int tmp=0;
		System.out.println("0:"+Integer.toBinaryString(0));
		System.out.println("1<<0:"+Integer.toBinaryString(1<<0));
		for(char c : str.toCharArray()) {
			tmp|=1<<(c-'a');
			System.out.println("tmp->"+tmp+"->"+Integer.toBinaryString(tmp));
		}
		tmp1 |= 1 << ('a' - 'a');
		tmp2= 1 << ('a' - 'a');
//		System.out.println("tmp1->"+tmp1+ "->"+Integer.toBinaryString(tmp1) );
//		System.out.println("tmp2->"+tmp2+ "->"+Integer.toBinaryString(tmp2) );
	}

}

//class Solution {
//    public int maxProduct(String[] words) {
//    	int res=0,tmp=0;
//    	for(int i=0;i<words.length;i++) {
//    		for(int j=i+1;j<words.length;j++) {
//    			tmp=words[i].length()*words[j].length();
//    			if(tmp<res)	continue;
//    			if(!hasCommon(words[i],words[j]))
//    				res=tmp;
//    		}
//    	}
//    	return res;
//    }
//    
//    private boolean hasCommon(String s1,String s2) {
//    	Map<Character,Integer> map1=new HashMap<>();
//    	Map<Character,Integer> map2=new HashMap<>();
//    	
//    	for(int i=0;i<s1.length();i++) {
//    		if(!map1.containsKey(s1.charAt(i)))
//    			map1.put(s1.charAt(i),1);
//    	}
//    	
//    	for(int i=0;i<s2.length();i++) {
//    		if(!map2.containsKey(s2.charAt(i)))
//    			map2.put(s2.charAt(i),1);
//    	}
//    	
//    	for(Character key : map1.keySet()) {
//    		if(map2.containsKey(key))
//    			return true;
//    	}
//    	return false;
//    }
//}