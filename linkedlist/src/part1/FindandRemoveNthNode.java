//Find and remove nth node from end
package part1;

public class FindandRemoveNthNode {
	
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
	
	///////////////////////////////////////////
	
	//Find and Remove Nth node from end
	public void deleteNthfromEnd(int n) {
		//calculate size
		int size=0;
		Node temp = head;
		while(temp!=null) {
			temp = temp.next;
			size++;
		}
		
		if(n == size) {
			head = head.next; //remove first
			return;
		}
		
		//size-n
		int i=1;
		int iToFind = size - n;
		Node prev = head;
		//find prev node
		while(i < iToFind) {
			prev = prev.next;
			i++;
		}
		
		//change next value
		prev.next = prev.next.next;
		return;
	}
	

	public static void main(String[] args) {
		FindandRemoveNthNode ll = new FindandRemoveNthNode();
		
		ll.addFirst(2);
		ll.addFirst(1);;
		ll.addLast(3);
		ll.addLast(4);
		ll.addFirst(5);
		ll.addLast(8);
		ll.print();
		
		ll.deleteNthfromEnd(3);
		ll.print();

	}

}
