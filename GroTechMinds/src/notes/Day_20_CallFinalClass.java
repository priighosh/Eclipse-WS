package notes;
// Create a class with 1SM and 1NSM, make the class as final and call the methods inside main method
class Prii
{
	void div()
	{
		System.out.println("division");
	}
	static void Mult()
	{
		System.out.println("multiplication");
	}
} 
// FINAL class can inherit another class but it can not be inherited
final public class Day_20_CallFinalClass // extends Prii
{  // No use of making child as final so not recommended
	void add()
	{
	System.out.println("addition");
	}
    static void sub()
    {
	System.out.println("subtraction");
    }

	public static void main(String[] args) 
	{
		Day_20_CallFinalClass d1=new Day_20_CallFinalClass();
		d1.add();
		sub();
		Prii p1=new Prii();
		p1.div();
	  //  Mult(); why I am unable to call class Prii's static method? because there's no relation between 2 class
                  // non static can be called despite of no relation because I created an object of that class
	}             // If relation is there both can be called, no need to create separate object of that class.

}
