package 错题;

class 有序数组转化为二叉搜索树 {
	public TreeNode sortedArrayToBST(int[] nums) {
		if(nums==null) return null;
		return build(nums,0,nums.length-1);
	}

	private TreeNode build(int[] nums, int i, int length) {
		// TODO Auto-generated method stub
		if(i>length) return null;
		int mid = (i+length)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = build(nums,i,mid-1);
		root.right = build(nums,i,mid+1);
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
