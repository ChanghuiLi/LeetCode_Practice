import java.util.HashSet;

public class help {
	public static void main(String[] args) {
        String a = "ABC";
        int res = Solution(a);
        System.out.println(res);
    }
    
    //dp[i] = dp[i-1] + (dp[i-1]+1) ——没有s.charAt(i)没出现过
    //dp[i] = 2*dp[i-1]
    
    public static int Solution(String s){
        int[] dp = new int[s.length()+1];
        dp[0] = 0;
        dp[1] = 1;
        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));
        for(int i = 2;i<=s.length();i++){
            if(!set.contains(s.charAt(i-1))){
                dp[i] = 2*dp[i-1]+1;
                set.add(s.charAt(i-1));
            }
            else{
                dp[i] = 2*dp[i-1];
            }
        }
        
        return dp[s.length()];
    }

}
