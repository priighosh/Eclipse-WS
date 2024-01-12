package bypriyanka;
public class Overloading // WAP to overload and call non static methods. 
{
	void add(boolean a)
	{
		System.out.println("NS1");
	}
	void add(String a,boolean b, char c, double d)
	{
		System.out.println("NS2");
	}
	void add(int a, int b, String c)
	{
		System.out.println("NS3");
	}
	void add(double a, char b)
	{
		System.out.println("NS4");
	}
	public static void main(String[] args)
    {
	Overloading o1=new Overloading();
	o1.add(false); //NS1
	o1.add(9.76,'L'); //NS4
	o1.add("Priyanka",true,'G',7.65); //NS2
	o1.add(2, 88,"Studentname"); //NS3
	}
}
