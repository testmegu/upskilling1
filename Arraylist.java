package com.cg.List;
import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;


class Student{
	int roll;
	String name;
	
}

public class Arraylist {

	public static void main(String[] args) {
	ArrayList<String> list1 = new ArrayList<String>();
	list1.add("anand");//0 //... indexing method followed
	list1.add("dharani");//1
	list1.add("niku");//2
	list1.add("gagan");//3
	list1.add("apoorva");//4
	list1.add("meghana");//5
	list1.add("meghana");//6
	//list1.add(77);// we get errors here because our arraylist is only parameterized with string;
	//list1.add(00);
	
	Student s1 = new Student();
	s1.roll=89;
	s1.name ="megha";
	
	
	
	ArrayList list2 = new ArrayList(); // here we can add both numbers and alphabets becoz not parameterized with one particular
	list2.add("meghana");
	list2.add(99);
	list2.add("bobby");
	list2.add(s1);// here hashcode of the reference variable s1 gets printed
	list2.add('A');
	
	
	

	// print reference to the list : elements get printed in a sequenced manner
	System.out.println("list1 is : " +list1);
	System.out.println("list2 is :" +list2);
	
	
	//get the elements we want from the list
	String name = list1.get(2);
	System.out.println("name is:" +name);
	
	Object o = list2.get(2);
	System.out.println("o is :" +o);
	
	// update element in list
	list1.set(2, "nikshitha");
	System.out.println("list1 now is:" +list1);
	
	//remove the element
	list1.remove(6);
	System.out.println("list1 after removing :" +list1);
	
	//list1.clear(); --> clear all
	
	//searching and sorting
	if(list1.contains("gagan")) {
		System.out.println("list1 conatins gagan");
	}
	//s.iterate in arraylist
	System.out.println("=====Iterating with enhanced For Loop=====");
	for(String str : list1) {
		System.out.println(str);
	}
	System.out.println("========");
	
	System.out.println("=====Iterating with basic For Loop=====");
	for(int i = 0; i<list1.size();i++) {
		System.out.println(list1.get(i));
	}
	System.out.println("========");
	
	System.out.println();
	
	System.out.println("=====iterating with Iterator=====");
	/*Iterator<String> itr = list1.iterator();
    System.out.println(itr.next());
    System.out.println(itr.next());
    while(itr.hasNext()) {
    	String str = itr.next();
    	System.out.println(str);*/
    }
    


	}


