package notes;//Day20, prog1
// Super Calling Statement to call constructor of child and parent
//Using this we are able to call multiple constructors with same object
class Mentor 
{
	Mentor()
	{
		System.out.println("Mentor Constructor");
	}
}
public class Day20_SC_Statement extends Mentor
{
    Day20_SC_Statement ()
    {   // Super() is present implicitly, in first line,using it we are calling parent
    	System.out.println("Day20_SC_Statement Constructor");
    }
	public static void main(String[] args) 
	{
		new Day20_SC_Statement(); // 1st line is SCS that's why parent called 1st then child
    }
}
