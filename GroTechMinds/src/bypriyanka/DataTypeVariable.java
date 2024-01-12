package bypriyanka;
public class DataTypeVariable //variable initialization and declaration of data type
{
      public static void main(String[] args)
	  {
		  byte   a=100;
		  System.out.println(a); // Once
		         a=9;    // Updating the value
		  System.out.println(a); // Twice, Printing updated value, printing 'a' twice that why both o/p came
		  short  b=9876;
		  System.out.println(b);
		  int    c=98765;
		  System.out.println(c);
		  long   d=9876543;
		  System.out.println(d);
		  float  e=9.65f;
		  System.out.println(e);
		  double f=9.654;
		  System.out.println(f);
		  char   g='R';
		  System.out.println(g);
		  boolean h=true;
		          h=false;  // Updating the value later,
		  System.out.println(h); // It will print the last updated value that's why h= false is printed
		  boolean i=true;
		  System.out.println(i);
          String j="Priyanka Ghosh";
		  System.out.println(j);

	}

}
