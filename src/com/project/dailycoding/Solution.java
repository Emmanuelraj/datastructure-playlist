package com.project.dailycoding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Emmanuel raj
 * 
 * Hi, here's your problem today. This problem was recently asked by AirBNB:

Given a sorted array, A, with possibly duplicated elements, 
find the indices of the first and last occurrences of a target element, x. Return -1 if the target is not found.
 * Input: A = [1,3,3,5,7,8,9,9,9,15], target = 9
Output: [6,8]

Input: A = [100, 150, 150, 153], target = 150
Output: [1,2]

Input: A = [1,2,3,4,5,6,10], target = 9
Output: [-1, -1]
 *
 */
public class Solution 
{

	public int[] getRange(int[] arr, int target)
	{
		
		System.out.println("getRange");
		List<Integer> al = new ArrayList<Integer>();
		List<Integer> alnew = new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				al.add(i);
				
			}
		}
		
		int[] newArr = new int[2];
		if(al.size()==0)
		{
			System.out.println("zero");
			 int [] newArr1= {-1,-1};			
			 return newArr1;			 
		}
		else 
		{			
			newArr[0]=al.get(0);
			newArr[1]=al.get(al.size()-1);
			return newArr;
		}
		
		
		
		
	}
	

    public static void main(String[] args) {
		
    	int[] arr = {1,2,3,4,5,6,10};
    	int target = 9;
    	
    	Solution soln = new Solution();
    	int[] resArr =soln.getRange(arr,target);
    	for(int i=0;i<resArr.length;i++)
    	{
    		System.out.println(resArr[i]);
    	}
	}





}

