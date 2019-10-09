package leetcode100;

import java.util.*;

public class Leetcode155 {

	public static void main(String[] args) {
		MStack st = new MStack();
		st.push(0);
		st.push(1);
		st.push(0);
		System.out.println(st.getMin());
		st.pop();
		System.out.println(st.getMin());
		
		
		
		
		
//		st.push(2147483646);
//		st.push(2147483646);
//		st.push(2147483647);
//		System.out.println(st.top());
//		st.pop();
//		System.out.println(st.getMin());
//		st.pop();
//		st.push(-2147483648);
//		System.out.println(st.top());
//		System.out.println(st.getMin());
//		st.pop();
//		System.out.println(st.getMin());
	}

}



/*
class MStack {

	/** initialize your data structure here. */
	Stack<Integer> st = new Stack<Integer>();
	int min = Integer.MAX_VALUE;

	public MStack() {

	}

	public void push(int x) {
		if (x <= min) {
			st.push(min);
			min = x;
		}
		st.push(x);
	}

	public void pop() {
		if (st.pop() == min)
			min = st.pop();
	}

	public int top() {
		return st.peek();
	}

	public int getMin() {
		return min;
	}
}
*/


/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(x); obj.pop(); int param_3 = obj.top(); int param_4
 * = obj.getMin();
 */
