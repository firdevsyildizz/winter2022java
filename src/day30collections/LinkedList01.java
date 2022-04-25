package day30collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

	public static void main(String[] args) {
		
		LinkedList<String> ll1 = new LinkedList<>();
		ll1.add("Ali");
		ll1.add("Can");
		ll1.add("Mark");
		ll1.add("Tom");
		
		//How to print LinkedList
		System.out.println(ll1);
		
		//How to get first element from a linked list
		String firstElement1 = ll1.element();//element() returns the first element without removing (copy+paste)
		System.out.println(firstElement1);//Ali
		System.out.println(ll1);
		
		String firstElementRemoved = ll1.poll();//poll() returns the first element after removing (cut+paste)
		System.out.println(firstElementRemoved);//Ali
		System.out.println(ll1);
		
		String firstElement2 = ll1.getFirst();//getFirst() returns the first element without removing (copy+paste)
		System.out.println(firstElement2);//Can
		System.out.println(ll1);
		
		String firstElement3 = ll1.peek();//peek() returns first element without removing (copy+paste)
		System.out.println(firstElement3);//Can
		System.out.println(ll1);
		
		//How to get first element from an empty linked list
		LinkedList<String> ll2 = new LinkedList<>();
		
		//String firstElFromEmptyLinkedList1 = ll2.element();// element() method throws NoSuchElementException for the 
		                                                     // empty linked list
		//System.out.println(firstElFromEmptyLinkedList1);
		
		String firstElFromEmptyLinkedList2 = ll2.peek();// It returns "null" for empty linked list
		System.out.println(firstElFromEmptyLinkedList2);
		
		String firstElFromEmptyLinkedList3 = ll2.poll();// It returns "null" for empty linked list
		System.out.println(firstElFromEmptyLinkedList3);
		
		//String firstElFromEmptyLinkedList4 = ll2.getFirst();// getFirst() method throws NoSuchElementException for the 
                                                              // empty linked list
		//System.out.println(firstElFromEmptyLinkedList4);
		
		//How to remove elements from a LinkedList
		LinkedList<Integer> ll3 = new LinkedList<>();
		ll3.add(0, 12);//When you use add(index,element) method make the indexes in ascending order
		ll3.add(1, 13);
		ll3.add(2, 10);
		ll3.add(3, 11);
		
		System.out.println(ll3);
		
		Integer first1 = ll3.remove(); //Retrieves and removes the first element of this list.
		System.out.println(first1);//12
		System.out.println(ll3);//[13, 10, 11]
		
		Integer first2 = ll3.remove(2);
		System.out.println(first2);//11
		System.out.println(ll3);//[13, 10]
		
		ll3.add(13);
		ll3.add(10);
		ll3.add(13);
		System.out.println(ll3);//[13, 10, 13, 10, 13]
		
		ll3.removeFirstOccurrence(13);
		System.out.println(ll3);//[10, 13, 10, 13]
		
		ll3.removeLastOccurrence(10);
		System.out.println(ll3);//[10, 13, 13]

		ll3.add(12);
		ll3.add(9);
		ll3.add(8);
		ll3.add(3);
		System.out.println(ll3);//[10, 13, 13, 12, 9, 8, 3]
		
		LinkedList<Integer> ll4 = new LinkedList<>();
		ll4.add(3);
		ll4.add(12);
		ll4.add(13);
		System.out.println(ll4);//[3, 12, 13]
		
		ll3.removeAll(ll4);
		System.out.println(ll3);//[10, 9, 8]
		
		//How to insert elements into a LinkedList
		ll4.addAll(ll4);
		System.out.println(ll4);//[3, 12, 13, 3, 12, 13]
		
		ll4.addAll(1, ll3);
		System.out.println(ll4);//[3, 10, 9, 8, 12, 13, 3, 12, 13]
		
		ll4.addFirst(100);
		System.out.println(ll4);//[100, 3, 10, 9, 8, 12, 13, 3, 12, 13]
		
		ll4.addLast(900);
		System.out.println(ll4);//[100, 3, 10, 9, 8, 12, 13, 3, 12, 13, 900]
		
		//How to update a specific node
		ll4.set(6, 200);
		System.out.println(ll4);//[100, 3, 10, 9, 8, 12, 200, 3, 12, 13, 900]
		
		List<Integer> subList01 = ll4.subList(3, 6);
		System.out.println(subList01);//[9, 8, 12]
		System.out.println(ll4);//[100, 3, 10, 9, 8, 12, 200, 3, 12, 13, 900]

	}

}
