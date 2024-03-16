//Search in linked list (recursive)
package part1;

import part1.SearchInLinkedList.Node;

public class RecursiveSearch {

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
	
	////////////////////////////////////////////////////////////////////
	
	//Search in linked list (recursive)
	
	public int helper(Node head, int key) {
		//if head is null then linked list is empty
		//or end then return -1 key not found
		if(head == null) {
			return -1;
		}
		
		if(head.data == key) {
			return 0;
			//if key found the return 0 (head index is zero)
		}
		
		//store the returned index in idx 
		//Recursively call helper with new head (next node of head)
		int idx = helper(head.next, key);
		if(idx == -1) {
			//if returned index is -1 then return as it is
			return -1;
		}
		
		//add 1 in index for each recursive call
		return idx+1;
	}
	
	
	public int recSearch(int key) {
		//call helper function with head and key
		return helper(head, key);
	}
	
	
	public static void main(String[] args) {
		RecursiveSearch ll = new RecursiveSearch();
		
		ll.addFirst(2);
		ll.addFirst(1);;
		ll.addLast(3);
		ll.addLast(4);
		ll.addFirst(5);
		ll.addLast(8);
		ll.print();
		System.out.println(ll.len);
		
		System.out.println(ll.recSearch(10));
		System.out.println(ll.recSearch(5));
		System.out.println(ll.recSearch(3));

	}

}
