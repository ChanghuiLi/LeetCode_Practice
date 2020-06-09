package 数组和矩阵问题;

public class 奇数下标都是奇数偶数是偶数 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {8,1};
		int[] b = Solution(a);
		for(int i = 0; i< b.length;i++) {
			System.out.print(b[i]+" ");
		}

	}
	public static int[] Solution(int[] nums) {
		int even = 0;
		int odd = 1;
		int temp = 0;
		while(even<nums.length&&odd<nums.length) {
			if((nums[even]&1)==0&&(nums[odd]&1)!=0) {
				//jiaohuan
				temp = nums[even];
				nums[even] = nums[odd];
				nums[odd] = temp;
				even += 2;
				odd +=2;
			}else if((nums[even]&1)==0&&(nums[odd]&1)==0) {
				even+=2;
			}else if((nums[even]&1)!=0&&(nums[odd]&1)!=0) {
				odd+=2;
			}else {
				even+=2;
				odd+=2;
			}
		}
		return nums;
	}

}
