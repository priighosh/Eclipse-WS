package notes2;//Day31, Case-4
//Class type casting, C2 to C3,Up & Down
class Cat //C3
{
	void C1()
	{
		System.out.println("cat");
	}
}
class Fox extends Cat //C2
{
	void F1()
	{
		System.out.println("fox");
	}
}
public class Day31_Case4 //C1
{
	void D1()
	{
		System.out.println("dog");
	}
    public static void main(String[] args)
    {   
    	//Up-casting
    	Cat c1=new Fox();
    	c1.C1();
    	// Down-casting
    	Fox f1=(Fox) c1;
    	f1.C1();
    	f1.F1();

	}
}
