
public class RemoveLeafNodes {
	public static TreeNode removeLeaf(TreeNode root)
	{
		if(root==null)
			return null;
		if(root.left==null&&root.right==null)
			{
			return null;
			}
		
		root.left=removeLeaf(root.left);
		root.right=removeLeaf(root.right);
		
		return root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root= CreateTreeLevelOrder1.buildTreeLevelOrder();
		root=removeLeaf(root);
		CreateTreeLevelOrder1.printLevelOrder(root);

	}

}
