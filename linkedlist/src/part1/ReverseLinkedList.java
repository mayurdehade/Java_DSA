//Reverse Linked List (Iterative)
package part1;

public class ReverseLinkedList {

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
	public static int len;
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		len++;
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		len++;
		
		if(head == null) {
			head = tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("Linked List is empty");
			return;
		}
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+"=>");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}
	
	public int removeFirst() {
		if(head == null) {
			System.out.println("Linked list is empty");
			return -1;
		} else if(len == 1) {
			int val = head.data;
			head = tail = null;
			len=0;
			return val;
		}
		
		int val = head.data;
		head = head.next;
		len--;
		return val;
	}
	
	
	public int removeLast() {
		if(head == null) {
			System.out.println("Linked list is empty");
			return -1;
		} else if(len == 1) {
			int val = head.data;
			head = tail = null;
			len = 0;
			return val;
		}
		
		int val = tail.data;
		Node prev = head;
		for(int i=0; i<len-2; i++) {
			prev = prev.next;
		}
		
		prev.next = null;
		tail = prev;
		len--;
		return val;
	
	}
	
	////////////////////////////////////////////////////
	
	//Reverse Linked List
	public void reverse() {
		//in starting prev is null
		Node prev = null;
		//start from head and make tail as head
		Node curr = tail = head;
		Node next;
		
		while(curr!=null) {
			//assign next node as current's next
			next = curr.next;
			//update curr.next as prev for reverse
			curr.next = prev;
			//change curr is prev
			prev = curr;
			//and next is new curr
			curr = next;
		}
		
		//make head as prev because curr is null
		head = prev;
		
	}
	
	public static void main(String[] args) {
		ReverseLinkedList ll = new ReverseLinkedList();
	
		
		ll.addFirst(2);
		ll.addFirst(1);;
		ll.addLast(3);
		ll.addLast(4);
		ll.addFirst(5);
		ll.addLast(8);
		ll.print();
		
		ll.reverse();
		
		ll.print();

	}
  
}
