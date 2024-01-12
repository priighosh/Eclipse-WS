package assignments; //Day33 assignment, checking LinkedHashSet class parameter

import java.util.LinkedHashSet;

public class Assign42_ClassLinkedHashSet
{
// follows indexing,can store heterogeneous,Dynamic,accepts null, Doesn't accept duplicate, Can not be sorted
	public static void main(String[] args)
	{
		LinkedHashSet l1=new LinkedHashSet();
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
		l1.add(78.25);
		l1.add("Email");
		System.out.println(l1);
		
		

	}

}
