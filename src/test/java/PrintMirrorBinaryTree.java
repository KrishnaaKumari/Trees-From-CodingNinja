
public class PrintMirrorBinaryTree {
	
	public static TreeNode mirror(TreeNode root)
	{
		if(root==null)
			return null ;
		TreeNode curr=root.left ;
		root.left=mirror(root.right);
		root.right=mirror(curr);
		return root ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = CreateTreeLevelOrder1.buildTreeLevelOrder();
		CreateTreeLevelOrder1.printLevelOrder(root);
		System.out.println();
		root=mirror(root);
		CreateTreeLevelOrder1.printLevelOrder(root);

	}

}
