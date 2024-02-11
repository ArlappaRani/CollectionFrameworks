package com.arraylist;
import java.util.*;
public class AddAllMethodInArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList Fruitlist=new ArrayList();
		Fruitlist.add("Mango");
		Fruitlist.add("Apple");
		Fruitlist.add("Banana");
		Fruitlist.add("Orange");
		System.out.println(Fruitlist);
		
		
		ArrayList Veglist=new ArrayList();
		Veglist.add("Tomato");
		Veglist.add("Brinjal");
		Veglist.add("ladyFinger");
		Veglist.add("Bottleguard");
		System.out.println(Veglist);
		
		
		ArrayList grocerylist=new ArrayList();
	     grocerylist.addAll(Fruitlist);
		 grocerylist.addAll(2,Veglist);
		
		System.out.println(grocerylist);
		
		
		

	}

}
