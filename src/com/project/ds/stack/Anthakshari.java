/**
 * 
 */
package com.project.ds.stack;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Trident MT581
 *
 */
public class Anthakshari {

	/**
	 * @param args
	 */
	
	public ArrayList<String> AnthaksharyOfWords(ArrayList<String> words){

	    //init arrayList
	     ArrayList<String> al = new ArrayList<String>();

	     al.add(words.get(0));
	     
	     
	     for (int i = 0; i < al.size(); i++) 
	     {
		       for (int j = 1; j < words.size(); j++) 
		       {
				 if(words.get(j).charAt(0) == al.get(i).charAt(al.get(i).length()-1))
				 {
					  al.add(words.get(j));
				 }
			    }
	    	}

System.out.println(al);
	   return al;
	}
	
	public static void main(String[] args)
   {
		// TODO Auto-generated method stub
		
		Anthakshari a = new Anthakshari();
		
		ArrayList< String> al = new ArrayList<String>();
         
		al.add("Java");
		al.add("dbase");
		al.add("ox");
		al.add("android");
		al.add("excel");
		al.add("logo");
		
		System.out.println(a.AnthaksharyOfWords(al));
	}

}
