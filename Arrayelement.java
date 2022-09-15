package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrayelement {

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(100);
		al.add(50);
		al.add(30);
		al.add(20);
		al.add(10);
		
		int index = Collections.binarySearch(al,10,Collections.reverseOrder());
		System.out.println("Found at Index" + index);
	}
}
