package bypriyanka;
public class Arithmatic1
{
    static void add() 
	{
	int a=6;
	int b=a+5;
	System.out.println(b);
	}
	static void add(int a) 
	{
	int b=a+100;
	System.out.println(b);
	}
	static void add(double a) 
	{
	double b=a+9;
	System.out.println(b);
	}
	static void add(boolean a) 
	{

	}
	public static void main(String[] args)
	{
	add(); //without parameter
	add(100); // passing int value, 100 comes under the range of int= b=a+100=100+100=200 //with parameter
	add(); // without parameter
	add(100.1); // double b=a+9= So put 'a' value in double, 100.1+100= 109.1 // with parameter
	add(53); // with parameter add(int 53)
    }
}
