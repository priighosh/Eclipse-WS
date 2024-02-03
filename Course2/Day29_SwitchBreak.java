package notes2;//Day29
// switch case with break and default key-word
public class Day29_SwitchBreak 
{

	public static void main(String[] args)
	{
		switch(1)
		{
			case 1:
				System.out.println("Launch Chrome browser");
				
			case 2:
				System.out.println("Launch Safari browser");
				
			case 3:
				System.out.println("Launch Edge browser");
				//break;
				
			case 4:
				System.out.println("Launch Firefox browser");
				
			case 5:
				System.out.println("No browser");
			//	break;
			
			default:
				System.out.println("This case is not present so default is executing");
		}

	}

}
