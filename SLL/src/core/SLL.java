package core;

public class SLL {
	private Node head;
	private int count=0;
	public SLL() {
		super();
		this.head = null;
	}

	public static class Node {
		int data;
		Node next;
		Node prev;

		public Node(int data) {
			super();
			this.data = data;
			this.next = null;
			this.prev = null;
		}

	}

	public void display() {
		Node trav = head;
		while (trav != null) {
			System.out.print(trav.data + "->");
			trav = trav.next;
		}
	}

	public void addAtFirst(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			node.next=head;
			head=node;
		}
	}

	public void addAtLast(int data) {

		Node newNode = new Node(data);
		Node trav=head;
		if (head == null) {
			head = newNode;
		}
		while (trav.next!=null)
		{
			trav=trav.next;
		}
		trav.next=newNode;
		newNode.next=null;
	}

	public int countNodes()
	{
		Node trav=head;
		while(trav!=null)
		{
			count++;
			trav=trav.next;
		}
		return count;
	}

	public void addAtMid(int data, int pos) {

		Node newNode = new Node(data);
		Node trav = head;
		if(pos>countNodes()) {
			addAtLast(data);
		}
		else if (head == null || pos<=1) {
			addAtFirst(data);
		}
		else
		{
			for(int i=1;i<pos;i++) {
				trav = trav.next;
			}
			newNode.next=trav.next;
			trav.next=newNode;
		}

	}

	public int delAtFirst() {
		if (head == null)
			throw new RuntimeException("linkedList is Empty");
		else {
			int element = head.data;
			head = head.next;
			return element;
		}
	}

	public int delAtLast() {

		if (head == null)
			throw new RuntimeException("linkedList is Empty");
		else {
			Node trav=head;
			Node temp = null;
				while (trav.next!=null)
				{
					temp=trav;
					trav=trav.next;
				}
				int element= trav.data;
				temp.next=null;
				return element;
		}
	}

	public int delAtMid(int pos) {
		Node trav = head;
		Node temp = null;

		for(int i=1;i<pos;i++)
		{
			temp=trav;
			trav=trav.next;
		}
		int element=trav.data;
		temp.next=trav.next;
		return element;
		
	}

	public void delAll() {
		head = null;
	}

}
