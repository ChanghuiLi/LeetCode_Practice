package Tree;

public class GetNext {
	public class TreeLinkNode {
	    int val;
	    TreeLinkNode left = null;
	    TreeLinkNode right = null;
	    TreeLinkNode next = null;

	    TreeLinkNode(int val) {
	        this.val = val;
	    }
	}
	//二叉搜索树找到他的下一个节点
	public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null) return null;
        if(pNode.right!=null) {
        	//处理
        	pNode = pNode.right;
        	while(pNode.left!=null) {
        		pNode = pNode.left;
        	}
        	return pNode;
        }else if(pNode.next!=null&&pNode.next.left==pNode){
        	//输出父节点
        	return pNode.next;
        }else if(pNode.next!=null&&pNode.next.right==pNode) {
        	pNode = pNode.next;
        	while(pNode.next!=null&&pNode.next.left!=pNode) {
        		pNode = pNode.next;
        	}
        	return pNode.next;
        }else {
        	return pNode.next;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
