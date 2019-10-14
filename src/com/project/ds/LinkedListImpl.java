/**
 * 
 */
package com.project.ds;

/**
 * @author Emmanuel Raj
 *
 */

 class Node
{
	/**
	 * inside the node we have 
	 * data,
	 * 
	 */
	int data;
	Node next;
	
	
	//constructor
	public Node(int data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	
	//let us say we have to count Node
		public static int countNodes(Node head)
		{
			int count =1;
			//write your logic
			if(head!= null)
			{
			
				Node current = head;
				
				while(current.next!=null)
				{
					current =current.next;
					count+=1;
				}
			}
			return count;
			
		}
	
}

public class LinkedListImpl   
{
	
	public static void main(String[] args)
	{
	
		//assign node data by creating obj and set the value
		Node  head = new Node(6);
		Node  nodeB = new Node(3);
		Node  nodeC = new Node(4);
		Node  nodeD = new Node(2);
		Node  nodeE = new Node(6);
		
		
		
		//we have to connect one node to another
		head.next = nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;
		
		
		//call the countNode;
		System.out.println(Node.countNodes(head));
		
		
	}

}
