package leetcode200;
import java.util.*;
public class Leetcode299 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.getHint("", ""));
	}

}

//class Solution {
//    public String getHint(String secret, String guess) {
//    	int bulls=0,cows=0,len=secret.length();
//    	Map<Character,Integer> mapSecret=new HashMap<>();
//    	Map<Character,Integer> mapGuess=new HashMap<>();
//    	boolean[] isBull=new boolean[len];
//    	char c1,c2;
//    	for(int i=0;i<len;i++) {
//    		c1=secret.charAt(i);
//    		c2=guess.charAt(i);
//    		if(c1==c2) {
//    			bulls++;
//    			isBull[i]=true;
//    		}else {
//    			if(!mapSecret.containsKey(c1))
//    				mapSecret.put(c1, 1);
//    			else
//    				mapSecret.put(c1,mapSecret.get(c1)+1);
//    		}
//    	}
//    	
//    	for(int i=0;i<len;i++) {
//    		if(!isBull[i]) {
//    			c2=guess.charAt(i);
//    			if(mapSecret.containsKey(c2)) {
//    				if(mapGuess.containsKey(c2))
//    					mapGuess.put(c2,Math.min(mapSecret.get(c2), mapGuess.get(c2)+1));
//    				else 
//    					mapGuess.put(c2,1);
//    			}
//    		}
//    	}
//    	for(Integer value : mapGuess.values())
//    		cows+=value;
//    	
//    	return Integer.toString(bulls)+"A"+Integer.toString(cows)+"B";
//    }
//}
