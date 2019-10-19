package leetcode300;
import java.util.*;
public class Leetcode332 {

	public static void main(String[] args) {
		Solution s=new Solution();
		List<List<String>> tickets = new ArrayList<>();
		
		List<String> t1=new ArrayList<String>();
		t1.add("JFK");
		t1.add("AAA");

		List<String> t2=new ArrayList<String>();
		t2.add("AAA");
		t2.add("JFK");
		
		List<String> t3=new ArrayList<String>();
		t3.add("JFK");
		t3.add("BBB");
		
		List<String> t4=new ArrayList<String>();
		t4.add("JFK");
		t4.add("CCC");
		
		List<String> t5=new ArrayList<String>();
		t5.add("CCC");
		t5.add("JFK");
		
		tickets.add(t1);
		tickets.add(t2);
		tickets.add(t3);
		tickets.add(t4);
		tickets.add(t5);
//		List<String> t1=new ArrayList<String>();
//		t1.add("JFK");
//		t1.add("KUL");
//		
//		List<String> t2=new ArrayList<String>();
//		t2.add("JFK");
//		t2.add("NRT");
//		
//		List<String> t3=new ArrayList<String>();
//		t3.add("NRT");
//		t3.add("JFK");
//		
//		tickets.add(t1);
//		tickets.add(t2);
//		tickets.add(t3);
		
//		List<String> t1=new ArrayList<String>();
//		t1.add("JFK");
//		t1.add("SFO");
//		List<String> t2=new ArrayList<String>();
//		t2.add("JFK");
//		t2.add("ATL");
//		List<String> t3=new ArrayList<String>();
//		t3.add("SFO");
//		t3.add("ATL");
//		List<String> t4=new ArrayList<String>();
//		t4.add("ATL");
//		t4.add("JFK");
//		List<String> t5=new ArrayList<String>();
//		t5.add("ATL");
//		t5.add("SFO");
//		
//		tickets.add(t1);
//		tickets.add(t2);
//		tickets.add(t3);
//		tickets.add(t4);
//		tickets.add(t5);
		
		
		List<String> res=s.findItinerary(tickets);
		for(String site: res)
			System.out.println(site);
	}

}

//class Solution {
//    public List<String> findItinerary(List<List<String>> tickets) {
//    	List<String> curAirline=new ArrayList<String>();
//    	List<String> res = new ArrayList<String>();
//    	
//    	curAirline.add("JFK");
//    	String site = "";
//    	for(int i=0;i<tickets.size();i++) {
//    		if(tickets.get(i).get(0).equals("JFK")) {
//    			List<String> tmp = new ArrayList<>();
//    			tmp.add(tickets.get(i).get(0));
//    			tmp.add(tickets.get(i).get(1));
//    			
//    			site = tickets.get(i).get(1);
//    			
//    			curAirline.add(site);
//    			tickets.remove(i);
//    			findNext(tickets, site, curAirline, res);
//    			curAirline.remove(curAirline.size()-1);
//    			tickets.add(i,tmp);
//    		}
//    	}
//    	
//    	return res;
//    	
//    }
//    
//    public void findNext(List<List<String>> tickets, String site, 
//    		List<String> curAirline, List<String> res) {
//    	String curSite= "";
//    	if(tickets.size()==0) {
//    		if(res.size()==0)	res.addAll(curAirline);
//    		else {
//    		String s1=turnArrayToString(curAirline);
//    		String s2=turnArrayToString(res);
//    		
//    		if(s1.compareTo(s2)<0) {
//    			res.clear();
//    			res.addAll(curAirline);
//    		}
//    		}
//    	}
//    	for(int i=0,len=tickets.size();i<len;i++) {
//    		if(tickets.get(i).get(0).equals(site)) {
//    			List<String> tmp=new ArrayList<>();
//    			tmp.add(tickets.get(i).get(0));
//    			tmp.add(tickets.get(i).get(1));
//    			
//    			curSite = tickets.get(i).get(1);
//    			curAirline.add(curSite);
//    			tickets.remove(i);
//    			
//    			findNext(tickets, curSite, curAirline, res);
//    			tickets.add(i, tmp);
//    			curAirline.remove(curAirline.size()-1);
//    		}
//    	}
//    }
//    
//    public String turnArrayToString(List<String> stringArray) {
//    	String res="";
//    	for(String s: stringArray)
//    		res+=s;
//    	return res;
//    }
//    
//}