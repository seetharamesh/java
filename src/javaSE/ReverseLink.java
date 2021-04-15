package javaSE;

import java.util.LinkedList;


public class ReverseLink<T> { 
	
	Node head;
	Node tail;
	
	 private static class Node {
		  private int value;
		  private Node next;
		  private Node prev;
		  
		  private Node(int value){ 
		    this.value = value;
		    this.next = null;
		    this.prev = null;
		  }
		
		}//end of Node class
	 
	 // and add node to the linked list
	 public void addNodeToFront(int value) { 
		 Node newNode = new Node(value);
		 newNode.next = head;
		 head = newNode;
		 
		 if(newNode.next == null) {
		 tail = newNode;
		 }
	 }
	 
	 //add Node to back of the list
	 public void addNodeToBack(int value) {
		 Node newNode = new Node(value);
		 if(tail == null) {
			 head = newNode;
		 }else {
		 tail.next = newNode;
		 }
		 tail = newNode;
		 }
		 	 
	 
	 public void display() {
		 Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        System.out.println("Adding nodes to the list: ");  
	        while(current != null) {  
	            //Prints each node by incrementing pointer  
	            System.out.print(current.value + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	    }  
	 //writing it as seperate method for practice sake. It can be added to addNodeToFront also
	 public int getCount() {
		 int count = 0;
		 Node current = head;
		 while(current != null) {
			 count++;
			 current = current.next;
		 }
		 return count;
	 }
	 
	 public void reverseLink() {
		 //yet to complete
		 
	 }
	 
	public static void main(String[] args) {
		ReverseLink cl = new ReverseLink();
		
		cl.addNodeToFront(1);
		cl.display();
		cl.addNodeToFront(1);
		cl.display();
		cl.addNodeToFront(3);
		cl.display();
		cl.addNodeToFront(4);
		cl.display();
		cl.addNodeToBack(6);
		cl.display();
		cl.addNodeToBack(7);
		cl.display();
		cl.addNodeToFront(8);
		cl.display();
		System.out.println("Size of the linkedlist is: " + cl.getCount());
		
		
		
	}

}
