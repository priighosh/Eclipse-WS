package notes2;//Day27, 1 try 1 catch
// Exception Handling with try and catch, if exception is there catch will execute else try
public class Day27_ExceptionHandling 
{
    public static void main(String[] args) 
    {
      int c=10/2;
      System.out.println(c);
      try
      {
    	 int c1=1/0;// giving exception so catch will execute
    	 // int c1=1/1; //not giving exception so it will execute not catch
    	 System.out.println(c1); // To print try we need SOP,when not giving exception
      }
      catch(ArithmeticException a)// para is exception name with any ref var
      {
    	  System.out.println("Handling Exception that occured");
      }
    // System.out.println(c1); // will give exception so handle it to avoid stopping execution
      //add try and catch block (added on top of it)
      int c2=8/2; //Prog did not stop because we have handled the exception
      System.out.println(c2);
	}
}
