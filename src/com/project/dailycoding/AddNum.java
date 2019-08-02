/**
 * 
 */
package com.project.dailycoding;

/**
 * @author Emmanuel Raj leetcode
 * Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers.
 *  The digits are stored in reverse order and each of their nodes contain a single digit. 
 *  Add the two numbers and return it as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
  Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
  Output: 7 -> 0 -> 8
  Explanation: 342 + 465 = 807.
 */


class LinkedListNode
{

	Integer data;
	LinkedListNode next;

	public LinkedListNode() {
		System.out.println("no args constructor");
	}

	//constructor
	public LinkedListNode(int data) 
	{
		this.data = data;
	}

	//printcount node
	public static  LinkedListNode linkedListNode(LinkedListNode head)
	{
		int count =1;		
		LinkedListNode current = head;		
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

	//reverseListNode by iteratively
	public static LinkedListNode reverseListNodesIt(LinkedListNode head)
	{
		System.out.println("reverseListNodes");

		LinkedListNode prev = null;
		LinkedListNode current = head;
		LinkedListNode next = null;

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





	public static ListNode reverseSecondListNodesIt(ListNode head)
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


	//print node
	static int printNode(LinkedListNode node) 
	{
		System.out.println("printNode");
		int rem =0;
		int rev =0;
		while(node!=null)
		{
			System.out.println(node.data);
			/*rem = node.data%10;
				rev = rev*10+rem;
			 */

			rem = node.data%10;
			rev = rev*10+rem;

			node = node.next; //

		}		
		System.out.println(rev);
		return rev;
	}


	static int printNode1(LinkedListNode node) 
	{
		System.out.println("printNode");
		int rem =0;
		int rev =0;
		while(node!=null)
		{
			System.out.println(node.data);
			/*rem = node.data%10;
				rev = rev*10+rem;
			 */

			rem = node.data%10;
			rev = rev*10+rem;

			node = node.next; //

		}		
		System.out.println(rev);
		return rev;
	}





}

public class AddNum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkedListNode head =  new LinkedListNode(2);
		LinkedListNode nodeB = new LinkedListNode(4);
		LinkedListNode nodeC = new LinkedListNode(3);

		LinkedListNode head1 =  new LinkedListNode(5);
		LinkedListNode nodeB1 = new LinkedListNode(6);
		LinkedListNode nodeC1 = new LinkedListNode(4);


		//we need to set
		head.next= nodeB;
		nodeB.next = nodeC;


		//we need to set
		head1.next= nodeB1;
		nodeB1.next = nodeC1;


		int n =LinkedListNode.printNode(LinkedListNode.reverseListNodesIt(head));
		int n1 =LinkedListNode.printNode1(LinkedListNode.reverseListNodesIt(head1));

		Integer res = n+n1;
		System.out.println("out --------->"+res);
		int rem =0;
		int rev =0;
		LinkedListNode head2 = new LinkedListNode();
		while(res>0)
		{
			rem = res%10;
			rev = rev*10+rem;
			res = res/10;
			head2.data =res;
			System.out.println(head2.data);
		}
		System.out.println("rev --------->"+rev);




	}

}
