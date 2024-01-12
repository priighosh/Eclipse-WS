package notes;

import java.util.Scanner;

public class Day15_Scanner_Methods
{
    public static void main(String[] args)
	{
	Scanner s1=new Scanner(System.in);
	// String a=s1.next();
	System.out.println("Enter age as int");
	int age=s1.nextInt();
	System.out.println("Enter age1 as byte");
	byte age1=s1.nextByte();
	int result=age+age1;
	System.out.println(result);
	/* short age2=s1.nextShort();
	long age3=s1.nextLong();
	float f1=s1.nextFloat();
	double d2=s1.nextDouble();
	boolean b1=s1.nextBoolean(); */
	s1.close();
	}
}
