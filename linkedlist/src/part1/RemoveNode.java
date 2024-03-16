//Remove node in linked list
package part1;

import part1.PrintLinkedList.Node;

public class RemoveNode {
	
	public class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static Node head;
	public static Node tail;
	//size
	public static int size;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		size++;
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	//print linked list
	public void print() {
		if(head == null) {
			System.out.println("Linked List is empty!");
			return;
		}
		//create new node which hold head value
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ==> ");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	
	//RemoveFirst node
	public int removeFirst() {
		if(head == null) {
			System.out.println("Linked List is empty");
			return Integer.MAX_VALUE;
		} else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size=0;
			return val;
		}
		int val = head.data;
		head = head.next;
		size--;
		return val;
	}
	
	//RemoveLast node
	public int removeLast() {
		if(head == null) {
			System.out.println("Linked List is empty");
			return Integer.MIN_VALUE;
		} else if(size == 1) {
			int val = head.data;
			head = tail = null;
			size = 0;
			return val;
		}
		
		int val = tail.data;
		
		Node prev = head;
		for(int i=0; i<size-2; i++) {
			prev = prev.next;
		}
		
		prev.next = null;
		tail = prev;
		size--;
		return val;
		
	}

	public static void main(String[] args) {
		RemoveNode ll = new RemoveNode();
		
		//if we remove any node from linked list then java garbage collector
		//automatically remove that object from memory
		ll.addFirst(2);
		ll.addFirst(1);;
		ll.addLast(3);
		ll.addLast(4);
		ll.addFirst(5);
		ll.addLast(8);
		ll.print();
		System.out.println(ll.size);
		System.out.println("Removed Node: "+ll.removeFirst());
		ll.print();
		System.out.println("Removed Node: "+ll.removeLast());
		ll.print();
		System.out.println(ll.size);

	}

}
