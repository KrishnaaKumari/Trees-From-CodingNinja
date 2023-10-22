
public class PrintNodesAtDepthK {
	
	static public void printNodesAtDepthK(TreeNode root , int k)
	{
		if(root==null)
			return ;
		if(k==0)
			System.out.print(root.val+" ");
		printNodesAtDepthK(root.left,k-1);
		printNodesAtDepthK(root.right,k-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=CreateTreeLevelOrder1.buildTreeLevelOrder();
		printNodesAtDepthK(root,1);

	}

}
