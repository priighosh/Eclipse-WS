package bypriyanka;

public class IIB_withMainMethod
{
	{
		System.out.println("I am IIB");
	}
     public static void main(String[] args)
    {
    	new IIB_withMainMethod();// inside main method whatever we have written or called first will be executed first
        System.out.println("I am main method"); // because no SIB is present here
        new IIB_withMainMethod();
    }
}
