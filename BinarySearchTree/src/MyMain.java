import java.util.ArrayList;
import java.util.LinkedList;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,6,5,4,3,2,1};
	//	minimalHeightTree(arr);
		
		BinaryTree bt = new BinaryTree();
	//	bt.root = new Node(25);
		bt.inserthere(20);
		bt.inserthere(3);
		bt.inserthere(45);
		bt.inserthere(14);
		bt.inserthere(50);
		bt.inserthere(9);
		bt.inserthere(25);
		bt.inserthere(28);
		bt.inserthere(23);
		
		//bt.inorder(bt.root);
		//bt.delete(25);
		//bt.inorder(bt.root);
		
		ArrayList<LinkedList<Node>> node = bt.createLL(bt.root);
		System.out.println(node.size());
	}

	//minimal height binary search tree
	public static void minimalHeightTree(int[] arr)
	{
		int midpoint = arr.length/2;
		
		BinaryTree bt = new BinaryTree();
		bt.insert(arr[midpoint]);
		
		for(int i=0; i< midpoint; i++)
		{
			bt.insert(arr[i]);
		}
		for(int j= midpoint+1 ; j<arr.length;j++)
		{
			bt.insert(arr[j]);
		}
		bt.inorder(bt.root);
	}
}
