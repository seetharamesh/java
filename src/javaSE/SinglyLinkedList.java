package javaSE;

public class SinglyLinkedList{
	
	private static class Node { //inner class and it will be accessed only by SinglyLinkedClass.
		//data, next node to point to
		private int data;
		private Node next;
		
		//constructor
		
		private Node(int data, Node next){
			this.data = data;
			this.next = next;
		}
		
		//constructor
		private Node(int data){
			this(data,null); //will call the above constructor with "null" node
		}
		
		//to print the linked list
		public String toString() {
			return Integer.toString(data);
		}		
	}//end of Node class
	
	//add a node to FRONT of the linked list
	private Node head; 
	public void addToFront(int data) {
		//It's very important to follow these 3 steps when adding a node to the front of the linked list
		Node newNode = new Node(data);//1. newNode is instantiated with data and next
		newNode.next = head; //2. newNode's next should point to head
		head = newNode; //3. the head should point to newNode.
	}
	
	//to print the linked list iterating through each node
	public String toString() {
		String answer = "";
		Node current = head;
		while(current != null) {
			answer += current + " ";
			current = current.next;		
		}
		return answer;	
	}
	
	//add a node to BACK of the linked list
	public void addToBack(int data) {
		if(head == null){//meaning list is empty
			head = new Node(data);
		}
		else {
		Node current = head;
		while(current.next != null) {			
			current = current.next;
		}
		current.next = new Node(data);
		}
	}
	
	//REMOVE node from front of the list. Edge case when list is empty. Secondly when there's only one node in the list
	public void removeFromFront() {
			if(head == null)return;
			else if(head.next == null) {
				head = null;
			}
			else {
			head = head.next;
			}
	}
	
	//REMOVE node from back of the list. Edge cases are  - when list is empty, and secondly when there is only one node in the list
	public void removeFromBack() {
		if(head == null) {
			return ;
		}
		else if(head.next == null) {
			head = null;
		}
		else {
			Node current = head;
			while (current.next.next != null) {
				current.next = head;
			}
			current.next = null;
		}		
	}
	
}//end of SinglyLinkedList class



//Note the below code is for generic singly linked list class that's applicable to any datatype. 
/*
 
 public class GenericSinglyLinkedList<T> {
	
	private static class Node<T>{
		private T data;
		private Node<T> next;
		
	private Node(T data, Node <T> next) {
		this.data = data;
		this.next = next;
	}
	
	private Node(T data) {
		this(data,null);
	}
	}
}//end of generic class
**/

/* Iterable linked lists
 * 
 import java.util.Iterator;
 public class LinkedList<T> implements Iterable{
 
 private class LLIterator implements Iterator<T> {
 	private Node<T> curr;
 	LLIterator(){
 		curr = head;
 }
 
 public boolean hasNext(){
 return curr != null;
 }
 
 public T next(){
 	if(hasNext()){
 		T temp = curr.data;
 		curr = curr.next;
 		return temp;
 		}
 	return null;
 	}
 }
 
 public Iterator<T> iterator(){
 return new LLIterator<>();
 }
 
 
 
 }
 
 * */
