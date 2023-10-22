
public class FindMaxInTreeNode {
	
	
	public static int findMaxNode(TreeNode root)
	{
		if(root==null)
			return 0 ;
		
		int leftmax=findMaxNode(root.left);
		int rightmax=findMaxNode(root.right);
		
		int max = Math.max(leftmax, rightmax);
		return Math.max(max, root.val);
			
	}

	public static void main(String[] args) {

		TreeNode root = CreateTreeLevelOrder1.buildTreeLevelOrder();
		System.out.println("Maximum of all nodes: ");
		System.out.println(findMaxNode(root));

	}

}
