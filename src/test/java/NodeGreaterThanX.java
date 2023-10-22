
//return the number of nodes whose value is greater than x 
public class NodeGreaterThanX {
	
	public static int findGreater(TreeNode root, int x)
	{
		if(root==null)
			return 0;
		
		if(root.val>x)
		{
			return 1+findGreater(root.left,x)+findGreater(root.right,x);
		}
		else {
			return findGreater(root.left,x)+findGreater(root.right,x);
		}
		
	}

	public static void main(String[] args) {
		TreeNode root= CreateTreeLevelOrder1.buildTreeLevelOrder();
		int x=15;
		System.out.println("Greater nodes are : ");
		System.out.println(findGreater(root,x));
		
	}

}
