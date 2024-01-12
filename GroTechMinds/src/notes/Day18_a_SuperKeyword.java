package notes;//Day17,18
/* DAY18 SUPER KEY_WORD
 Stop method overriding with super keyword,it can call parent's non static method only */
class Day17
{
	void add() // Parent class or super class
	{
		System.out.println("Super class");
	}
}
public class Day18_a_SuperKeyword extends Day17 // Child or sub class
{
    void add() // Child class method which has the control so super keyword can work here, it can call parent
    {
    	super.add(); // calling Parent's method 
	    System.out.println("Sub class"); //Child
	    super.add(); // calling parent's method
    }
	
    public static void main(String[] args) /* Main method is executing d1.add(child) in which first line is of 
    parent's, 2nd line is of child's, 3rd line is again of parent's*/
	{
    	Day18_a_SuperKeyword d1=new Day18_a_SuperKeyword();
		d1.add(); // Child or Sub class method
        // it's(mm) static so can not use super here inside mm and call parent
	}
}
