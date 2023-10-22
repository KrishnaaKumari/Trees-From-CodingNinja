
public class FindDiameterOfTree {
	
	public static int getHeight(TreeNode root)
	{
		if(root==null)
			return 0 ;
		int leftheight=getHeight(root.left);
		int rightheight=getHeight(root.right);
		return 1+Math.max(leftheight, rightheight);
	}
	
	public static int getDiameter(TreeNode root)
	{
		if(root==null)
			return 0 ;
		int leftside=getDiameter(root.left);
		int rightside=getDiameter(root.right);
		
		int leftheight=getHeight(root.left);
		int rightheight=getHeight(root.right);
		int dia=1+leftheight+rightheight ;
		
		return Math.max(dia, Math.max(leftside,rightside));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = CreateTreeLevelOrder1.buildTreeLevelOrder();
		System.out.println(getDiameter(root));
		//2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 8 -1 -1 9 -1 -1 -1 -1 -1 -1 
	}

}
