package com.project.ds.stack;

import java.util.Scanner;


 class Node 
{
	 
	 int data;
	 
	 Node next;
	 
	 
	 Node(int data)
	 {
		 this.data = data;
	 }
	 
	 
	 void peek(Node node)
	 {
		 System.out.println("peek Data"+node.data);
	 }
	
	 
	
	
	
}


public class StackLinkedListImpl 
{
   public static void main(String[] args) 
   {
	   
	   Scanner scan = new Scanner(System.in);
	   push(scan.nextInt());
	   
	   
	   
   }

private static void push(int data) 
{
	   Node head = new Node(data);
	   
	  
}
}
