package bypriyanka;

public class NestedIfElse 
{
    public static void main(String[] args)
    {
		int age=21;
		if(age>18) //True So it won't go and check last 'else'
		{
			if (age>65) // false, So 'else' will be printed
			{
				System.out.println("Senior citizen price"); // won't be printed
			}
			else
			{
				System.out.println("Adult price"); // else will be printed
			}
		}
		else
		{
			System.out.println("Half price");
		}
	}
}
