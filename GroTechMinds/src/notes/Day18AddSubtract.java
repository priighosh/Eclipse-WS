package notes; // Single level inheritance
// Day18, This is a method overriding program where child is concrete & parent is abstract
abstract class Arithmetic // Outside world for API selling purpose, Show-casing to 3rd party 
{
	abstract void add();
	abstract void subtract();
}
public class Day18AddSubtract extends Arithmetic // Inside company
{
   public static void main(String[] args)
	{
		Day18AddSubtract d1=new Day18AddSubtract();
		d1.add(); // Child's add
		d1.subtract(); // child's subtract
	}
   // any abstract method has to be overridden in child 
   void add() 
	{
	System.out.println("addition using scanner class");	//added unimplemented methods(2) for writing logic
	}
   void subtract() 
	{
		System.out.println("subtraction using scanner class");		// same
	}
}
