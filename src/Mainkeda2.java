import java.util.Scanner;

public class Mainkeda2 {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    	if(sc.hasNextLine()) {
    		//读取数据
        	String s = sc.nextLine();
        	String s1 = s.substring(1, s.length()-1);
        	//System.out.println(s1);
			String[] array1 = s1.split(",");
			int[] b = new int[array1.length];
			for(int m =0;m<b.length;m++) {
				b[m] = Integer.parseInt(array1[m]);
			}
            int t = 19;
			int res = Search(b, 0 , b.length-1, t);
			System.out.println(res+1);
	 }
	}

	private static int Search(int[] b, int start, int end, int target) {
		// TODO Auto-generated method stub
		if(start>end) {
			return -1;
		}else {
            int mid = (end+start)/2;
		    if(b[mid] == target) {
				return mid;
		    }else if(b[mid] > target){
				return Search(b,start,mid-1,target);
		    }else {
				return Search(b,mid+1,end,target);
		    }
		}
	}

}
