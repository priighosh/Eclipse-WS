package assignments;// Day33 assignment, checking PriorityQueue class para

import java.util.PriorityQueue;

public class Assign39_ClassPriorityQueue
{
// Doesn't follow indexing, can't store heterogeneous & null, can not be sorted,
	// Accept Duplicate, Dynamic in nature
	public static void main(String[] args) 
	{
		PriorityQueue p1=new PriorityQueue();
		p1.add("Name");
		p1.add("Priyanka Ghosh");
		// p1.add(7324589452l); //ClassCastException
	//	p1.add('F');
		p1.add("Address: Kolkata 007");
	/*	p1.add(null); //NullPointerException
		p1.add(null);
		p1.add(null); 
		p1.add(true); 
		p1.add(12.45); */
		p1.add("Name");
		p1.add("Priyanka Ghosh");
		p1.add("Address: Kolkata 007");
		
		p1.add("Name");
		p1.add("Priyanka Ghosh");
		p1.add("Address: Kolkata 007");
		
		p1.add("Name");
		p1.add("Priyanka Ghosh");
		p1.add("Address: Kolkata 007");
		
		p1.add("Name");
		p1.add("Priyanka Ghosh");
		p1.add("Address: Kolkata 007");
		
		System.out.println(p1);
		
		


	}

}
