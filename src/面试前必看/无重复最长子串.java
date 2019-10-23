package 面试前必看;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 无重复最长子串 {
	//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
	//"abcabcbb"_输出: 3
	
	public static int lenstring(String str) {
		if(str==null||str.length()==0) return 0;
		Set<Character> res = new HashSet<Character>();
		int s = 0, j = 0,ans = 0;
		int n = str.length();
		while(s < n && j < n) {
			if(!res.contains(str.charAt(j))) {
				res.add(str.charAt(j++));
				ans = Math.max(ans, j-s);
			}
			else {
				res.remove(str.charAt(s++));
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
