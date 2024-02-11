package com.kodnest.arraydeque;
import java.util.*;
public class HeteroDataStoreInArrayDq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		ad.add(20);
		ad.add("Mango");
		ad.add(33.5F);
		ad.add(true);
		System.out.println(ad);

	}

}
