package 递归与动态规划;

public class 最小编辑距离 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//ic表示插入一个字符的代价，dc表示删除一个字符的代价。rc表示替换一个字符的代价。
	//dp[i][j]=dp[i-1][j-1] Str1[i] == Str2[j]，两层循环一直变i的化
//	dp[i][j] = dp[i-1][j]+dc; Str1[0->i-1]编辑成Str2[0->j] ，删掉Str1【i】
//	dp[i][j] = dp[i][j-1]+ic；Str1【1——i】编辑成了Str2【0--j-1】，两个目前状态相等了。Str1需要再插入Str2【j】才可以继续相等。
	
	

}
