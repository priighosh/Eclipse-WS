package assignments;//Day33 Assign, Checking Vector class parameters,only add methods
import java.util.Collections;

import java.util.Vector;

public class assign37_CollectionClassVector 
{
    public static void main(String[] args) 
	{
  //Follows indexing, dynamic, accepts null & duplicate, stores heterogeneous elements, can be sorted
		Vector v1=new Vector();
		v1.add("Priyanka Ghosh");
		v1.add(7324589452l);
		v1.add('F');
		v1.add("Address: Kolkata 007");
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(true);
		v1.add(12.45);
		
		v1.add("Priyanka Ghosh");
		v1.add(7324589452l);
		v1.add('F');
		v1.add("Address: Kolkata 007");
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(true);
		v1.add(12.45);
		
		v1.add("Priyanka Ghosh");
		v1.add(7324589452l);
		v1.add('F');
		v1.add("Address: Kolkata 007");
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(true);
		v1.add(12.45);
		
		v1.add("Priyanka Ghosh");
		v1.add(7324589452l);
		v1.add('F');
		v1.add("Address: Kolkata 007");
		v1.add(null);
		v1.add(null);
		v1.add(null);
		v1.add(true);
		v1.add(12.45);
		System.out.println(v1);
		
		//Same data type can be sorted
		Vector v2=new Vector();
		v2.add(12);
		v2.add(10);
		v2.add(8);
		v2.add(45);
		v2.add(15);
		v2.add(35);
		System.out.println(v2);
		Collections.sort(v2); //Sorting in asc order
		System.out.println(v2);
		

	}

}
