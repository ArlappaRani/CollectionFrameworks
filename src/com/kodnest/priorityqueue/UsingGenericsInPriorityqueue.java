package com.kodnest.priorityqueue;
import java.util.*;
public class UsingGenericsInPriorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
		pq1.add(10);
		//Error pq1.add("Orange");
		pq1.add(20);
		//Error pq1.add(true);
		//Error//pq1.add("Apple");
		System.out.println(pq1);
		//using String generic
		PriorityQueue<String> pq2=new PriorityQueue<String>();
		// Error pq2.add(10);
		pq2.add("Orange");
		//pq2.add(20);
		//pq2.add(true);
		pq2.add("Apple");
		System.out.println(pq2);

	}

}
