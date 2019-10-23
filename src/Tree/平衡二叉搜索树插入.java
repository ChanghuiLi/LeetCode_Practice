package Tree;

//升序的平衡二叉树插入
public class 平衡二叉搜索树插入 {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			this.val = x;
		}
	}
	public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0||nums==null) return null;
        return insert(nums,0,nums.length-1);
    }

	private TreeNode insert(int[] nums, int start, int end) {
		// TODO Auto-generated method stub
		if(start==end) {
			return null;
		}
		int mid = (start+end)/2;
		TreeNode root = new TreeNode(nums[mid]);
		root.left = insert(nums,start,mid-1);
		root.right = insert(nums,mid+1,end);
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
