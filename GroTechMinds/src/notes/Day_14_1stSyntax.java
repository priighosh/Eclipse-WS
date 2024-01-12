package notes;
// Final local variable
public class Day_14_1stSyntax 
{

	public static void main(String[] args)
	{
	   final int daysinyear=365;
		// daysinyear=366;  updating value of local static variable not possible because its final
		System.out.println(daysinyear);
	}
}
