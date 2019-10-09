package leetcode200;
import java.util.*;
public class Leetcode239 {

	public static void main(String[] args) {
		Solution s=new Solution();
		int[] nums= {1,3,-1,-3,5,3,-3,-4};
		int[] res=s.maxSlidingWindow(nums, 3);
		for(Integer num: res)
			System.out.print(num+"  ");
	}

}

//class Solution {
//	public int[] maxSlidingWindow(int[] a, int k) {		
//		if (a == null || k <= 0) {
//			return new int[0];
//		}
//		int n = a.length;
//		int[] r = new int[n-k+1];
//		int ri = 0;
//		// store index
//		Deque<Integer> q = new ArrayDeque<>();
//		for (int i = 0; i < a.length; i++) {
//			// remove numbers out of range k
//			while (!q.isEmpty() && q.peek() < i - k + 1) {
//				q.poll();
//			}
//			// remove smaller numbers in k range as they are useless
//			while (!q.isEmpty() && a[q.peekLast()] < a[i]) {
//				q.pollLast();
//			}
//			// q contains index... r contains content
//			q.offer(i);
//			if (i >= k - 1) {
//				r[ri++] = a[q.peek()];
//			}
//		}
//		return r;
//	}
	
	
	
	
	
	
	
	
	
//    public int[] maxSlidingWindow(int[] nums, int k) {
//    	if(nums==null||nums.length==0)	return nums;	
//    	int[] res=new int[nums.length-k+1];
//        Stack<int[]> s=new Stack<>();
//        
//        int pos=0,max=Integer.MIN_VALUE,n=nums.length;
//        for(int i=0;i<k;i++) {
//        	if(nums[i]>max) {
//        		max=nums[i];	
//        		pos=i;
//        		
//        	}
//        }
//        int[] maxStart= {max,pos};
//		s.push(maxStart);
//        res[0]=max;
//        
//        for(int i=1;i<=n-k;i++) {
//        	if(!s.isEmpty()&&nums[i+k-1]>s.peek()[0]) {
//        		s.pop();
//        		int[] tmp= {nums[i+k-1],i+k-1};
//        		s.push(tmp);
//        		res[i]=nums[i+k-1];
//        	}else if(!s.isEmpty()&&(i-1)==s.peek()[1]) {
//        		s.pop();
//        		int[] tmp=new int[2];
//        		findNewMax(tmp,i,i+k-1,nums);
//        		s.push(tmp);
//        		res[i]=s.peek()[0];
//        	}else {
//        		res[i]=s.peek()[0];
//        	}
//        }
//        return res;
//        
//    }
//    
//    public void findNewMax(int[] max,int left,int right,int[] nums) {
//    	int tmp=Integer.MIN_VALUE;
//    	for(int i=left;i<=right;i++) {
//    		if(nums[i]>tmp) {
//    			max[0]=nums[i];
//    			max[1]=i;
//    			tmp=nums[i];
//    		}
//    	}
//    	
//    }
}