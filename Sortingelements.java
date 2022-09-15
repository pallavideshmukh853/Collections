package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Sortingelements {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("punit");
		list.add("yash");
		list.add("mangesh");
		list.add("aditya");
		Collections.sort(list);
		System.out.println(list);
	}
}
