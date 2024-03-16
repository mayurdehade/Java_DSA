//Structure of linked list 
//Blueprint
//addFirst and addLast to linked list
package part1;

public class LinkedList {
	
	public class Node {
		//data
		int data;
		//reference variable
		Node next; 
		
		//constructor
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//head and tail is reference variables of Node class
	public static Node head;
	public static Node tail;
	
	//add new element to first of the linked list
	public void addFirst(int data) {
		//step1 - create new node
		Node newNode = new Node(data);

		//if linked list is empty
		if(head == null) {
			head = tail = newNode; //head and tail is single element
			return;
		}
		
		//step2 - newNode next = head
		newNode.next = head; //link
		
		//stpe3 - head = newNode
		head = newNode;
	}
	
	//add last
	public void addLast(int data) {
		//step1 - create new node
		Node newNode = new Node(data);
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		//step2 - tail of next = newNode
		tail.next = newNode;
		
		//step3 = tail = newNode
		tail = newNode;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();

		ll.addFirst(1);
		ll.addFirst(2);
		ll.addLast(3);
	}

}
