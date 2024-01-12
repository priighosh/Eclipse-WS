package notes;
//Day20,prog2 SCS- Explicit way for parameterized constructor
class Mentor1
{
	Mentor1 (int a)
	{
		System.out.println("Mentor1 constructor");
	}
}
public class Day20_SCS_2 extends Mentor1
{
    Day20_SCS_2()
    {   
    	super(85);
    	System.out.println("Day20_SCS_2 Constructor");
    }
	public static void main(String[] args)
	{
		new Day20_SCS_2();

	}

}
