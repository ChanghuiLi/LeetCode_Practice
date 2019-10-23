package DP;

public class Stock1 {
	//一次买卖
	public int maxProfit1(int[] prices) {
		if(prices.length<=1||prices==null) return 0;
		int min = prices[0];
		int res = 0;
		for(int i = 1;i<prices.length;i++) {
			if(prices[i]<min) {
				min = prices[i];
			}
			res = Math.max((prices[i]-min), res);
		}
		return res;
	}
	//股票买卖不限次数
	public int maxProfitn(int[] prices) {
		if(prices.length<=1||prices==null) return 0;
		int res = 0;
		for(int i = 1;i<prices.length;i++) {
			if(prices[i]>prices[i-1]) {
				res = res+(prices[i]-prices[i-1]);
			}
		}
		return res;
	}
	//买卖两次，将价格分为两组，每一组分别用股票买卖一次价格最低的方法。
	//
	public int maxProfittwo(int[] prices) {
        int onebuy = Integer.MAX_VALUE;
        int twobuy = Integer.MIN_VALUE;
        int onesellget = 0;
        int twosellget = 0;
        for(int i =0;i < prices.length;i++) {
        	onebuy = Math.min(onebuy, prices[i]);
        	onesellget = Math.max(prices[i]-onebuy,onesellget);//第一次交易净赚。
        	twobuy = Math.max(onesellget-prices[i], twobuy);//第二次买了之后剩下的钱。
        	twosellget = Math.max(twosellget, prices[i]+twobuy);
        }
        return twobuy;
        
        
        
        
        
        
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(9/2);
	}

}
