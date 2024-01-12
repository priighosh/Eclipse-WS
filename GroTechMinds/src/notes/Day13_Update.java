package notes; // mentioned as 4 in notes
//Update the value of global variable for non static method
public class Day13_Update
{
    int a;
    double b;
    String c;
    
    void colleague (int a, double b, String c)
    {
    	System.out.println(b);
    	System.out.println(c);
    }
	public static void main(String[] args) 
	{
		Day13_Update d1=new Day13_Update ();
		d1.colleague(97, 3.1, "Vishnu");
		d1.a=100;  //updating the value of global variable with ref var
		d1.b=9.76;  //updating the value of global variable, no need to declare again just update with ref var
		System.out.println(d1.a);  // updated value will be printed
		System.out.println(d1.b);  // updated value will be printed
		System.out.println(d1.c);   // default value it will print because we havn't updated it.
		/* if in print statement of a, b, c we don't mention the ref var, compilation error will come 
		 because it's a non static GV, we need object and ref var, object is already created*/
	}
}

