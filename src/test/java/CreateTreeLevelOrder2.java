/*
 * Build a tree in java level order when specific height is given
 * then print tree
 * 
 */
import java.util.* ;
class TreeNodes
{
	int val;
	TreeNodes left, right;
	TreeNodes(int ele)
	{
		this.val=ele ;
		left=right=null ;
	}
}
public class CreateTreeLevelOrder2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter height of tree");
		int h=sc.nextInt();
		TreeNodes root = buildLevelOrder(h);
		System.out.println("Level order printing of tree: ");
		printLevelOrder(root);

	}
	public static TreeNodes buildLevelOrder(int h)
	{
		Scanner sc = new Scanner(System.in);
		if(h==0)
			return null ;
		System.out.print("Enter root: ");
		TreeNodes root = new TreeNodes(sc.nextInt());
		Queue<TreeNodes>queue= new LinkedList<TreeNodes>();
		
		queue.add(root);
		while(h>0)
		{
			TreeNodes curr = queue.poll();
			System.out.println("Enter left: ");
			int leftnode = sc.nextInt();
			if(leftnode!=-1)
			{
				curr.left=new TreeNodes(leftnode);
				queue.add(curr.left);
			}
			System.out.println("Enter right: ");
			int rightnode= sc.nextInt();
			if(rightnode!=-1)
			{
				curr.right=new TreeNodes(rightnode);
				queue.add(curr.right);
			}
			h-- ;
		}
		return root ;
	}
	public static void printLevelOrder(TreeNodes root)
	{
		if(root==null)
			return ;
		
		Queue<TreeNodes>queue= new LinkedList<TreeNodes>();
		queue.add(root);
		System.out.print(root.val+" ");
		while(!queue.isEmpty())
		{
			TreeNodes curr = queue.poll();
			
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
