package com.cg.List;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Javaset // cannot add duplicate elements
{

	public static void main(String[] args) {
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set1= new TreeSet<String>(); // data is unordered but it is alphabetically sorted
		
		// Here data is not added as in indexing approach
		// we got hashcodes for elements which are being added
		set1.add("meghana");
		set1.add("meghana");
		set1.add("meghana");
		set1.add("dharani");
		set1.add("gagan");
		set1.add("bobby");
		set1.add("anand");
		set1.add("bindu");
		//1.data is unique, no reductancy
		//2. data is unordered in output due to hashing
		System.out.println("set is:"+set1);
		
		Iterator<String> itr = set1.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		set1.remove("bobby");
		System.out.println("set after removing bobby is:" +set1);
		
		if(set1.contains("meghana")) {
			System.out.println("meghana is in the set");
		}
		System.out.println("set size is:" +set1.size());
	

	}

}
