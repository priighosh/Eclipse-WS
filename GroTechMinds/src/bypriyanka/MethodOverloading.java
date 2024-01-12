package bypriyanka;
public class MethodOverloading //WAP to call static and non static method
{
	static void add() // Static
	{
	   int a=6;
	   int b=a+12;
	   System.out.println(b);
	}
	void add(int a) // non static
	{
		int b=a+12;
		System.out.println(b);
	}
	void add (double a) //non static
	{
		double b=a+12;
		System.out.println(b);
	}
	public static void main(String[] args) 
    {
		add(); // static method
		MethodOverloading m1= new MethodOverloading(); // non static
		m1.add(9); //non static parameterized
		m1.add(7.65); //non static parameterized
    }
}
