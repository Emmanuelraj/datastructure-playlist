/**
 * 
 */
package com.project.dailycoding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Emmanuel Raj
 * Hi, here's your problem today. This problem was recently asked by Facebook:

You are given a list of numbers, and a target number k. 
Return whether or not there are two numbers in the list that add up to k.

Example:
Given [4, 7, 1 , -3, 2] and k = 5, 
return true since 4 + 1 = 5.

def two_sum(list, k):
  # Fill this in.

print two_sum([4,7,1,-3,2], 5)
# True

Try to do it in a single pass of the list.
 */
public class TwoSum {

	
	
	
	/**
	 * @param i 
	 * @param ls 
	 * @param 
	 */
	public boolean two_sumBubbleSort(List<Integer> ls, int k)
	{
		
		System.out.println("two_sumBubbleSort");
		boolean flag = false;
		for (int i = 0; i < ls.size(); i++) 
		{
			for (int j = i+1; j < ls.size(); j++) 
			{
				
				if(ls.get(i)+ls.get(j)==k)
				{
					
					System.out.println(ls.get(i)+""+ls.get(j));
					flag = true;
				}
				
			}
			
		}
		return flag ;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		List<Integer> ls = new ArrayList<Integer>();
		ls = Arrays.asList(2, 4, 3, 5, 6, -2, 4, 7, 8, 9);
		TwoSum two = new TwoSum();
		boolean b = two.two_sumBubbleSort(ls,7);
        System.out.println(b);
	}

}