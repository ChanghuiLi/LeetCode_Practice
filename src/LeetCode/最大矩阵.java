package LeetCode;

import java.util.Stack;

public class 最大矩阵 {
	public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(-1);
        int area = 0;
        for(int i = 0; i < heights.length; i++) {
        	while(s.peek()!=-1&&heights[s.peek()]>heights[i]) {
            	area = Math.max(area, heights[s.pop()]*(i-s.peek()-1));
            }
        	s.push(i);
        }
        while(s.peek()!=-1) {
        	area = Math.max(area, heights[s.pop()]*(heights.length-s.peek()-1));
        }
        return area;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
