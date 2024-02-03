package notes2;//Day33
//collection, add method for 1st class ArrayList
import java.util.ArrayList; //from this package array list come, this is PACKAGE NAME
public class Day33a_collectionClassArrayList 
{
    public static void main(String[] args) 
	{
		ArrayList a1=new ArrayList();
		//Storing heterogeneous values together ,follows indexing
		a1.add(75); //added first element to this array,Creating an array with add method
		a1.add(76.76);
		a1.add('C');
		a1.add("Priyanka");
		a1.add("Priyanka"); //Duplicate multiple times
		a1.add(null);// accepts null multiple times
		a1.add(null);
		a1.add(null);
		a1.add(null);
		a1.add(true);
		System.out.println(a1);
		
		//Storing different data types/ heterogeneous elements
		ArrayList a2=new ArrayList();//should not write a1 again, compilation error, local var can't be duplicate
		a2.add("Priyanka Ghosh");
		a2.add(9732791879l); //for long write L at the end of mob no
		a2.add('F');
		a2.add("Address: Kolkata 04");
		//Array list is Dynamic in nature, keeps on expanding & accepts Duplicate, this can't be sorted 
		//cannot sort because data types are different
		a2.add("Priyanka Ghosh");
		a2.add(9732791879l); //for long write L at the end of mob no
		a2.add('F');
		a2.add("Address: Kolkata 04");
		
		a2.add("Priyanka Ghosh");
		a2.add(9732791879l); //for long write L at the end of mob no
		a2.add('F');
		a2.add("Address: Kolkata 04");
		
		a2.add("Priyanka Ghosh");
		a2.add(9732791879l); //for long write L at the end of mob no
		a2.add('F');
		a2.add("Address: Kolkata 04");
		
		
		a2.add("Priyanka Ghosh");
		a2.add(9732791879l); //for long write L at the end of mob no
		a2.add('F');
		a2.add("Address: Kolkata 04");
		System.out.println(a2);

	}

}
