
public class FindHeightOfTree {
	
	public static int heightCount(TreeNode root)
	{
		if(root==null)
			return 0;
		
		int leftheight=heightCount(root.left);
		int rightheight=heightCount(root.right);
		return 1+Math.max(leftheight, rightheight);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode root=CreateTreeLevelOrder1.buildTreeLevelOrder();
		System.out.println(heightCount(root));

	}

}
