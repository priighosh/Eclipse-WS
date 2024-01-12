package assignments; // Day33 assignment, checking TreeSet class parameter

import java.util.TreeSet;

public class Assign40_ClassTreeSet 
{

	public static void main(String[] args) 
	{
		// Only dynamic in nature rest of the parameters are false
	    TreeSet t1=new TreeSet();
		t1.add("Name");
		t1.add("Priyanka Ghosh");
	//	t1.add(7324589452l);
	//	t1.add('F');
		t1.add("Address: Kolkata 007");
	/*	t1.add(null);
		t1.add(null);
		t1.add(null); */
	//	t1.add(true);
	//	t1.add(12.45);
		
		t1.add("Name");
		t1.add("Priyanka Ghosh");
		t1.add("Address: Kolkata 007");
		t1.add("Email");
		
		t1.add("Name");
		t1.add("Priyanka Ghosh");
		t1.add("Address: Kolkata 007");
		
		t1.add("Name");
		t1.add("Priyanka Ghosh");
		t1.add("Address: Kolkata 007");
		
		t1.add("Name");
		t1.add("Priyanka Ghosh");
		t1.add("Address: Kolkata 007");
		
		System.out.println(t1);
		
		

	}

}
