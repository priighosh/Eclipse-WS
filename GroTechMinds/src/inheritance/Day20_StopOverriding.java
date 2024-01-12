package inheritance; // Assignment22, METHOD OVERRIDING, SUPER KEY-WORD, POLYMORPHISM , FINAL key-word
//Day20, Stop METHOD OVERRIDDING using final keyword , line5
class Parent1
{
/*final*/ void add1() // if we use final here it cannot be overridden by child,compilation error will arise
	{                                     //So that time child's method name needs to be changed
		System.out.println("add1");
	}
}
public class Day20_StopOverriding extends Parent1
{   
	void add1()
	{
		// super.add1(); //Using super keyword also we can get both the output in overriding concept
		System.out.println("add2");
	}

	public static void main(String[] args)
	{
		Day20_StopOverriding d1=new Day20_StopOverriding();
		d1.add1(); // This is child's add1 method Parent's method has got overridden
		
		//call parent by creating it's object, Concept of POLYMORPHISM
		//based on object creation methods are called
	    Parent1 p1=new Parent1();
		p1.add1();        
	}

}
