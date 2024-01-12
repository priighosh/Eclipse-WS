package assignments;
// Update the value of global variable in case it is static
public class Assign13 
{
	   static int a;
	   static double b;
	   static  String c;
	    
	   static void colleague (int a, double b, String c)
	    {
	    	System.out.println(c);
	    }
		public static void main(String[] args) 
		{
			colleague (2, 2.25,"Pri"); // input value for colleague method
			a=155;  //updating the value of global variable
			b=7.99;  //updating the value of global variable, no need to declare again just update
			System.out.println(a);
			System.out.println(b);
			System.out.println(c); // it will print default value
			a=255;            // updating the value of GV a again
			System.out.println(a);
			c="Country";          //updating the value of GV c
			System.out.println(c);
		}
	}
