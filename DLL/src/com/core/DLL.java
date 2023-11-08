package com.core;

public class DLL {
	private Node head;
	private Node tail;

	public DLL() {
		super();
		this.head = null;
		this.tail = null;
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
			tail = node;
		} else {
			head.prev = node;
			node.next = head;
			head = node;
		}
	}

	public void addAtLast(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		tail.next = null;
	}

	public void addAtMid(int data, int pos) {

		Node newNode = new Node(data);
		Node trav = head;
		if (head == null) {
			head = newNode;
		}
		for (int i = 0; i < pos; i++)
			trav = trav.next;
		newNode.next = trav.next;
		trav.next = newNode;
		newNode.prev = trav;
		trav.next.prev = newNode;
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
			int element = tail.data;
			tail = tail.prev;
			tail.next = null;
			return element;
		}
	}

	public int delAtMid(int val) {
		Node trav = head;
		Node temp = null;
		while(trav.data!=val)
		{
			temp=temp.next;
			trav=trav.next;
		}
		int value=trav.data;
		temp.next=trav.next;
		trav.next.prev=trav.prev;
		
		return value;
		
	}

	public void delAll() {
		head = null;
	}

}
