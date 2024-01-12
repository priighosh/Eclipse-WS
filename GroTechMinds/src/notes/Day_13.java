package notes;
//GTO
public class Day_13 
	{
	    int a=10;            //global, all non static a,b,c
	    double b=20;       //global
	    String c="Ram";    //global
	    
	    void studentdetails (int a, double b, String c)  //  a,b,c became local here
	    {
	    	System.out.println(c);
	    }
		public static void main(String[] args)
		{
		    int c=100; // Local variable
	        Day_13 d1= new Day_13 ();          // calling the non static method by ref variable
	        d1.studentdetails(97, 3.1, "Vishnu");
	        System.out.println(d1.a);
	        System.out.println(d1.b);
	        System.out.println(c);  //  calling local variable
		}
    }



