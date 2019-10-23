package Classic;

import java.util.Scanner;

public class bag2 {

	public static int dfs(int[]v,int n,int w) {
        if(w==0)return 1;
        if(n==0)return 1;
        if(w>=v[n-1])
            return dfs(v,n-1,w)+dfs(v,n-1,w-v[n-1]);
        else
            return dfs(v,n-1,w);
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        while(in.hasNext()) {
            int n=in.nextInt();//n袋零食
            int w=in.nextInt();//背包容量
            int[]v=new int[n];//零食体积
            long sum=0;
            for(int i=0;i<n;i++) {
                v[i]=in.nextInt();
                sum+=v[i];
            }
            if (sum <= w) {
                System.out.println((int)Math.pow(2, n));
            } else {
                System.out.println(dfs(v,n,w));
            }
             
                     
        }
         
    }

}
