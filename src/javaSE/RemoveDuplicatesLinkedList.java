package javaSE;

import java.util.LinkedList;


public class RemoveDuplicatesLinkedList {
	
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
	        System.out.println("The linked list looks like this now: ");  
	        while(current != null) {  
	            //Prints each node by incrementing pointer  
	            System.out.print(current.value + " ");  
	            current = current.next;  
	        }  
	        System.out.println();  
	    }
	 
	 public void removeNode(int value) {
		 if(head == null) return;
		 Node current = head;
		 boolean removedFlag = false;
		 while(current.next != null) {
			 if(current == head && current.value == value) {
				 head = current.next;
				 current = current.next;
				 removedFlag = true;
			 }
			 else if(current.next.value == value){
				 current.next = current.next.next;
				 removedFlag = true;
			 }
			 else current = current.next;
		 }
		 if(!removedFlag) System.out.println("The node is not found to be removed from the list");	 
	 }
	 
	 public void removeDuplicates() {
		 Node current = head, index = null, temp = null;
		  
	        if (head == null) {
	            return;
	        }
	        else {
	            while (current != null) {
	                // temp node points to the previous node
	                temp = current;
	                // index node points to node next to current
	                index = current.next;
	  
	                while (index != null) {
	                    // checking if node of current data is
	                    // equal to index node data
	                    if (current.value == index.value) {
	  
	                        // duplicate node is skipped
	                        temp.next = index.next;
	                    }
	                    else {
	                        // temp node points to the previous
	                        // node of index node
	                        temp = index;
	                    }
	                    index = index.next;
	                }
	                current = current.next;
	            }
	        }
	 }
	 
	public static void main(String[] args) {
		RemoveDuplicatesLinkedList cl = new RemoveDuplicatesLinkedList();
		cl.addNodeToFront(1);
		cl.display();
		cl.addNodeToFront(1);
		cl.display();
		cl.addNodeToFront(3);
		cl.display();
		cl.addNodeToFront(4);
		cl.display();
		cl.addNodeToFront(5);
		cl.display();
	
		//call removeDuplicates method
		System.out.println("Removing duplicates using removeDuplicates method");
		cl.removeDuplicates();
		cl.display();
		
		System.out.println("Removing node 3 from the list using removeNode method");
		cl.removeNode(3);
		cl.display();
		
	}

}
