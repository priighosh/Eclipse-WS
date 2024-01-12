package notes;
public class Day13_GTO 
{
    int a=10;            //global
    double b=20;       //global
    String c="Ram";    //global
    
    void studentdetails (int a, double b, String c)  //  a,b,c became local here
    {
    	System.out.println("Output is:");
    	System.out.println(a+b);
    	System.out.println(c);
    }
	public static void main(String[] args)
	{
        Day13_GTO d1= new Day13_GTO();  // calling the non static method by ref variable, both statement printed
        d1.studentdetails(97, 3.1, "Vishnu");
	}

}
