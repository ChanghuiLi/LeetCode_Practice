package Bigo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class LeetCode151翻转字符串 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String reverseWords(String s) {
		StringBuilder TempStr = TrimSpace(s);
		reverse(TempStr,0,TempStr.length()-1);
		reverseEachWord(TempStr);
		return TempStr.toString();

    }
	public String reverseWords2(String s) {
        // 除去开头和末尾的空白字符
        s = s.trim();
        // 正则匹配连续的空白字符作为分隔符分割
        List<String> wordList = Arrays.asList(s.split("\\s+"));
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

	private void reverseEachWord(StringBuilder tempStr) {
		// TODO Auto-generated method stub
		
	}
	private void reverse(StringBuilder tempStr, int i, int j) {
		// TODO Auto-generated method stub
		
	}
	private StringBuilder TrimSpace(String s) {
		// TODO Auto-generated method stub
		return null;
	}

}
