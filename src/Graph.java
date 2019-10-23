import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Graph {
	
    public static void pritf(int[][] arcs){
        for(int i=0;i<arcs.length;i++){
            for(int j=0;j<arcs[0].length;j++){
                System.out.print(arcs[i][j]+ "\t");
            }
            System.out.println();
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int[][] arcs = new int[a][a];
		HashSet<Integer> seto = new HashSet<Integer>();
		for(int i = 0;i<b;i++) {
				int temp1 = sc.nextInt();
				int temp2 = sc.nextInt();
				arcs[temp1-1][temp2-1] = 1;
		        arcs[temp2-1][temp1-1] = 1;
		        seto.add(temp1);
		        seto.add(temp2);
			
		}
//		pritf(arcs);
		int res = a-seto.size();
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		for(int tem :seto) {
			if(isOK(set1,tem-1,arcs)){
				set1.add(tem);
//				System.out.println("set1"+tem+"  " +set1.size());
				
			}else if(isOK(set2,tem-1,arcs)){
				set2.add(tem);
				/System.out.println("set2"+tem+"  "+set2.size());
			}
//			if(set1.size()<=set2.size()) {
//				if(isOK(set1,tem,arcs)){
//					set1.add(tem);
//					System.out.println("set1"+tem+"  " +set1.size());
//					
//				}else if(isOK(set2,tem,arcs)){
//					set2.add(tem);
//					System.out.println("set2"+tem+"  "+set2.size());
//				}
//			}else {
//				if(isOK(set2,tem,arcs)){
//					set2.add(tem);
//					System.out.println("set2"+tem+"  "+set2.size());
//				}else if(isOK(set1,tem,arcs)){
//					set1.add(tem);
//					System.out.println("set1"+tem+"  "+set1.size());
//				}
//			}
		}
		
		if(res%2==0) {
			System.out.println(res+2*Math.min(set1.size(), set2.size()));
		}else {
			if(set1.size()==set2.size()) {
				System.out.println(res+2*Math.min(set1.size(), set2.size()));
			}else {
				System.out.println(res+1+2*Math.min(set1.size(), set2.size()));
			}
			
		}
		
		
	}

	private static boolean isOK(HashSet<Integer> set1, int i, int[][] arcs) {
		// TODO Auto-generated method stub
		for(int k = 0;k<arcs[0].length;k++) {
			if(arcs[i][k]==1) {
				if(set1.contains(k+1)) {
					
					return false;
				}
			}
		}
		return true;
	}

}

