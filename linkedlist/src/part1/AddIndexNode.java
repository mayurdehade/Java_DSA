//Add node in linked list at given index
package part1;

public class AddIndexNode {
	
	public class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static Node head;
	public static Node tail;
	//size of linked list
	public static int size=0;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		//increment size
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
		//increment size 
		size++;
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		tail.next = newNode;
		tail = newNode;
	}
	
	public void print() {
		if(head == null) {
			
			return;
		}
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"=>");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	//add node at given index
	public void add(int idx, int data) {
		//create new node
		Node newNode = new Node(data);
		
		//create temp Node
		Node temp = head;
		int i=0;
		while(i<idx-1) {
			temp = temp.next;
			i++;
		}
		//increment size 
		size++;
		
		//i = idx-1, temp -> prev
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	
	public static void main(String[] args) {
		AddIndexNode ll = new AddIndexNode();
		ll.addFirst(2);
		ll.addFirst(1);
		ll.addLast(3);
		ll.addLast(4);
		
		ll.print();
		ll.add(2, 5);
		ll.print();
		System.out.println(ll.size);
	}

}
