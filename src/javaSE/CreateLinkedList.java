package javaSE;

import java.util.LinkedList;


public class CreateLinkedList {
	
	Node head;
	
	 private static class Node {
		  private int value;
		  private Node next;
		  
		  private Node(int value){ 
		    this.value = value;
		    this.next = null;
		  }
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
	 
	public static void main(String[] args) {
		CreateLinkedList cl = new CreateLinkedList();
		cl.addNodeToFront(1);
		cl.display();
		cl.addNodeToFront(2);
		cl.display();
		cl.addNodeToFront(3);
		cl.display();
		cl.addNodeToFront(4);
		cl.display();
		
	}

}
