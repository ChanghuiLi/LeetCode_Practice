import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class wuba {

	public static void main2(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        
       
        String[] str = line.split(",");
        int[] nums = new int[str.length];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    	for(int i=0; i<nums.length; i++){
        	nums[i]=Integer.parseInt(str[i]);
//        	System.out.println(nums[i]);
        }
    	Arrays.sort(nums);
    	for(int i = 0;i<nums.length;i++) {
    		if(!map.containsKey(nums[i])) {
    			map.put(nums[i],1);
    		}else {
    			int te = map.get(nums[i]);
    			map.put(nums[i],te+1);
    		}
    	}
    	int res = 0;
    	for(int key:map.keySet()) {
    		if(map.get(key)%2==1) {
    			res+=key;
    		}
    	}
    	
    	System.out.println(res+nums.length);
        

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String line = in.nextLine();
        String[] str = line.split(" ");
        int[] nums = new int[str.length];
    	for(int i=0; i<nums.length; i++){
        	nums[i]=Integer.parseInt(str[i]);
//        	System.out.println(nums[i]);
        }
    	int[] maxlen = new int[str.length];
    	if(nums[1]>=2) {
    		maxlen[0]=2;
    		for(int i = 2;i<n;i++) {
    			if(nums[i]>nums[i-1]) {
    				maxlen[0]++;
    			}else {
    				break;
    			}
    		}
    		
    	}
    	maxlen[n-1]=2;
    	for(int i = n-2;i>=0;i--) {
    		if(nums[i]>nums[i-1]) {
    			maxlen[n-1]++;
    		}else {
    			break;
    		}
    	}
    	for(int i =  1;i<=n-2;i++) {
    		if(nums[i+1]-nums[i-1]>=2) {
    			maxlen[i] = 3;
    			for(int j = i-1;j>0;j--) {
    				if(nums[j]>nums[j-1]) maxlen[i]++;
    				else break;
    			}
    			for(int j = i+1;j<n-1;j++) {
        			if(nums[j+1]>nums[j]){
        				maxlen[i]++;
        			}else {
        				break;
        			}
    			}
    		
    		}else {
    			maxlen[i] = 2;
    		}
    		Arrays.sort(maxlen);
    	}
    	
    	System.out.println(maxlen[n-1]);
        

	}

}
