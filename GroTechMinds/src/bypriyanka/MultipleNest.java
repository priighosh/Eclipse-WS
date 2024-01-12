package bypriyanka;
public class MultipleNest 
{
public static void main(String[] args)
{
		int a=10;
		int b=20;
		int c=30;
		if(a!=b)  //True
		{
		       if(a>b) //False, So this entire if block will be neglected
		       {
		              if(b==c)
		              {
		            	  System.out.println("1");
		              }
		              else
		              {
		            	  System.out.println("2");
		              }
		       }
		       else
		       {
		    	   System.out.println("3"); // This will be printed
		       }
		}
	    else   
	    {
	    	System.out.println("4");
	    }
}
}
