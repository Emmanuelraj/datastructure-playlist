/**
 * 
 */
package com.project.dailycoding;

import java.util.Arrays;

/**
 * @author Emmanuel Raj
 * Hi, here's your problem today. This problem was recently asked by Google:

Given a list of numbers with only 3 unique numbers (1, 2, 3), sort the list in O(n) time.

Example 1:
Input: [3, 3, 2, 1, 3, 2, 1]
Output: [1, 1, 2, 2, 3, 3, 3]
 *
 */
public class SortArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] arr = {3, 3, 2, 1, 3, 2, 1};	
		//quick sort
		Arrays.sort(arr);	


		//Bubble sort 0(n2)
		for(int i=0;i<arr.length;i++)
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//print the values of an array
		for (int i = 0; i < arr.length; i++)
		{			
			System.out.println("sort -->"+arr[i]);			
		}	


	}

}
