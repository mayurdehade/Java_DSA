//program to print linked list
package basic;

public class PrintLinkedList {
	
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
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		
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

	public static void main(String[] args) {
		PrintLinkedList ll = new PrintLinkedList();
		ll.print();
		ll.addFirst(2);
		ll.print();
		ll.addFirst(1);
		ll.print();
		ll.addLast(3);
		ll.print();
		ll.addLast(4);
		ll.print();
		ll.addFirst(5);
		ll.print();
		ll.addLast(8);
		ll.print();

	}

}
