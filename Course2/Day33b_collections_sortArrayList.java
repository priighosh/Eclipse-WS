package notes2;
//Day33, ArrayList accept sorting(ascending) when data types are similar for different elements
import java.util.ArrayList; 

import java.util.Collections;

public class Day33b_collections_sortArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		a1.add(12);
		a1.add(10);
		a1.add(8);
		a1.add(45);
		a1.add(15);
		a1.add(35);
		System.out.println(a1); //not sorted
		
		Collections.sort(a1);  //sorting using a predefined class "collections"
		System.out.println(a1);

	}

}
