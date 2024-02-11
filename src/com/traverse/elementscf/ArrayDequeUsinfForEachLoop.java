package com.traverse.elementscf;

import java.util.*;

public class ArrayDequeUsinfForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(50);
		ad.add(40);
		ad.add(30);
		//in array list using the size method 
		for(Object x:ad)
		{
		
			System.out.println(x);
		}
		


	}

}
