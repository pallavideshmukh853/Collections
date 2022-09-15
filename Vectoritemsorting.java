package com.collection;

import java.util.Collections;
import java.util.Vector;

public class Vectoritemsorting {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		vec.add("burger");
		vec.add("pizza");
		vec.add("breadomellet");
		vec.add("pasta");
		vec.add("roll");
		vec.add("nugets");
		System.out.println("Original vector :" +vec);
		Collections.sort(vec);
		System.out.println("Sorted vector :" +vec);

	}
}
