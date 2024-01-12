package bypriyanka;
public class Addition // creating static method before and after main method and calling them
{
    static void add () //add method
    {    
         System.out.println ("addition");
    }
    public static void main(String[] args)  //main method
	{
	     System.out.println ("I am starting");
	     add ();
	     sub ();
	     System.out.println ("I am ending"); 
	}    
	static void sub ()
	{
		System.out.println ("substraction");  //subtract method
	}
}
