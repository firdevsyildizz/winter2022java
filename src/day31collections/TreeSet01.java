package day31collections;

import java.util.HashSet;
import java.util.TreeSet;

/*
	 	1)If you need to store unique elements in natural order use TreeSet
	 */

public class TreeSet01 {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts1 = new TreeSet<>();
		ts1.add(12);
		ts1.add(35);
		ts1.add(10);
		ts1.add(46);
		ts1.add(9);		
		System.out.println(ts1);//[9, 10, 12, 35, 46]
		
		 /*
		 	1)How to store unique elements in natural order in a collection?
		 	  Ans: I use TreeSet
		 	  
		 	2)But as you know TreeSet is very slow, how can you make your code faster?
		 	  i: I create a HashSet and add the elements into HashSet
		 	  ii: I create a TreeSet and I convert HashSet to TreeSet
		 */
		
		//1.Way:
		Long t1 = System.nanoTime();
		TreeSet<String> ts2 = new TreeSet<>();
		ts2.add("K");
		ts2.add("Z");
		ts2.add("A");
		ts2.add("C");
		ts2.add("T");
		System.out.println(ts2);//[A, C, K, T, Z]
		Long t2 = System.nanoTime();
		
		//2.Way: Recommended
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("K");
		hs1.add("Z");
		hs1.add("A");
		hs1.add("C");
		hs1.add("T");
		System.out.println(hs1);//[A, C, T, Z, K]
		
		TreeSet<String> ts3 = new TreeSet<>(hs1);
		System.out.println(ts3);//[A, C, K, T, Z]
		Long t3 = System.nanoTime();
		
		System.out.println(t2-t1);//179151
		System.out.println(t3-t2);//152278
	
	}

}
