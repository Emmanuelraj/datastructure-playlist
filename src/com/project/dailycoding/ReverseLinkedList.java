/**
 * 
 */
package com.project.dailycoding;
/**
 * @author Emmanuel Raj
 * 
 * Hi, here's your problem today. This problem was recently asked by Google:

Given a singly-linked list, reverse the list. This can be done iteratively or recursively. Can you get both solutions?
Example:
Input: 4 -> 3 -> 2 -> 1 -> 0 -> NULL
Output: 0 -> 1 -> 2 -> 3 -> 4 -> NULL
 */
class ListNode
{

	Integer data;
	ListNode next;

	//constructor
	public ListNode(int data) 
	{
		this.data = data;
	}

	//printcount node
	public static  ListNode linkedListNode(ListNode head)
	{
		int count =1;		
		ListNode current = head;		
		if(current != null)
		{
			while(current !=null)
			{
				current = current.next;
				count++;
			}
		}

		System.out.println("count-->"+count);
		return head;
	}
	//print node
	static void printNode(ListNode node) 
	{
		System.out.println("printNode");
		int rem =0;
		while(node!=null)
		{
			System.out.println(node.data);
			node = node.next; //
		}		

	}
	//reverseListNode by iteratively
	public static ListNode reverseListNodesIt(ListNode head)
	{
		System.out.println("reverseListNodes");

		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;

		if(current!=null)
		{
			while(current!=null)
			{
				next =current.next;
				current.next=prev;
				prev = current;
				current= next;
			}
		}

		head = prev;
		return head;

	}
	//using recursively
	public static ListNode reverseListNodesRec(ListNode head)
	{
		System.out.println("reverseListNodes");

		ListNode prev = null;
		ListNode current = head;
		ListNode next = null;

		if(current!=null)
		{
			System.out.println("rec val data ====>"+current.data);
			current = current.next;
			reverseListNodesRec(current);
		}

		head = prev;
		return head;

	}





}
public class ReverseLinkedList
{



	public static void main(String[] args) 
	{


		ListNode head =  new ListNode(4);
		ListNode nodeB = new ListNode(3);
		ListNode nodeC = new ListNode(2);
		ListNode nodeD = new ListNode(1);
		ListNode nodeE = new ListNode(0);



		//we need to set
		head.next= nodeB;
		nodeB.next = nodeC;
		nodeC.next = nodeD;
		nodeD.next = nodeE;


		//for print count of List
		//ListNode.printNode(ListNode.linkedListNode(head));
		//for iteratively
		ListNode.printNode(ListNode.reverseListNodesIt(head));

		//for recursively
		//ListNode.printNode(ListNode.reverseListNodesRec(head));


	}

}
