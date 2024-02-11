package com.wrapperclasses;
import java.util.*;
public class ArrayListBoxingAndUnBoxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		
		//Boxing 
		//it means converting primitive data into wrapper class
		 al.add(10);       //al.add(new Integer(10));	 
		 al.add(10.0F);       //al.add(new Float(10.0F));
		 al.add('i');       //al.add(new Character('1'));
		 al.add(true);       //al.add(new Boolean(true));
		 al.add(10);       //al.add(new Integer(10)); 
		System.out.println(al);
		
		//UnBoxing
		//converting object to primitive data type
		int a=(int)al.get(0);
		float b=(float)al.get(1);
		char c=(char)al.get(2);
		boolean d=(boolean)al.get(3);
		int e=(int)al.get(4);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);

	}

}
