package com.kodnest.treeset;
import java.util.*;
public class AddingGenericsInTreeset {

	public static void main(String[] args) {
		// adding the integer generic in tree set
		TreeSet<Integer> ts1=new TreeSet<Integer>();
		ts1.add(50);
	//	ts1.add("String");//error not accept string
	//	ts1.add(true);//error not accept boolean
		ts1.add(40);
	//	ts1.add("Maggi");//error
		System.out.println(ts1);
		
		TreeSet<String> ts2=new TreeSet<String>();
		ts2.add("Banana");
		ts2.add("Apple");
		ts2.add("Watermelon");
	//	ts2.add(true);//Error
	//	ts2.add(20);//Error
		System.out.println(ts2);



	}

}
