package datastructure.linkedlist;

public class MyLinkedList {
	
	private Node head;
	private int size;
	
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public MyLinkedList()
	{
		head = null;
		size = 0;
	}
	public void addNode(int data)
	{
		if(head == null)
		{
			head = new Node(data);
			
		}
		else
		{
			//Create new node to be inserted at end
			Node newnode = new Node(data);
			//store head node in temporary node
			Node currentnode = head;
			//traverse till end of linked list
			while(currentnode.getNxt() != null)
			{
				currentnode = currentnode.getNxt();
			}
			//when reached at end insert new node
			 currentnode.setNxt(newnode);
				
		}
		size++;

		// System.out.println(size);
		}
	
	public void removeNode(int index)
	{
		Node currentNode = head;
		for(int i=0 ; i<index-1 ;i++)
		{
			if(currentNode.getNxt()!= null)
			{
				currentNode = currentNode.getNxt();
			}			
		}
		currentNode.setNxt(currentNode.getNxt().getNxt());
		size--;
	}
	
	public void printList()
	{
		Node currentNode = head;
		for(int i=0 ; i<=size ;i++)
		{
			if(currentNode!= null)
			{
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNxt();
			}			
		}
	}

	public void removeDuplicates()
	{
		Node current = head;
		Node runner =head;
		while(runner.getNxt()!=null)
		{
			if(runner.getNxt().getData()==current.getData())
			{
				runner.setNxt(runner.getNxt().getNxt());
			}
			else
				runner = runner.getNxt();
		}
	}
	
	public void deleteInBetween(Node a){
		Node current = a;
		Node runner = head;
		Node previous = null;
		while(runner.getData()!=current.getData())
		{
			previous = runner;
			runner = runner.getNxt();			
		}
		previous.setNxt(previous.getNxt().getNxt());
		
		Node currentNode = head;
		for(int i=0 ; i<=size ;i++)
		{
			if(currentNode!= null)
			{
				System.out.println(currentNode.getData());
				currentNode = currentNode.getNxt();
			}			
		}
	}

	public void delete(Node b)
	{
		Node a = b;
		if(a!= null)
		{
			Node c = a.getNxt();
			a.setNxt(a.getNxt());
			a.setData(c.getData());
			
		}
	}
	
	
}
