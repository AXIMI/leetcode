package leetcode100;
import java.util.*;
public class Leetcode166 {

	public static void main(String[] args) {
		Solution s=new Solution();
		System.out.println(s.fractionToDecimal(2,3));
	}

}

/*
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
    	if(numerator==0||denominator==0)	return "0";
    	
    	StringBuilder res=new StringBuilder();
    	res.append(((numerator>0)^(denominator>0))?"-":"");
    	
    	
    	// integral part
    	long n=Math.abs((long)numerator);   // 先long再abs
    	long d=Math.abs((long)denominator);
    	res.append(n/d);
    	n%=d;
    	if(n==0)	return res.toString();
    	
    	// fraction part
    	res.append(".");
    	Map<Long,Integer> map=new HashMap<>();
    	map.put(n,res.length());
    	while(n!=0) {
    		n*=10;
    		res.append(n/d);
    		n%=d;
    		if(map.containsKey(n)) {
    			res.insert(map.get(n), "(");
    			res.append(")");
    			break;
    		}else {
    			map.put(n,res.length());
    		}
    	}
    	
    	return res.toString();
    }
}

*/


/*
class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
    	if(numerator==0||denominator==0)	return "0";
    	String result="";
    	
    	double up=(double)numerator;
    	double down=(double)denominator;
    	int res;int factor=1;
    	
    	if((up>0&&down<0)||(up<0&&down>0)) {
    		result+="-";
    	}
    	
    	up=up>0?up:-1*up;
    	down=down>0?down:-1*down;
    	
    	if((up/down)>Integer.MAX_VALUE) {
    		result+="2147483648";
    	}else {
    		res=getRes(up,down);
    		result+=String.valueOf();
    		
    	}
    	up-=res*down;
    	
    	if(up==0)	return result;
    	
    	List<Double> tmpD=new ArrayList<>();
    	List<Integer> tmpRes=new ArrayList<>();
    	
    	result+=".";
    	while(up!=0) {
    		if(tmpD.contains(up)) {
    			return addToResult(result,tmpD,tmpRes,up,true);
    		}
    		tmpD.add(up);
    		up*=10;
    		res=getRes(up,down);
    		tmpRes.add(res);
    		
    		up-=res*down;
    	}
    	
    	return addToResult(result,tmpD,tmpRes,up,false);
    }
    
    public String addToResult(String result,List<Double> tmpD,List<Integer> tmpRes,double up,boolean circle) {
    	if(circle) {
    	int p=0;
    	for(;p<tmpD.size();p++) {
    		if(tmpD.get(p)!=up)
    			result+=String.valueOf(tmpRes.get(p));
    		else	break;
    	}
    		
    	result+="(";
    	for(;p<tmpRes.size();p++)
    		result+=String.valueOf(tmpRes.get(p));
    	result+=")";
    	}else {
    		for(int i=0;i<tmpRes.size();i++)
    			result+=String.valueOf(tmpRes.get(i));
    	}
    	return result;
    }

    public Integer getRes(double up,double down) {
    	up=up>0?up:-1*up;
    	down=down>0?down:-1*down;
    	
    	int res=(int)(up/down);
    	return res*down>up?res-1:res;
    }


}
*/

/*
class Solution{
	public String fractionToDecimal(int numerator, int denominator) {
		if(numerator==0||denominator==0)	return "0";
		
		int up=numerator;
		int down=denominator;
		
		List<Integer> intPart=ArrayList<Integer>();
		int 
		
		
		
	}
}
*/
/*
特殊点的处理情况：
分子或者分母为0

分子或者分母中负数

数字越界的情况（例如数字存在-2147483648，但是需要转成正数时）

-2147483648/1

*/