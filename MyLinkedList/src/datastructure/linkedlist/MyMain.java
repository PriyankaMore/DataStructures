package datastructure.linkedlist;

public class MyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MyLinkedList linklist =  new MyLinkedList();
		 linklist.addNode(2);
		 linklist.addNode(1);
		 linklist.addNode(6);
		 linklist.printList();
		 //linklist.addNode("40");
		// linklist.addNode("10");	 
		 System.out.println("Printing Linked list");
		 MyLinkedList linklist2 = new MyLinkedList();
		 linklist2.addNode(4);
		 linklist2.addNode(9);
		 linklist2.addNode(2);
		 linklist2.printList();
		 
		 MyLinkedList sum = new MyLinkedList();
		 sum = sum(new Node(5), new Node(9));
		 System.out.println("Printing Linked list");
		 sum.printList();
		// linklist.deleteInBetween(new Node("30"));
		 //linklist.delete(new Node ("30"));
		 linklist.removeDuplicates();
		 //System.out.println("After duplicate removal");
		 //linklist.printList();
		 //linklist.removeNode(2);
		// System.out.println("FOr deletion");
		// linklist.printList();
	}

	public static MyLinkedList sum(Node a, Node b)
	{
		MyLinkedList d= new MyLinkedList();
		int carry =0;
		for(int i=0; i<1; i++)
		{
			int sum = a.getData()+ b.getData()+carry;
			if(sum>10)
			{				
				d.addNode(sum%10);
				carry = 1;
			}else
			{
				d.addNode(sum);
				carry = 0;
			}
			a=a.getNxt();
			b=b.getNxt();
		}
		
		return d;
	}

}
