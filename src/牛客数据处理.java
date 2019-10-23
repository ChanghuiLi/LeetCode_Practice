 import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Scanner;

public class 牛客数据处理{
    public static void main(String[] args){
    	Scanner sc=new Scanner(System.in);
        //读取一行元素；
        while(sc.hasNext()){
            String s=sc.nextLine();
            
            for(int i=s.length()-1;i>=0;i--){
                System.out.print(s.charAt(i));
            }
        }
        
        
        
        
    }
    
}
//读取一行元素，将其划分成数字数组的形式
public class Main3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] input = new int[5][5];
		int p = 0;
		if(sc.hasNextLine()&&p<5) {
			for(int m = 0;m<5;m++) {
				input[p][m] = sc.nextInt();
			}
			p++;
		}
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5;j++) {
				System.out.print(input[i][j]);
			}
			System.out.println();
		}
	}
}

//读取一行元素，将其划分成数字数组的形式
public class Main2{
	public static void main1(String[] args) {
		Scanner sc=new Scanner(System.in);
    	if(sc.hasNextLine()) {
        	String s1 = sc.nextLine();
			String[] array1 = s1.split(" ");
			int[] b = new int[array1.length];
			for(int m =0;m<b.length;m++) {
				b[m] = Integer.parseInt(array1[m]);
			}
			String s2 = sc.nextLine();
			String[] array2 = s2.split(" ");
			int[] b2 = new int[array2.length];
			for(int m =0;m<b2.length;m++) {
				b2[m] = Integer.parseInt(array2[m]);
			}
        }
    }
}
