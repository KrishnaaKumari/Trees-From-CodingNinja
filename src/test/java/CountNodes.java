
public class CountNodes {
	public static int countNodes(TreeNode root)
	{
		if(root==null)
			return 0 ;
		int l=0, r=0 ;
		if(root.left!=null)
		 l=countNodes(root.left);
		if(root.right!=null)
		 r=countNodes(root.right);
		return l+r+1;
	}
	
	public static void main(String[]args)
	{
//		CreateTreeLevelOrder1 tree = new CreateTreeLevelOrder1();
		TreeNode root= CreateTreeLevelOrder1.buildTreeLevelOrder();
		System.out.println("Total nodes present in tree "+ countNodes(root));
	}
	

}
