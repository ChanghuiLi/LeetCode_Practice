package 面试前必看;

import java.util.HashMap;

public class LeetCode3无重复字符最长子串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abcabcbb";
		System.out.println(lengthOfLongestSubstring(a));

	}
	public static int lengthOfLongestSubstring(String s) {
		//滑动窗口的解法:用一个HashMap<Key,Value>，其中Key是元素Character，Value是位置信息。
		HashMap<Character,Integer> map = new HashMap<>();
		int res = 0;
		for(int start = 0,end = 0;end<s.length();end++) {
			char t = s.charAt(end);
			if(map.containsKey(t)) {
				start = Math.max(start, map.get(t));
			}
			res = Math.max(end-start+1, res);
			map.put(t, end+1);
		}
		
		
		return res;
        
    }

}
