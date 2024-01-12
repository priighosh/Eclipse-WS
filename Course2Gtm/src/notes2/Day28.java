package notes2;
//Overloading main method with different argument list
public class Day28 
{

	public static void main(String[] args) // JVM is recognizing this one only
	{
		System.out.println("1");
		main();
		main(44); 
	}
	public static void main() 
	{
		System.out.println("2");
	}
	public static void main(int a) 
	{
		System.out.println("3");
	}
	public static void main(double b)
	{
		System.out.println("4"); //Won't be overloaded since it is not called 
	}

}
