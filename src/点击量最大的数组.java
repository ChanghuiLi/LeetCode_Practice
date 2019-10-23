import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 点击量最大的数组 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n][2];
        int tag = 0;
        while(sc.hasNextLine()&&tag<n) {
//        	String line = sc.nextLine();
//            String[] str = line.split(" ");
        	input[tag][0] = sc.nextInt();
        	input[tag][1] = sc.nextInt();
        	tag++;
        }
        Arrays.sort(input,(i1,i2)->Integer.compare(i1[0], i2[0]));
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int finalcount = 0;
        int value = 0;
        for(int i = input.length-1;i>=0;i--) {
        	int count = 0;
        	int tempvalue = input[i][0];
        	for(;i>=0&&input[i][0]==tempvalue;i--) {
        		count++;
        	}
        	if(count>finalcount) {
        		value = input[i+1][0];
        		finalcount = count;
        		
        	}
        }
        
        System.out.println(value);
        

	}

}
