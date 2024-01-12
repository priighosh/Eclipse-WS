package notes;
// WAP to accept string value at run time
import java.util.Scanner;

public class Day_14_AdditionUsingHumanInput
{

	public static void main(String[] args) 
	{
	Scanner s1=new Scanner(System.in);//parameter, which will try to accept the input at run time from System
	/* String a=  s1.next(); utilizing its first method next String, class scanner, the value 
	will be stored in string */
	System.out.println("Enter the value of number1");
	int number1= s1.nextInt();  // the value we put at run time will be stored in number1 as int
	System.out.println("Enter the value of number2");
	int number2= s1.nextInt(); // the value we put at run time will be stored in number2 as int
	int result=number1+number2; //Logic
	System.out.println(result);
	s1.close();

	}
}
