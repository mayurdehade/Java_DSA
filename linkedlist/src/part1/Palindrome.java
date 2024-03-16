//Check if Linked List is Palindrome
package part1;

import part1.ReverseLinkedList.Node;

public class Palindrome {
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
	
	//find middle
	//slow fast approach
	public Node findMid(Node head) {
		Node slow = head; 
		Node fast = head; 
		
		while(fast != null && fast.next != null) {
			slow = slow.next; //+1
			fast = fast.next.next; //+2
		}
		
		return slow; //slow is my mid node
	}
	
	public boolean checkPalindrome() {
		if(head == null || head.next == null) {
			return true;
		}
		
		//step1 - find mid
		Node midNode = findMid(head);
		
		//step2 - reverse 2nd half 
		Node prev = null;
		Node curr = midNode;
		Node next;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
		Node right = prev; //right half head
		Node left = head; //left half head
		
		while(right != null) {
			if(left.data != right.data) {
				return false;
			}
			left = left.next;
			right = right.next;
		}
		return true;
	}

	public static void main(String[] args) {
		Palindrome ll = new Palindrome();
		
		ll.addFirst(2);
		ll.addFirst(1);;
		ll.addLast(2);
		ll.addLast(1);
//		ll.addLast(2);
		ll.print();
		
		System.out.println(ll.checkPalindrome());

	}

}
