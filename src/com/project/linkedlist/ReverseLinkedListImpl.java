/**
 * 
 */
package com.project.linkedlist;


/**
 * @author Trident MT581
 *
 */

class Node
{
	int data;
	
	Node next;
	
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	
	public static Node reverseNodes(Node head)
	{
		int count =1;
		
		Node prev = null;
		Node current = head;
		Node next = null;
		
		
		
		 if(head !=null)
		 {
			 System.out.println("last element"+head.data);
			 
			 while(current!=null)
			 {
				 next = current.next;
				 current.next = prev;
				 prev = current;
				 
				 current = next;
				 
			 }
		 }
		 head = prev;
		 return head;
		 
	}
	
	
	static void printNode(Node node)
	{
		int rem =0;
		while(node!=null)
		{
		System.out.println(node.data);
		node = node.next; //

		}
	
	}
}
public class ReverseLinkedListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args)
    {
		
         //create a data into Node 
		Node  head = new Node(-5);
		Node  nodeB= new Node(4);
		Node  nodeC = new Node(3);
		Node  nodeD = new Node(2);
		Node  last = new Node(1);
		Node lastNull = null;
		
		
		//set node connection
	    head.next  = nodeB;
	    nodeB.next = nodeC;
	    nodeC.next = nodeD;
	    nodeD.next = last;
	    
	    
	   Node n= Node.reverseNodes(head);
	    
	    Node.printNode(n);
	    
	    
	    
	}

}
