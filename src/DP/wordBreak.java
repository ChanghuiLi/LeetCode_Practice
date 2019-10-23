package DP;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class wordBreak {
	public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set= new HashSet<>();
        for(int i = 0;i<wordDict.size();i++) {
        	set.add(wordDict.get(i));
        }
        boolean[] dp = new boolean[s.length()];
        dp[0] = true;
        for(int start = 0;start<s.length();start++) {
        	if(wordDict.contains(s.substring(0, start+1))) {
        		dp[start] = true;
        		break;
        	}
        	for(int t = 0;t<start;t++) {
        		if(dp[t]&&set.contains(s.substring(t+1, start+1))){
        			dp[start]=true;
        			break;
        		}
        	}
        	
        }
        
        return dp[s.length()-1];
    }

	private boolean find(String s, Set<String> set) {
		// TODO Auto-generated method stub
		if()
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
