package bypriyanka;

public class StaticBlock 
{
    static   // SIB
    {
    	System.out.println("I am SIB");
    }
	public static void main(String[] args)   // first SIB will be executed then main method, no matter where you have written it
	{
        System.out.println("I am main method");
	}
}
