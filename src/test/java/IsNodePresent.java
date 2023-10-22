
public class IsNodePresent {
	
	public static boolean isNodePresent(TreeNode root, int data)
	{
		if(root==null)
			return false;
		if(root.val==data)
			return true ;
		return isNodePresent(root.left, data)||isNodePresent(root.right,data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root= CreateTreeLevelOrder1.buildTreeLevelOrder();
		System.out.println(isNodePresent(root,20));
		System.out.println(isNodePresent(root,15));
	}

}
