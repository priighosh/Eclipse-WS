package assignments;
// throw and throws key-word
public class Assign30_throw_keyword 
{
    static void checkage (int age)
    {
    if (age>=18)
	{
		System.out.println("Visit Google.com");
	}
	else
	{
	throw new ArithmeticException("You are still young"); //step1 throwing exception
	}
	
	}
	public static void main(String[] args) throws ArithmeticException // declaring the exception step2
	{
	checkage(25);
	checkage(18);
	// checkage(15); it will give exception
	
	}
}