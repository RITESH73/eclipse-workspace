package com.collectonsdemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Collection<Integer> value =  new ArrayList<Integer>();
		
		value.add(12);
		value.add(17);
		value.add(1);
		
		
		// to fetch the value using the iterator.
		
		/*Iterator i = value.iterator();*/
		/*
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());*/
		
		
		/*while(i.hasNext()) {
			
			System.out.println(i.next());
		}*/
		
		
		// fetch the value using enhanced forloop..
		
		for(int i : value) {
			System.out.println(i);
		}
		
	}
		
}
