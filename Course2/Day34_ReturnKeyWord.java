package notes2;// Day34, Prog1: return key-word, ACCESS SPECIFIER FOR VARIABLES
// This program also shows CT Polymorphism, Method overloading
public class Day34_ReturnKeyWord 
{
	static int add()
    {
 	   int a=20;
 	   int b=10;
 	   int c=a+b;
 	   return c; // Returning c, c is int so method's RT should be int otherwise compilation  error
 	   
    }
	static int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	static double add (int a, double b)
	{
		double c=a+b;
		return c;
	}
	static double add (double a, double b)
	{
		double c=a+b;
		return c;
	}
	static double add(double b, int c)
	{
		double d=b-c;
		return d;
	}
	public static void main(String[] args) 
	{
       System.out.println(add());
       System.out.println(add(12,10));
       System.out.println(add(12,12.25));
       System.out.println(add(2.2,12.25));
       System.out.println(add(2.20,25));
	}

}
