package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateitems {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("pen");
		al.add("pencil");
		al.add("notepad");
		al.add("notebook");
		al.add("pen");
		al.add("pencil");
		
		Set<String> s  = new LinkedHashSet<String>(al);
System.out.println(s);
ArrayList<String> al1 = new ArrayList<String>(s);

Collections.reverse(al1);
System.out.println(al1);
	}
}
