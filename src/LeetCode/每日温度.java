package LeetCode;

import java.util.Stack;
//单调栈
public class 每日温度 {
	
	//单调栈的思考，计算距离的时候会用到。维护一个递增或者递减的序列，用一个栈来记录位置信息。
	public int[] dailyTemperatures(int[] T) {
        if(T==null||T.length==0) return null;
        int[] res = new int[T.length];
        Stack<Integer> s = new Stack<Integer>();
        for(int i = T.length-1;i>=0;i--) {
        	while(!s.isEmpty()&&T[s.peek()]<=T[i]) {
        		s.pop();
        	}
        	res[i] = s.isEmpty()? 0:s.peek()-i;
        	s.push(i);
        }
        return res;
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
