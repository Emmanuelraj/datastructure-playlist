/**
 * 
 */
package com.project.dailycoding;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Emmanuel Raj
 *  Remove Duplicates from Sorted Array
 *  
 */
public class RemDupArr {

	public int removeDuplicates(int[] nums) {


		Set<Integer> ls = new TreeSet<Integer>();


		for(int i=0;i<nums.length;i++)
		{
			ls.add(nums[i]);
		}
		System.out.println(ls.size());
		return ls.size();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemDupArr rem = new RemDupArr();
		int[] arr = {1,1,2};
		rem.removeDuplicates(arr);
	}

}
