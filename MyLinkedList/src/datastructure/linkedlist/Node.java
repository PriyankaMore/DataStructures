package datastructure.linkedlist;

public class Node {
	
	private int data;
	private Node nxt;
	public Node(int data) {
		this.data = data;
		this.nxt = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getNxt() {
		return nxt;
	}
	public void setNxt(Node nxt) {
		this.nxt = nxt;
	}

}
