import java.util.Arrays;
import java.util.Scanner;

public class tenxun3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
        while(a>0) {
            int count = in.nextInt();
            int [] nums=new int[count];
        	for(int i=0; i<nums.length; i++){
            	nums[i]=in.nextInt();
            }
        	Arrays.sort(nums);
        	
        	int tag = nums.length/2;
        	int tempcount = 1;
        	int pre = tag-1;
        	int head = tag+1;
        	while(pre>=0&&nums[pre] == nums[tag]) {
        		tempcount++;
        		pre--;
        	}
        	while(head<nums.length&&nums[head] == nums[tag]) {
        		tempcount++;
        		head++;
        	}
        	if(tempcount>nums.length/2) {
        		System.out.println("NO");
        	}else {
        		System.out.println("YES");
        	}
        	
        	a--;
        }

	}

}
