package package2; // Public class c3 
// C3 can access C1 even if it's in different package because it's (C1) public
import notes2.Day26_AS_ForClass1;

public class Day26_As_ForClass3 extends Day26_AS_ForClass1
{

	public static void main(String[] args) 
	{
		Day26_As_ForClass3 d1=new Day26_As_ForClass3();
		d1.sub();
	

		
		
	// it has to be public in other class from where we are accessing becoz
	// this class is public, NO THIS REASON IS NOT CORRECT,It is happening because of Access Specifier concept

		//when a class is default it can be accessible only within same package
		Day26_defaultClass d2=new Day26_defaultClass();
		d2.add1(); //able to call default class from same package
		Day26_defaultClass.pi();// from default class,same package
	}

}
