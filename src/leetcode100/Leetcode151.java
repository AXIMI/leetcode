package leetcode100;

public class Leetcode151 {

	public static void main(String[] args) {
		Solution s=new Solution();
		String str="   a  good   example   ";
		System.out.print(s.reverseWords(str));
	}
}
/*
class Solution {
	public String reverseWords(String s) {
		if(s==null||s.length()==0)	return s;
		String res="";
		
		int p1=s.length()-1,p2;
		while(p1>=0&&s.charAt(p1)==' ')	p1--;
		p2=p1+1;
		while(p1>=0&&s.charAt(p1)!=' ')	p1--;
		res+=s.substring(p1+1,p2);

		while(p1>=0) {
			while(p1>=0&&s.charAt(p1)==' ')	p1--;
			p2=p1+1;
			if(p<=0)	break;
			res+=" ";
			while(p1>=0&&s.charAt(p1)!=' ')	p1--;
			res+=s.substring(p1+1,p2);
		}
		return res;
	}
}
*/
//String str="the sky is blue";



/*
class Solution {
	public String reverseWords(String s) {
		String[] tmp=s.strip().split("//s+");
		String res="";
		for(int i=tmp.length-1;i>0;i--) {
			res+=tmp[i];
			res+=" ";
		}
		return res+tmp[0];
	}
}*/