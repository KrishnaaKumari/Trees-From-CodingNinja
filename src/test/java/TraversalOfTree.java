
public class TraversalOfTree {
	
	public static void preOrder(TreeNode root)
	{
		if(root==null)
			return ;
		System.out.print(root.val+" ");
		preOrder(root.left);
		preOrder(root.right);
	}
	public static void inOrder(TreeNode root)
	{
		if(root==null)
			return ;
		inOrder(root.left);
		System.out.print(root.val+" ");
		inOrder(root.right);
	}
	public static void postOrder(TreeNode root)
	{
		if(root==null)
			return ;
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.val+" ");
	}

	public static void main(String[] args) {
		TreeNode root= CreateTreeLevelOrder1.buildTreeLevelOrder();
		System.out.println("Inorder traversal: ");
		inOrder(root);
		System.out.println();
		System.out.println("Preorder traversal: ");
		preOrder(root);
		System.out.println();
		System.out.println("Postorder traversal: ");
		postOrder(root);
		System.out.println();

	}

}
