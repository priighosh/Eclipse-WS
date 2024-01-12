package array_prog;
//Arrays class: converting any types of input into an array or form of an object
import java.util.Arrays;
import java.util.Scanner;

//Create an array of size 3, for int data type ,fetch it's values by using scanner class
public class Day72ArrayScanner1
{

	public static void main(String[] args)
	{
	   int number[]=new int[3];	
	   for(int i=0;i<=2;i++)
	   {
       Scanner s1=new Scanner(System.in);
       number[i]= s1.nextInt();
      System.out.println(number[i]);
	   }
	 /*  for(int j=0;j<=2;j++)
	   {
	   System.out.println(number[j]);
	   }*/
	  /* System.out.println(number[0]);
	   System.out.println(number[1]);
	   System.out.println(number[2]);*/

	   String a=Arrays.toString(number);
	   System.out.println(a); //Arrays class converting int to string to convert the separate numbers into an array
	}
}
