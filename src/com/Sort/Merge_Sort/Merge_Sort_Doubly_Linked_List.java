package com.Sort.Merge_Sort;

public class Merge_Sort_Doubly_Linked_List {

	 static Node head;  // head of list

	 /* Node Class */
	 static class Node {

	     int data;
	     Node next, prev;

	     // Constructor to create a new node
	     Node(int d) {
	         data = d;
	         next = prev = null;
	     }
	 }

	 void print(Node node) {
	     Node temp = node;
	     System.out.println("Forward Traversal using next pointer");
	     while (node != null) {
	         System.out.print(node.data + " ");
	         temp = node;
	         node = node.next;
	     }
	     System.out.println("\nBackward Traversal using prev pointer");
	     while (temp != null) {
	         System.out.print(temp.data + " ");
	         temp = temp.prev;
	     }
	 }

	 // Split a doubly linked list (DLL) into 2 DLLs of
	 // half sizes
	 Node split(Node head) {
	     Node fast = head, slow = head;
	     while (fast.next != null && fast.next.next != null) {
	         fast = fast.next.next;
	         slow = slow.next;
	     }
	     Node temp = slow.next;
	     slow.next = null;
	     return temp;
	 }

	 Node mergeSort(Node node) {
	     if (node == null || node.next == null) {
	         return node;
	     }
	     Node second = split(node);

	     // Recur for left and right halves
	     node = mergeSort(node);
	     second = mergeSort(second);

	     // Merge the two sorted halves
	     return merge(node, second);
	 }

	 // Function to merge two linked lists
	 Node merge(Node first, Node second) {
	     // If first linked list is empty
	     if (first == null) {
	         return second;
	     }

	     // If second linked list is empty
	     if (second == null) {
	         return first;
	     }

	     // Pick the smaller value
	     if (first.data < second.data) {
	         first.next = merge(first.next, second);
	         first.next.prev = first;
	         first.prev = null;
	         return first;
	     } else {
	         second.next = merge(first, second.next);
	         second.next.prev = second;
	         second.prev = null;
	         return second;
	     }
	 }

	 // Driver program to test above functions
	 public static void main(String[] args) {

		 Merge_Sort_Doubly_Linked_List list = new Merge_Sort_Doubly_Linked_List();
	     Merge_Sort_Doubly_Linked_List.head = new Node(10);
	     Merge_Sort_Doubly_Linked_List.head.next = new Node(30);
	     Merge_Sort_Doubly_Linked_List.head.next.next = new Node(3);
	     Merge_Sort_Doubly_Linked_List.head.next.next.next = new Node(4);
	     Merge_Sort_Doubly_Linked_List.head.next.next.next.next = new Node(20);
	     Merge_Sort_Doubly_Linked_List.head.next.next.next.next.next = new Node(5);
	      
	      
	     Node node = null;
	     node = list.mergeSort(head);
	     System.out.println("Linked list after sorting :");
	     list.print(node);

	 }

}






