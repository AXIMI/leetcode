package tecent_selected_practices;
import java.util.*;
public class Leetcode557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Solution s=new Solution();
		System.out.println(s.reverseWords("1"));
	}

}

//class Solution {
//    public String reverseWords(String s) {
//    	String[] words=s.split(" ");
//    	String res="";
//    	
//    	if(words.length>0)
//    		res+=reverseWord(words[0]);
//    	
//        for(int i=1,len=words.length;i<len;i++) {
//        	res+=" ";
//        	res+=reverseWord(words[i]);
//        }
//        return res;
//    }
//    
//    private String reverseWord(String word) {
//    	String reWord = "";
//    	for(int i=word.length()-1;i>=0;i--)
//    		reWord+=word.charAt(i);
//    	return reWord;
//    }
//}