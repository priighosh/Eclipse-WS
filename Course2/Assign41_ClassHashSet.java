package assignments;// Day33 assignment, checking HashSet class parameter

import java.util.HashSet;

public class Assign41_ClassHashSet 
{
// Heterogeneous, Dynamic, accepts null,doesn't accept duplicate, can not be sorted, doesn't follow indexing
	public static void main(String[] args) 
	{
		HashSet h1= new HashSet();
		h1.add("Name");
		h1.add("Priyanka Ghosh");
		h1.add(7324589452l);
		h1.add('F');
		h1.add("Address: Kolkata 007");
		h1.add(null);
		h1.add(null);
		h1.add(null);
		h1.add(true);
		h1.add(12.45);
		h1.add(78.25);
		System.out.println(h1);
		
    /*    HashSet h2=new HashSet();
		h2.add(12);
		h2.add(10);
		h2.add(8);
		h2.add(45);
		h2.add(15);
		h2.add(35);
		System.out.println(h2);
		Collections.sort(h2); //Sorting in asc order
		System.out.println(h2);
*/
	}

}
