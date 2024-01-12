package bypriyanka;

public class Blocks_Constructor_Calling // Order of execution between SIB,IIB,Main method,Constructor
{
	Blocks_Constructor_Calling()
	{
		System.out.println("Hi I am Constructor");
	}
    static
    {
    	System.out.println("Hi I am SIB");
    }
    {
    	System.out.println("Hi I am IIB");
    }
    public static void main(String[] args)
	{
        System.out.println("Hi I am main method");
        new Blocks_Constructor_Calling();
        System.out.println("I am main method"); // if there is only IIB present inside main method then also 
	}         // after SIB main method is getting executed because IIB became a part of main method
}
