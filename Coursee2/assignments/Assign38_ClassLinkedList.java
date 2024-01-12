package assignments;//Day33 assignment, checking LinkedList class para

import java.util.Collections;

import java.util.LinkedList;

public class Assign38_ClassLinkedList
{
	//Follows indexing, dynamic, accepts null & duplicate, stores heterogeneous elements, can be sorted
    public static void main(String[] args) 
	{
		LinkedList l1=new LinkedList();
		l1.add("Name");
		l1.add("Priyanka Ghosh");
		l1.add(7324589452l);
		l1.add('F');
		l1.add("Address: Kolkata 007");
		l1.add(null);
		l1.add(null);
		l1.add(null);
		l1.add(true);
		l1.add(12.45);
		System.out.println(l1);
		
		LinkedList l2=new LinkedList();
		l2.add(12);
		l2.add(10);
		l2.add(8);
		l2.add(45);
		l2.add(15);
		l2.add(35);
		System.out.println(l2);
		Collections.sort(l2); //Sorting in asc order
		System.out.println(l2);

	}

}
