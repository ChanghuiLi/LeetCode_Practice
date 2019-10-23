import java.util.Scanner;

public class 度小满金融 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    int[] nums = new int[N+1];
	    for(int i = 1;i<nums.length;i++) {
	    	nums[i] = in.nextInt();
	    }
	    int res = 0;
	    for(int i = 1;i<nums.length-1;i++) {
	    	if(nums[i]!=0&&(i*2)<nums.length&&nums[i*2]>0&&(i*2+1)<nums.length&&nums[i*2+1]>0) {
	    		nums[i]--;
	    		nums[i*2]--;
	    		nums[i*2+1]--;
	    		res++;	
	    	}
	    }
	    for(int i = 1;i<nums.length-1;i++) {
	    	if(nums[i]==0&&(i*2)<nums.length&&nums[i*2]>0&&(i*2+1)<nums.length&&nums[i*2+1]>0) {
	    		nums[i*2]--;
	    		nums[i*2+1]--;
	    		res++;	
	    	}else if(nums[i]>0&&(i*2)<nums.length&&nums[i*2]>0&&(i*2+1)<nums.length&&nums[i*2+1]==0) {
	    		nums[i]--;
	    		nums[i*2+1]--;
	    		res++;
	    	}else if(nums[i]>0&&(i*2)<nums.length&&nums[i*2]==0&&(i*2+1)<nums.length&&nums[i*2+1]>0) {
	    		nums[i]--;
	    		nums[i*2]--;
	    		res++;
	    	}
	    }
	    for(int i = 1;i<nums.length-1;i++) {
	    	if(nums[i]!=0) {
	    		nums[i]--;
	    		
	    		res++;	
	    	}
	    }
	    
	    System.out.println(res);

	}

}
