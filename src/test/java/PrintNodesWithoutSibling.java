
public class PrintNodesWithoutSibling {
	
	public static void printNoSiblingNodes(TreeNode root)
	{
		if(root==null)
			return;
		if(root.left==null&&root.right!=null)
			System.out.print(root.right.val+" ");
		if(root.left!=null&&root.right==null)
			System.out.print(root.left.val+" ");
		printNoSiblingNodes(root.left);
		printNoSiblingNodes(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root= CreateTreeLevelOrder1.buildTreeLevelOrder();
//		1 4 5 6 -1 -1 7 20 30 80 90 -1 -1 -1 -1 -1 -1 -1 -1
		printNoSiblingNodes(root);

	}

}
