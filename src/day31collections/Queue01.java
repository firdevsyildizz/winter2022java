package day31collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {

	public static void main(String[] args) {
		
		//If you use LinkedList constructor to create an object in Queue data type, the elements will be in insertion order
		Queue<String> q1 = new LinkedList<>();
		System.out.println(q1.offer("A"));//true
		System.out.println(q1);//[A]

		
		//If you use PriorityQueue constructor to create an object in Queue data type, the elements will be in 
		//order according to the rule Java decided. But we are able to create our own rules to sort elements.
		//We will learn it in Lambda Course.
		Queue<String> q2 = new PriorityQueue<>();

	}

}
