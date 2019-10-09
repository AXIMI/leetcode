package leetcode100;

public class Leetcode165 {

	public static void main(String[] args) {
		Solution s=new Solution();
		String version1="0.1";
		String version2="1.1";
		System.out.println(s.compareVersion(version1, version2));
		
	}

}

/*
class Solution {
    public int compareVersion(String version1, String version2) {
        if(version1==null||version2==null)	return 0;
        
        int len1=version1.length();
        int len2=version2.length();
        int p11=0,p12=0,p21=0,p22=0;
        int num1,num2;
        String str1,str2;
        while(p12<len1&&p22<len2) {
        	while(p12<len1&&version1.charAt(p12)!='.')
        		p12++;
        	while(p22<len2&&version2.charAt(p22)!='.')
        		p22++;
        	str1=version1.substring(p11,p12);
        	str2=version2.substring(p21,p22);
        	
        	num1=Integer.valueOf(str1);
        	num2=Integer.valueOf(str2);
        	if(num1>num2)	return 1;
        	else if(num1<num2)	return -1;	
        	p12++;p22++;p11=p12;p21=p22;
        }
        while(p12<len1) {
        	while(p12<len1&&version1.charAt(p12)!='.')
        		p12++;
        	str1=version1.substring(p11,p12);
        	num1=Integer.valueOf(str1);
        	if(num1>0)	return 1;
        	p12++;p11=p12;
        }
        while(p22<len2){
        	while(p22<len2&&version2.charAt(p22)!='.')
        		p22++;
        	str2=version2.substring(p21,p22);
        	num2=Integer.valueOf(str2);
        	if(num2>0)	return -1;
        	p22++;p21=p22;
        }
        return 0;
    }
}
*/