package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateinlist {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(45);
		al.add(5);
		al.add(65);
		al.add(55);
		al.add(45);
		al.add(55);
		
		Set<Integer> s  = new LinkedHashSet<Integer>(al);
System.out.println(s);
ArrayList<Integer> al1 = new ArrayList<Integer>(s);

Collections.sort(al1);
System.out.println(al1);

	}
}
