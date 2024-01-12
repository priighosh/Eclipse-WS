package notes2;// Day27
// Multiple catch to handle multiple exception, whichever catch has handled the exception will be executed
public class Day27_Prog3_MultipleException 
{
    public static void main(String[] args)
    {
    	try
        {
      	 int c1=1/0;
      	 System.out.println(c1); // To print try we need SOP, when try is not giving exception
        }
        catch(ArithmeticException a)// para is exception name with any ref var
        {
      	  System.out.println("Handling Exception that occured");// This catch will execute becoz try is giving 
      	                // Arithmetic Exception which has been handled by this1.
        }
    	catch(NullPointerException a1)
        {
      	  System.out.println("Handling NP Exception that occured");
        }
    	finally
    	{
    		System.out.println("app logs");
    	}
	}

}
