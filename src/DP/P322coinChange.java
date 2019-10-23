package DP;

public class P322coinChange {
	public int coinChange(int[] coins, int amount) {
		if(coins.length==0||coins==null||amount<=0) return -1;
		int[] value = new int[amount+1];
		for(int i =1;i<=amount;i++) {
			int tempmin = Integer.MAX_VALUE;
			for(int j = 0;j<coins.length;j++) {
				if(coins[j]==i) {
					tempmin = 0;
					break;
				}
				if(i>coins[j]) {
					tempmin = Math.min(value[i-coins[j]], tempmin);
				}
			}
			
			value[i] = tempmin + 1;
		}
		if(value[amount] == Integer.MAX_VALUE) {
			return -1;
		}else {
			return value[amount];
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
