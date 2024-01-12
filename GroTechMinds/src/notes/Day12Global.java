package notes;
// We have only called static variable here:
public class Day12Global 
{
    int a=100; //global
    static boolean b;  //global
    static boolean d=true; //global           blue in color
    String c="India"; //global
    static int z;    // global
    static int manish; // declared globally
    static void add()
    {
                           // The scope of a, b, c is both the method, it can be called in both the method
    }
	public static void main(String[] args)
	{                                       
	manish=87; // declared globally, initialized locally inside other method
	System.out.println(manish); // calling static 
    int u1=876; // local, brown in color, declaration & initialization together
    System.out.println(u1);
    // calling static global variable
    System.out.println(b); //  b is boolean, default value false
    System.out.println(d); // d is = true
    System.out.println(z); // z is int, default value of int=0 
	}

}
