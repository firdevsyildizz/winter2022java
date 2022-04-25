package day31collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
	 	1)"Set" means collection with unique elements
	 	2)"Hash" is a technique to create unique codes for every data
	 	3)"HashSet" works fast because HashSet does not put the elements in any order
	 	  (i:Insertion Order ii:Natural Order = Alphabetical order or Ascending order)
	 	  HashSet puts the elements in "Random Order"
	 	4)HashSet accepts "null" as element just once
	 	5)If you try to store repeated elements into a Set, Java will accept the repeated elements just once.
	 	  That rule is valid for null as well
	 */

public class HashSet01 {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>();	
		hs1.add("K");
		hs1.add("K");
		hs1.add(null);
		hs1.add(null);
		
		HashSet<String> hs2 = new HashSet<>();	
		hs2.add("K");
		hs2.add(null);
		
		System.out.println(hs1);//[null, K]
		System.out.println(hs2);//[null, K]
		
		//equals() method checks i)Data types ii)Number of elements iii)Vlaues of elements
		System.out.println(hs1.equals(hs2));//true
		
		System.out.println(hs1.remove(null));//true
		System.out.println(hs1);//[K]
		
		System.out.println(hs1.remove("X"));//false
		System.out.println(hs1);//[K]

		//Interview Question: Type code to display ArrayList elements just once
		//Ex: ArrayList: [5, 3, 5, 2, 5, 3] ==> [5, 3, 2]
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(5);
		l1.add(3);
		l1.add(5);
		l1.add(2);
		l1.add(5);
		l1.add(3);
		System.out.println(l1);
		
		HashSet<Integer> hs3 = new HashSet<>();
		hs3.addAll(l1);
		
		System.out.println(hs3);

	}

}
