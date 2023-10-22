/*
 * 
 * A tree is called balanced if it has weight -1,0,+1
 * weight is called difference between height of left subtree and right subtree
 * 
 * 
 * 
 */



public class CheckBalancedTree {
	
	public static int height(TreeNode root)
	{
		if(root==null)
			return 0 ;
		int leftheight=height(root.left);
		int rightheight=height(root.right);
		return 1+Math.max(leftheight, rightheight);
	}

	public static boolean checkBalance(TreeNode root)
	{
		if(root==null)
			return true ;
		int w =height(root.left)-height(root.right);
		if(Math.abs(w)>1)
			return false;
		return checkBalance(root.left)&&checkBalance(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root= CreateTreeLevelOrder1.buildTreeLevelOrder();
		System.out.println(checkBalance(root));

	}

}
