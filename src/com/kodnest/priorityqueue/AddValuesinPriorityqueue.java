package com.kodnest.priorityqueue;
import java.util.*;
public class AddValuesinPriorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue pq1=new PriorityQueue();
		//giving the numbers as disorder
		pq1.add(50);
		pq1.add(40);
		pq1.add(20);
		pq1.add(30);
		pq1.add(10);
		System.out.println(pq1);
		PriorityQueue pq2=new PriorityQueue();
		//giving the numbers as disorder
		//output will print small element first and then remaining
		pq2.add("Orange");
		pq2.add("Banana");
		pq2.add("kiwi");
		pq2.add("watermelon");
		pq2.add("Apple");
		System.out.println(pq2);
		

	}

}
