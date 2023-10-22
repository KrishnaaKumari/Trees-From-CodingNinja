/*
 * Build a tree in java level order when height is not given
 * then print treee
 * 
 */
import java.util.*;

public class CreateTreeLevelOrder1 {

	public static void main(String[] args) {
		
		TreeNode root = buildTreeLevelOrder();
		System.out.println("Level order printing of tree: ");
		printLevelOrder(root);
	}
	
	public static TreeNode buildTreeLevelOrder()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root: ");
		TreeNode root = new TreeNode(sc.nextInt());
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode curr = queue.poll();
			System.out.println("Enter left child : ");
			int leftchild = sc.nextInt();
			if(leftchild!=-1)
			{
				curr.left=new TreeNode(leftchild);
				queue.add(curr.left);
			}
			System.out.println("Enter right child : ");
			int rightchild=sc.nextInt();
			if(rightchild!=-1)
			{
				curr.right=new TreeNode(rightchild);
				queue.add(curr.right);
			}
		}
		return root ;
	}
	
	public static void printLevelOrder(TreeNode root)
	{
		if(root==null)
			return ;
		
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		System.out.print(root.val+" ");
		while(!queue.isEmpty())
		{
			TreeNode curr= queue.poll();
			if(curr.left!=null)
			{
				System.out.print(curr.left.val+" ");
				queue.add(curr.left);
			}
			if(curr.right!=null)
			{
				System.out.print(curr.right.val+" ");
				queue.add(curr.right);
			}
		}
	}

}
