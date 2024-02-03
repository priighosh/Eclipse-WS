package notes2; //Day24, A-S for methods
// Case1- Within class, 4methods 4 access specifier
public class Day25_AcessSpecifier 
{
	public void add()
	{
	 System.out.println("Addition");
	}
	private void mult()
	{
		System.out.println("Multiplication");
	}
	protected void sub()
	{
		System.out.println("Subtraction");
	}
	//default 
	void div()
	{
		System.out.println("Division");
	}
    public static void main(String[] args) 
    {
    	Day25_AcessSpecifier d1=new Day25_AcessSpecifier();
    	d1.add();
    	d1.mult();
    	d1.sub();
    	d1.div();

	}

}
