package assignments;
// WAP to use logical operator, create your own print statement
public class Assign10_LO 
{
    public static void main(String[] args)
    {
      int a=6;
      int b=10;
      
      if (a>5 || b==a)
      {
    	System.out.println("Mango");  
      }
      if (a==b && b==6)
      {
	    System.out.println("Orange");
      }
      if (!(a>5 || b==a))
      {
    	System.out.println("Bananna");  
      }
      if (!(a==b && b==6))
      {
	    System.out.println("Apple");
      }
}
}
