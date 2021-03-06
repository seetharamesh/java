package javaSE;

import java.util.LinkedList;


public class CreateLinkedList<T> { 
	
	Node head;
	
	 private static class Node {
		  private int value;
		  private Node next;
		  
		  private Node(int value){ 
		    this.value = value;
		    this.next = null;
		  }
		  //the below is only required if we change the above single argument constructor method body as: this(value,null);
		  private Node(int value, Node next){
		    this.value = value;
		    this.next = next;
		  }
		
		}//end of Node class
	 
	 // and add node to the linked list
	 public void addNodeToFront(int value) {
		 Node newNode = new Node(value);
		 newNode.next = head;
		 head = newNode;
	 }
	 
	 //add Node to back of the list
	 public void addNodeToBack(int value) {
		 Node newNode = new Node(value);
		 if(head == null) {
			 newNode.next = head;
			 head = newNode;
		 }
		 else {
		 Node current = head;
		 while(current.next != null) {
			 current = current.next;
		 }
		current.next = newNode;
		newNode.next = null;
		}
		 }		 
	 
	 public void display() {
		 Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        System.out.println("Adding nodes to the start of the list: ");  
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
	 
	 //get a specific node from the linked list based on the user index specification
	 public int getSpecificNode(int index) {
		 //The below commented code is correct if we don't use assert. If assert is used then we don't need to check these conditions manually
//		 int sizeOfList = this.getCount();
//		 
//		 if(index >= sizeOfList) return -1; //size of linkedlist is less than index
//		 if(index < 0) return -1;
//		 
//		 if(head == null) return 0; //list is empty
//		 
		 Node current = head;
		 int count = 0;
//		 while(current.next != null) {
		 while(current != null) {
			 if(count == index) return current.value;
			current = current.next;
			count++;
		 }
		 //reached end of list
		 //if(index == count) return current.value;
		 assert(false); //by using assert of false it will return 0 to all invalid options
		 return 0; //not found
	 }
	 
	 
	public static void main(String[] args) {
		CreateLinkedList cl = new CreateLinkedList();
		
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
		
		System.out.println("Size of the linkedlist is: " + cl.getCount());
		
		int index = cl.getSpecificNode(0);
		System.out.println(index);
		
		
	}

}
