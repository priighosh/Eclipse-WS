package notes;
// call static and non static global variable
public class Day13_Call
{
	int number=100;       //global  non static
	static String name= "India";  //global static
    public static void main(String[] args) 
    {
       System.out.println(name);  //calling static global variable
       Day13_Call d1=new Day13_Call(); // creating an object
       System.out.println(d1.number);  // calling non static global variable
	}
}
