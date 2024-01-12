package inheritance;
// for static method Day15 , inheriting from parent
public class Child extends Parent
{
	static void add() // child have this static method inside it
	{
		System.out.println("1");
	}
    public static void main(String[] args) 
    {
	add();   // calling Child's own method
	subtraction(); // calling parent's method
    }
}
