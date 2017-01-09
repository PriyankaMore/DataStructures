import java.util.ArrayList;
import java.util.LinkedList;

public class BinaryTree {

	Node root;
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinaryTree()
	{
		this.root = null;
	}
		
	public Node search(Node root, int data)
	{
	    // Base Cases: root is null or key is present at root
	    if (root==null || root.data==data)
	        return root;
	 
	    // val is greater than root's key
	    if (root.data > data)
	        return search(root.left, data);
	 
	    // val is less than root's key
	    return search(root.right, data);
	}
	
	public boolean Search(int data)
	{
		Node current = root;
		//while(current != null)
		{
			if(current.data == data)
			{
				return true;
			}
			else if(current.data>data)
			{
				current = current.left;
			}
			else
				current = current.right;
		}
		return false;
	}
	
	public void insert(int data)
	{
		Node newNode = new Node(data);
		Node current = root;
		
		if(current == null)
		{
			root = newNode;			
		}
		else
		{
			Node parent = null;
			while(true)
			{
				parent = current;
				if(data <current.data)
				{
					current = current.left;
					if(current == null)
					{
						parent.left = newNode;
						return;
					}
				}
				else if(data > current.data)
				{
					current = current.right;
					if(current == null)
					{
						parent.right = newNode;
						return;
					}
				}
			}
			
		}
		
	}

	public void inserthere(int key) {
	       root = insert(root,key);
	}
	
	//Using recursive method
	public Node insert(Node root, int data)
	{
		if(root == null)
		{
			root = new Node(data);
			return root;
		}
		if(data< root.data)
		{
			root.left = insert(root.left,data);			
			
		}
		else if(data > root.data)
		{
			root.right = insert(root.right,data);
			
		}
		return root;
	}
	
	public Node getSuccessor(Node deleleNode){
		Node successsor =null;
		Node successsorParent =null;
		Node current = deleleNode.right;
		while(current!=null){
			successsorParent = successsor;
			successsor = current;
			current = current.left;
		}
		
		if(successsor!=deleleNode.right){
			successsorParent.left = successsor.right;
			successsor.right = deleleNode.right;
		}
		return successsor;
	}
	
	public void deleteNode(int data)
	{
		Node current = search(root, data);
		Node successor = getSuccessor(current);
		
		//case 1 : current is root itself, no leaf nodes
		if(current.left == null && current.right == null)
		{
			current = null;
		}
		if(current.right != null)
		{
			
		}
		
		
	}
	public boolean delete(int id){
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while(current.data!=id){
			parent = current;
			if(current.data>id){
				isLeftChild = true;
				current = current.left;
			}else{
				isLeftChild = false;
				current = current.right;
			}
			if(current ==null){
				return false;
			}
		}
		
		//Case 1: if node to be deleted has no children
		if(current.left==null && current.right==null){
			if(current==root){
				root = null;
			}
			if(isLeftChild ==true){
				parent.left = null;
			}else{
				parent.right = null;
			}
		}
		//Case 2 : if node to be deleted has only one child
		else if(current.right==null){
			if(current==root){
				root = current.left;
			}else if(isLeftChild){
				parent.left = current.left;
			}else{
				parent.right = current.left;
			}
		}
		else if(current.left==null){
			if(current==root){
				root = current.right;
			}else if(isLeftChild){
				parent.left = current.right;
			}else{
				parent.right = current.right;
			}
		}else if(current.left!=null && current.right!=null){
			
			//find the minimum element in the right sub tree
			Node successor	 = getSuccessor(current);
			if(current==root){
				root = successor;
			}else if(isLeftChild){
				parent.left = successor;
			}else{
				parent.right = successor;
			}			
			successor.left = current.left;
		}		
		return true;		
	}

	public ArrayList<LinkedList<Node>> createLL(Node root)
	{
		ArrayList<LinkedList<Node>> arrll = new ArrayList<LinkedList<Node>>();
		Node current = root;
		LinkedList<Node> ll = new LinkedList<Node>();
		if(current != null)
		{			
			ll.add(current);
		}
		while(ll.size()>0)
		{
		arrll.add(ll);
		LinkedList<Node> parents = ll;
		ll = new LinkedList<Node>();
		for(Node parent : parents)
		{
			if(parent.left!=null)
			ll.add(parent.left);
			if(parent.right!=null)
				ll.add(parent.right);			
		}		
		}
		return arrll;		
	}

	public void inorder(Node root) {
		 
	        if (root != null) {
	            inorder(root.left);
	            System.out.println(root.data);
	            inorder(root.right);
	        }
	    }
}
