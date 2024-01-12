package package2;
//Case3
public class Teacher_Day26_a 
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
	public static void main (String[]args)
	{
		Teacher_Day26_a t1=new Teacher_Day26_a();
		t1.mult();
	}
}
