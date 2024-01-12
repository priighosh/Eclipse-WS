package assignments;//Day30
//Convert any byte data type into long
public class Assign34 
{
    public static void main(String[] args) 
	{
		byte age = 126;
		long age1=(long) age; //Explicit widening
		System.out.println(age1);
		
		long age2= -127; //implicit way Widening,without declaring separately
		System.out.println(age2);

	}

}
