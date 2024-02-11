package com.kodnest.arraydeque;
import java.util.*;
public class InsertValuesAtRareEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add(30);
		ad.addFirst("First");
		ad.addLast("Last");
		
		System.out.println(ad);

	}

}
