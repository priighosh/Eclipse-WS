package inheritance;// Day20, Assign21
// Restrict Inheritance using final keyword, Facts of final keyword
//Create a child and a parent, create a relation between them and after inheriting make the parent class final
final class Papa //after inheriting, making it final=step1
{
	void add()
	{
		System.out.println("addition");
	}
	static void subtract()
	{
		System.out.println("subtration");
	}
}
class Papa2 // extends Papa , Since parent1 papa is final the relation cannon be made so commenting extends=step2
{
	void Mult()
	{
		System.out.println("Multiplication");
	}
	static void Div()
	{
		System.out.println("Division");
	}
}
public class Day20_Restrict_Inheritance extends Papa2 //Child
{
    public static void main(String[] args)
	{
    	Day20_Restrict_Inheritance d1=new Day20_Restrict_Inheritance();
        d1.Mult();
        Div();
        Papa p1=new Papa();// calling final class' methods=step3a
        p1.add();  //non static
        Papa.subtract(); //this is static method of a final class, call it by (ClassName.MethodName)
	}                          
}
