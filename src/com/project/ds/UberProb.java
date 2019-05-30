/**
 * 
 */
package com.project.ds;

import java.util.ArrayList;

/**
 * @author Trident MT581
 *  sample input 
 *  For example, if our input was [1, 2, 3, 4, 5], 
 *  the expected output would be [120, 60, 40, 30, 24]. 
 *  If our input was [3, 2, 1], the expected output would be [2, 3, 6]
 */
public class UberProb 
{
	
	
	public void productNumberArr(int[]arr)
	{
		/**
		 * init new int with given array length
		 * iterate for loop
		 */
		int len=arr.length;
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		//
		int current =0;
		for (int i = 0; i < arr.length; i++)
        {				
			for (int j = i+1; j < arr.length; j++) 
			{
				current = current*arr[j];
				System.out.println(current);
			}
              al.add(current);            
		}
		System.out.println(al);
	}
	
	public static void main(String[] args) 
	{
		UberProb u = new UberProb();
		
		int[] arr =  {1, 2, 3, 4, 5};
		u.productNumberArr(arr);
		
	}

}
