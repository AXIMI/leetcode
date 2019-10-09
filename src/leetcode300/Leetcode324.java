package leetcode300;

public class Leetcode324 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {2,1};
		s.wiggleSort(nums);
		for(int num : nums)
			System.out.print(num+"  ");
		
	}

}

//class Solution {
//    public void wiggleSort(int[] nums) {
//    	boolean flag=true;
//    	int len=nums.length;
//    	boolean[] flags=new boolean[len];
//    	int[] res=new int[len];
//    	
//    	for(int i=0;i<len;i++) {
//    		res[0]=nums[i];
//    		flags[i]=true;
//    		if(findNext(res,0,flag,flags,nums,len-1))
//    			break;
//    		flags[i]=false;
//    	}
//    	
//    	for(int i=0;i<len;i++)
//    		nums[i]=res[i];
//    }
//    
//    private boolean findNext(int[] res,int p,boolean flag,boolean[] flags,int[] nums,int cnt) {
//    	if(cnt==0)	return true;
//    	int len=nums.length;
//    	if(flag) {
//    		for(int i=0;i<len;i++) {
//    			if(!flags[i]&&nums[i]>res[p]) {
//    				res[++p]=nums[i];
//    				flags[i]=true;
//    				if(findNext(res,p,false,flags,nums,cnt-1))	return true;
//    				p--;
//    				flags[i]=false;
//    			
//    			}
//    		}
//    	}else {
//    		for(int i=0;i<len;i++) {
//    			if(!flags[i]&&nums[i]<res[p]) {
//    				res[++p]=nums[i];
//    				flags[i]=true;
//    				if(findNext(res,p,true,flags,nums,cnt-1))	return true;
//    				p--;
//    				flags[i]=false;
//    			}
//    		}
//    	}
//    	return false;
//    }
//    
//    
//}