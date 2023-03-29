package com.cg.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class Uniquename{


	public static void main(String[] args) {
	 
		String value="Snehal_Shweta_Snehal_Sakshi_Snehal_Shweta_Pratiksha_Snehal";

		final String[] valueArr = value.split("_");
		    final List<String> processedRecords = new ArrayList<String>();
		    List<String> list =Arrays.asList(valueArr);
		   // System.out.println(list);
		   
			/* for (String activity : list)
		    	
		    {
		    	
		      StringBuilder sb = new StringBuilder();
		      sb.append(activity);
		     processedRecords.add(sb.toString());

		      if (processedRecords.contains(sb.toString()))
		      {
		      System.out.println(activity);
		          
		      }
		      else
		      {
		      System.out.println("duplicate record found");
		      }
		    }*/
		    HashSet<String> hset = new HashSet<String>(list);
		    System.out.println("ArrayList Unique names is:" +hset);
	}
}
		
