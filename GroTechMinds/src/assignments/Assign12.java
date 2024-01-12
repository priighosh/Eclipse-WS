package assignments;
//Order of execution
public class Assign12
{
	Assign12 ()     // Constructor1
	    {
		System.out.println("Constructor1");
	    }
	Assign12 (int a, double b, float c, char d, String e) //Constructor2
	    {
		System.out.println("Constructor2");
	    }
	static 
	    {
	    System.out.println("SIB_1"); //SIB1
	    }
	    {
		System.out.println("IIB_1"); //IIB1
	    }
    public static void main(String[] args)
        {
        System.out.println("Main method");
        new Assign12 ();  //calling 2IIB & Constructor1 by 1object because for 2constructors 2objects are needed
        new Assign12 (10, 9.39, 2.25f, 'P', "Prii"); //Object2, calling Constructor2, 2IIB will be called again
	    }
    static
        {
    	System.out.println("SIB_2"); //SIB2
        }
        {
        System.out.println("IIB_2"); //IIB2
        }
}
