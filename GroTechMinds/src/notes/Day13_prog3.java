package notes;
// Default value of global variable
public class Day13_prog3 
{
    int a;
    double b;
    String c;
    
    void collegue (int a, double b, String c)
    {
    	System.out.println(c);
    }
	public static void main(String[] args) 
	{
		Day13_prog3 d1=new Day13_prog3 ();
		d1.collegue(97, 3.1, "Vishnu");
		System.out.println(d1.a);
		System.out.println(d1.b);
		System.out.println(d1.c);
	}
}
