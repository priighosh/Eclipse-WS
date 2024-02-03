package assignments; //Day34, Assign 44
// Using return keyword try to return your name
public class Assign44_ReturnKeyword 
{
	 String Reg ()  //Static method
	{
		String p="Priyanka Ghosh";
		return p;
	}
	 static String Reg(int a) //Non static method
	 {
		 String p="Pri Ghosh";
		 return p;
	 }

	public static void main(String[] args)
	{
		Assign44_ReturnKeyword  a1=new Assign44_ReturnKeyword ();
		System.out.println(a1.Reg());
		System.out.println(Reg(10));
		

	}

}
