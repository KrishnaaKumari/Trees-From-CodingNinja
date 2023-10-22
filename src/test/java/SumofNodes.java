
public class SumofNodes {
	
	public static int sumOfNodes(TreeNode root)
	{
		if(root==null)
			return 0 ;
		int leftsum=0, rightsum=0 ;
		if(root.left!=null)
			leftsum=sumOfNodes(root.left);
		if(root.right!=null)
			rightsum=sumOfNodes(root.right);
		
		return root.val+leftsum+rightsum ;
			
	}

	public static void main(String[] args) {
	
		TreeNode root= CreateTreeLevelOrder1.buildTreeLevelOrder();
		System.out.println("Sum of nodes in tree is : "+sumOfNodes(root));

	}

}
