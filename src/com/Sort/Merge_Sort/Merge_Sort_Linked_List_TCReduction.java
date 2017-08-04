package com.Sort.Merge_Sort;

public class Merge_Sort_Linked_List_TCReduction {

	private Object head;

	public static void main(String[] args) {
		
		
		Merge_Sort_Linked_List_TCReduction li = new Merge_Sort_Linked_List_TCReduction();
	     /*
	      * Let us create a unsorted linked lists to test the functions Created
	      * lists shall be a: 2->3->20->5->10->15
	      */
	     li.push(15);
	     li.push(10);
	     li.push(5);
	     li.push(20);
	     li.push(3);
	     li.push(2);
	     System.out.println("Linked List without sorting is :");
	     li.printList(li.head);

	     // Apply merge Sort
	     li.head = li.mergeSort(li.head);
	     System.out.print("\n Sorted Linked List is: \n");
	     li.printList(li.head);

	}

	private Object mergeSort(Object head2) {
		// TODO Auto-generated method stub
		return null;
	}

	private void printList(Object head2) {
		// TODO Auto-generated method stub
		
	}

	private void push(int i) {
		// TODO Auto-generated method stub
		
	}

}




//Java program to illustrate merge sorted
//of linkedList


