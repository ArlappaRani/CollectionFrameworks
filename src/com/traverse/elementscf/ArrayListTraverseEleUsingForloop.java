package com.traverse.elementscf;
import java.util.*;
public class ArrayListTraverseEleUsingForloop {

	public static void main(String[] args) {
		
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(50);
		al.add(40);
		al.add(30);
		//in array list using the size method 
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i)+" ");
		}
		

	}

}
