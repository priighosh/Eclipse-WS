package notes;

public class Day13_GTO3 
{
    int a=10;            //global
    double b=20;       //global
    String c="Ram";    //global
    
    void studentdetails (int a, double b, String c)  //  a,b,c became local here
    {
    	System.out.println(c);
    }
	public static void main(String[] args)
	{   
		int c=100;  // updating the value of local c from studentdetails method
        Day13_GTO3 d1= new Day13_GTO3();  // calling the non static method by ref variable, both statement printed
        d1.studentdetails(97, 3.1, "Vishnu");
        System.out.println(d1.a);  // 
		System.out.println(d1.a);  //
		System.out.println(c);
		/* if in print statement of a, b, c we don't mention the ref var, compilation error will come 
		 because it's a non static GV, we need ref var, object is already created*/
	}

}

