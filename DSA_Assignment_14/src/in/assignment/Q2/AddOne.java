package in.assignment.Q2;

import java.util.*;

class Node {
	int data;
	Node next;
	
	Node(int d) {
		data = d;
		next = null;
	}
}

class AddOne
{

	static Node push(Node head_ref, int new_data)
	{
		
		/* allocate node */
		Node new_node = new Node(new_data);
	
		/* link the old list of the new node */
		new_node.next = head_ref;
	
		/* move the head to point to the new node */
		head_ref = new_node;
		return head_ref;
	}
	
	static void printList(Node n) {
		while (n != null) {
		System.out.print(n.data + " ");
		n = n.next;
		}
		System.out.println();
	}

	static Node addTwoLists(Node first) {
		int num1 = 0;
		
		// get the number.
		while (first.next != null) {
		num1 += first.data;
		num1 *= 10;
		first = first.next;
		}
		num1 += first.data;
		
		// add one to it.
		int num2 = num1 + 1;
		Node temp = null;
		
		// Node* result=temp;
		// made the linked list form it.
		while (num2 != 0) {
		int last = num2 % 10;
		temp = push(temp, last);
		num2 = num2 / 10;
		}
		
		// return the list
		return temp;
	}

	public static void main(String[] args) {
		Node first = null;
		first = push(first, 6);
		first = push(first, 4);
		first = push(first, 9);
		first = push(first, 5);
		first = push(first, 7);
		System.out.print("before adding 1 the linked list is  : ");
		printList(first);

		Node ans = addTwoLists(first);
		System.out.print("hence after adding 1 the linked list is  : ");
		printList(ans);
		
	}
}

//This code is contributed by Utkarsh.
