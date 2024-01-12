package bypriyanka;
public class ConstructorOverloading
{
	ConstructorOverloading()
	{
		System.out.println("hey I am Ist");
	}
	ConstructorOverloading(int a)
	{
	    System.out.println("hey I am 2nd");	
	}
	ConstructorOverloading(int a,double b,char c, String d)
	{
		System.out.println("hey I am 3rd");
	}
  public static void main(String[] args)
  {
	 new ConstructorOverloading(); //We are using 2nd syntax which can only be used in case of constructor
	 new ConstructorOverloading(99);
	 new ConstructorOverloading(); // calling 1st again
	 new ConstructorOverloading(88,7.54,'v',"PG");
	 
  }
}
