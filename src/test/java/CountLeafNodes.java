
public class CountLeafNodes {
	
	public static int countLeafNodes(TreeNode root)
	{
		if(root==null)
			return 0 ;
		
		if(root.left==null&&root.right==null)
		{
			return 1;
		}
		
		return countLeafNodes(root.left)+countLeafNodes(root.right);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=CreateTreeLevelOrder1.buildTreeLevelOrder();
		System.out.println(countLeafNodes(root));

	}

}
