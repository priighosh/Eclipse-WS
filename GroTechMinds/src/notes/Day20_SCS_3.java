package notes; //Day20,prog3
//SCS-explicit and implicit
class Mentor2 
{
	Mentor2() // How to call both the constructor from one class? Ans: Using this calling statement
	{         // We will only be able to call 1 constructor from 1 class using SCS 
		System.out.println("Mentor cons1");
	}
	Mentor2(int a)
	{
		System.out.println("Mentor cons2");
	}
}
class Student extends Mentor2
{
	Student()
	{  //super(100); 
		System.out.println("Student cons");
	}
}
public class Day20_SCS_3 extends Student
{   
	Day20_SCS_3 ()
	{
		System.out.println("Child cons1");
	}
	Day20_SCS_3 (double b)
	{
		System.out.println("Child cons2 with para");
	}

	public static void main(String[] args)
	{
		new Day20_SCS_3 ();
		new Day20_SCS_3(5.79); // We can use either one of this 2 object.
    }
}
