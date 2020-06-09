package Bigo;

public class 升序数组中target有重复 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[10];
		int target = 5;
		int[] res = Bisearch2(input,0,input.length,target);
	}

	private static int[] Bisearch2(int[] input, int i, int length, int target) {
		// TODO Auto-generated method stub
		int[] res = new int[] {0,0};
		int tag =  Bisearch(input,0,input.length,target);
		
		return res;
	}

	private static int Bisearch(int[] input,int start,int end,int target) {
		// TODO Auto-generated method stub
		int mid = 0;
		while(start<=end) {
			mid = (start+end)/2;
			if(input[mid]==target) {
				return mid;
			}else if(input[mid]>target) {
				end = mid-1;
			}else {
				start = mid +1;
			}
		}
		return 0;
	}

}
