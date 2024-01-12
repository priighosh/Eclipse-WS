package notes;
// Types Of Variables- Local
public class Day12Local
{
	void add()
	{
		int b=987; // Local
		System.out.println(b); // Scope of b is only add method 
	}
    public static void main(String[] args)
	{
		int a=100; //Local
		System.out.println(a);
	    String b; // Local
	    b= "Name";
	    System.out.println(b);
	    b="India";   // Local, updating value on my own from class 13 updating value
	    System.out.println(b);
	}
}
