
public class ReplaceNodesWithDepthK {
	
	public static void replaceNodesWithDepths(TreeNode root, int k)
	{
		if(root==null)
			return ;
		root.val=k;
		replaceNodesWithDepths(root.left,k+1);
		replaceNodesWithDepths(root.right,k+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root= CreateTreeLevelOrder1.buildTreeLevelOrder();
		replaceNodesWithDepths(root,0);
		CreateTreeLevelOrder1.printLevelOrder(root);

	}

}
